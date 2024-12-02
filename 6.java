public abstract class Shape 
{
public abstract double calculateArea();
public abstract double calculatePerimeter();
}
class Circle extends Shape 
{
private double radius;
public Circle(double radius)
{
this.radius = radius;
}
public double calculateArea()
{
return Math.PI * Math.pow(radius, 2);
}
public double calculatePerimeter()
{
return 2 * Math.PI * radius;
}
}
class Triangle extends Shape 
{
private double side1, side2, side3;
public Triangle(double side1, double side2, double side3)
{
this.side1 = side1; 
this.side2 = side2; 
this.side3 = side3;
}
public double calculateArea()
{
double s = (side1 + side2 + side3) / 2;
Object Oriented Programming with JAVA[BCS306A]
return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
}
public double calculatePerimeter()
{
return side1 + side2 + side3;
}
}
class Main {
public static void main(String[] args) {
Circle circle = new Circle(5.0);
Triangle triangle = new Triangle(3.0, 4.0, 5.0);
System.out.println("Circle - Area: " + circle.calculateArea()); 
System.out.println("Circle - Perimeter: " +
circle.calculatePerimeter()); 
System.out.println("Triangle - Area: " +
triangle.calculateArea());
System.out.println("Triangle - Perimeter: " + 
triangle.calculatePerimeter());
}
}