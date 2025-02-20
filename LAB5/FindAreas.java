class Shape {
    float length;
    float breadth;

    Shape(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(float length) {
        this.length = length;
        this.breadth = length;
    }

    float displayResult() {
        return length * breadth;
    }
}

public class FindAreas extends Shape {
    FindAreas(float length, float breadth) {
        super(length, breadth);
    }

    FindAreas(float length) {
        super(length);
    }

    void printArea() {
        System.out.printf("%.2f\n", displayResult());
    }

    public static void main(String[] args) {
        FindAreas obj = new FindAreas(20);
        System.out.print("Area of Square is: ");
        obj.printArea();

        FindAreas obj1 = new FindAreas(20, 30);
        System.out.print("Area of Rectangle is: ");
        obj1.printArea();
    }
}
