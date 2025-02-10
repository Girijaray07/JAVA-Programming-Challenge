public class ConstructorWays {
    int number;
    String text;

    ConstructorWays() {
        display();
    }

    ConstructorWays(int num, String txt) {
        this.number = num;
        this.text = txt;
    }

    public void display() {
        System.out.println("Number: " + number + ", Text: " + text);
    }

    public static void main(String[] args) {
        ConstructorWays defaultConstructor = new ConstructorWays();

        ConstructorWays parameterizedConstructor = new ConstructorWays(42, "Hello");
        parameterizedConstructor.display();
    }
}