import java.util.Scanner;

class AreaCircumferenceCircle
{
    void PrintAreaCircumferenceCircle(float radius)
    {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args)
    {
        AreaCircumferenceCircle obj = new AreaCircumferenceCircle();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int num = input.nextInt();
        
        obj.PrintAreaCircumferenceCircle(num);
        
        input.close();
    }
}