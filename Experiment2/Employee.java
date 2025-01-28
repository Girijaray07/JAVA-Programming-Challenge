import java.util.Scanner;

public class Employee
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Employee " + i + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Designation: ");
            String designation = scanner.nextLine();
            System.out.println("\nEmployee " + i + " Details:");
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("Designation: " + designation);
        }
        scanner.close();
    }
}