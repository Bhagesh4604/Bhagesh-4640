package employee.java; // Ensure the package declaration matches the folder structure

import java.util.Scanner; // Import Scanner class

public class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    // Raise salary method
    public void raiseSalary(double percentage) {
        salary += salary * percentage / 100;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee id, Name, and Salary:");
        int id = scan.nextInt();
        scan.nextLine(); // Consume newline
        String name = scan.nextLine();
        double salary = scan.nextDouble();

        Employee e1 = new Employee(id, name, salary);
        e1.display();

        System.out.println("Enter raise percentage:");
        double percentage = scan.nextDouble();
        e1.raiseSalary(percentage);
        e1.display();

        scan.close();
    }
}
