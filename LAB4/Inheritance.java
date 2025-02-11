class Inheritance
{
    int num;
    String name;

    Inheritance (String name, int num) {
        this.name = name;
        this.num = num;
    }

    void display () {
        System.out.printf("Name: %s \nNum: %d", name, num);
    }

    public static void main(String args[])
    {
        Inheritance obj = new Inheritance("Girija", 30);

        System.out.println(obj.getClass());
        obj.display();
    }
}