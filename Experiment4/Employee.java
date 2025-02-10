import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String name;
    int yearofJoining;
    String address;

    Employee(String name, int yearofJoining, String address) {
        this.name = name;
        this.yearofJoining = yearofJoining;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "\t" + yearofJoining + "\t" + address;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        int choice;

        while (true) {
            System.out.println("Select any option below:");
            System.out.println("\t1. Insert new Record");
            System.out.println("\t2. Display Records");
            System.out.print("\nEnter Choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of records: ");
                    int count = input.nextInt();
                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter Name: ");
                        String name = input.next();
                        System.out.print("Enter Year of Joining: ");
                        int yearofJoining = input.nextInt();
                        System.out.print("Enter Address: ");
                        String address = input.next();

                        employees.add(new Employee(name, yearofJoining, address));
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Displaying Records: ");
                    System.out.println("Name\tYear of Joining\tSalary\tAddress");
                    for (Employee emp : employees) {
                        System.out.println(emp.name + "\t" + emp.yearofJoining + "\t" + emp.address);
                    }
                    System.out.println();
                    input.close();
                    return;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}