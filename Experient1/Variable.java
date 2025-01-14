public class Variable 
{
    int number;  //instance variable
    public static void main (String args[])
    {
        int num = 10;  //local variable

        Variable T = new Variable();
        
        System.out.println("Local Variable: " + num + "\nInstance Variable: " + T.number);
    }
}