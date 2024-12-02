Imort java.util.*; 
public class MyPoint 
{
private int x = 0; 
private int y = 0;
public MyPoint()
{
this.x = 0;
this.y = 0;
}
public MyPoint(int x, int y)
{
this.x = x; 
this.y = y;
}
public double distance(int x, int y)
{
int xDiff = this.x - x; 
int yDiff = this.y - y;
return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
}
public double distance(MyPoint another)
{
int xDiff = this.x - another.x; 
int yDiff = this.y - another.y;
return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
} 
public double distance()
{
return Math.sqrt(x * x + y * y);
 }
Object Oriented Programming with JAVA[BCS306A]
public int getX()
{
return x;
}
public void setX(int x)
{
this.x = x;
}
public int getY()
{
return y;
}
public void setY(int y)
{
this.y = y;
}
public void setXY(int x, int y)
{
this.x = x; 
this.y = y;
}
public String toString()
{
return "(" + x + ", " + y + ")";
}
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in); 
System.out.println("Enter Point 1 coordinates: "); 
int x1=scan.nextInt(); 
int y1=scan.nextInt(); 
System.out.println("Enter Point 2 coordinates: "); 
int x2=scan.nextInt(); 
int y2=scan.nextInt(); 
MyPoint point1 = new MyPoint(x1, y1); 
MyPoint point2 = new MyPoint(x2, y2);
System.out.println("Point 1 coordinates: " + point1.toString());
System.out.println("Point 2 coordinates: " + point2.toString());
System.out.println("Distance from Point 1 to ("+x2+", "+y2+"): " +
point1.distance(x2, y2));
System.out.println("Distance from Point 1 to Point 2: " + 
point1.distance(point2));
System.out.println("Distance from Point 1 to the origin: " + 
point1.distance());
}
}