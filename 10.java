package mypack; 
public class MyClass 
{
public void display()
{
System.out.println("This is a method from the mypack package!");
}
}
Example.java
import mypack.MyClass; 
public class Example 
{
public static void main(String[] args)
{
MyClass obj = new MyClass();
obj.display(); 
}
}