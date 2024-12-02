public class Mythread implements Runnable 
{
public void run()
{
for (int i = 1; i<= 5; i++)
{
System.out.println(Thread.currentThread().getName()+" i is " + i);
try
{
Thread.sleep(500);
}
catch (InterruptedException e)
{
System.out.println(e.getMessage());
}
}
}
}
class ThreadExample 
{
public static void main(String[] args)
{
Mythread myThread = new Mythread();
Thread t1 =new Thread(myThread);
Thread t2 =new Thread(myThread);
Thread t3 =new Thread(myThread);
t1.start();
t2.start();
t3.start();
}
}