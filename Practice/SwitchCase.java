import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("What operation do you want to do?: ");
        String op = sc.next();

        switch(op) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if (b==0) {
                    System.out.println("Math Error");
                    break;
                }
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }

        sc.close();
    }
}