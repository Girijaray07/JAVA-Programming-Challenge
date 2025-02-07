import java.util.Scanner;

class Employee
{
    String name;
    int yearofJoining;
    int salary;
    String address;

    Employee (String name, int yearofJoining, int salary, String address)
    {
        this.name = name;
        this.yearofJoining = yearofJoining;
        this.salary = salary;
        this.address = address;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int count, choice;
        Employee emp = new Employee("Girija", 2020, 50000, "Pune");

        System.out.println("Select any option below:");
        System.out.println("\t1.Insert new Record");
        System.out.println("\t2.Display Records");
        System.out.print("\nEnter Choice: ");
        choice = input.nextInt();

        switch(choice)
        {
            case 1:
                System.out.print("Enter number of records: ");
                count = input.nextInt();
                for (int i = 0; i < count; i++)
                {
                    System.out.print("Enter Name: ");
                    emp.name = input.next();
                    System.out.print("Enter Year of Joining: ");
                    emp.yearofJoining = input.nextInt();
                    System.out.print("Enter Salary: ");
                    emp.salary = input.nextInt();
                    System.out.print("Enter Address: ");
                    emp.address = input.next();

                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("Displaying Records: ");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        input.close();
    }
}