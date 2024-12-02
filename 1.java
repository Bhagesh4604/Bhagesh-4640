import java.util.Scanner; 
public class Add 
{
public static void main(String[] args)
{ 
 if (args.length != 1) 
 { 
 System.out.println("Usage: java MatrixAddition <order_M_N>"); 
 return; 
 }
int m, n; 
Scanner scan = new Scanner(System.in); 
m = Integer.parseInt(args[0]);
n = Integer.parseInt(args[1]); 
int a[][] = new int[m][n]; 
int b[][] = new int[m][n]; 
int c[][] = new int[m][n]; 
System.out.println("Enter all the elements of first matrix:"); 
for (int i = 0; i < m; i++)
{
for (int j = 0; j < n; j++)
{
a[i][j] = scan.nextInt();
}
}
System.out.println("");
System.out.println("Enter all the elements of second matrix:"); 
for (int i = 0; i < m; i++)
{
for (int j = 0; j < n; j++)
{
b[i][j] = scan.nextInt();
}
}
Object Oriented Programming with JAVA[BCS306A]
for (int i = 0; i < m; i++)
{
for (int j = 0; j < n; j++)
{
c[i][j] = a[i][j] + b[i][j];
}
}
System.out.println("Matrix after addition:"); 
for (int i = 0; i < m; i++)
{
for (int j = 0; j < n; j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println("");
}
}
}