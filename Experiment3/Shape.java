class Shape {
    String shapeType;
    float dimension1;
    float dimension2;

    public Shape(String shapeType, float dimension1, float dimension2) {
        this.shapeType = shapeType;
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double calArea() {
        if (shapeType == "Rectangle") {
            return dimension1 * dimension2;
        } else if (shapeType == "Circle") {
            return Math.PI * dimension1 * dimension1;
        }
        return 0;
    }

    public double calPerimeter() {
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return 2 * (dimension1 + dimension2); 
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return 2 * Math.PI * dimension1;
        }
        return 0;
    }

    public void displayDetails() {
        System.out.println("\nShape: " + shapeType);
        System.out.println("Area: " + calArea());
        System.out.println("Perimeter: " + calPerimeter());
    }

    public static void main(String[] args) {
        Shape rectangle = new Shape("Rectangle", 10, 5);
        rectangle.displayDetails();

        Shape circle = new Shape("Circle", 7, 0);
        circle.displayDetails();
    }
}
