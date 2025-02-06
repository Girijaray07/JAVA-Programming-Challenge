public class CountObject
{
    static int objectCount = 0;

    CountObject() {
        objectCount++;
    }

    static int getObjectCount() {
        return objectCount;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        CountObject obj1 = new CountObject();
        CountObject obj2 = new CountObject();
        CountObject obj3 = new CountObject();

        System.out.println("Number of objects created: " + CountObject.getObjectCount());
    }
}