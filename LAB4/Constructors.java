class A {
    public A() {
        System.out.println("Constructor of Class A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Constructor of Class B");
    }
}

class C extends B {
    public C() {
        super();
        System.out.println("Constructor of Class C");
    }
}

public class Constructors {
    public static void main(String[] args) {
        C obj = new C();
    }
}