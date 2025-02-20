class Parent {
    protected int protectedVar = 10; 

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Accessing Protected Variable: " + protectedVar);
        protectedMethod();
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}