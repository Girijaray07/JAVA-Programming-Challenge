import java.util.Scanner;

class Box
{
    float width;
    float height;
    float depth;

    Box(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;

        calculateVolume();
    }

    float calculateVolume() {
        return width*height*depth;
    }
}

class BoxWeight extends Box
{
    float costPerKM = 20;
    float distanceinKM;
    float volume;

    BoxWeight (float distanceinKM, float width, float height, float depth) {
        super(width, height, depth);

        this.distanceinKM = distanceinKM;
        this.volume = calculateVolume();
    }

    void displayResult() {
        System.out.println("The cost of Transporting Box is: " + costPerKM*distanceinKM*volume);
    }
}

public class TravellingCost
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Width: ");
        float width = input.nextFloat();

        System.out.print("Enter the Height: ");
        float height = input.nextFloat();

        System.out.print("Enter the Depth: ");
        float depth = input.nextFloat();

        System.out.print("Enter the KM: ");
        float distance = input.nextFloat();

        BoxWeight obj = new BoxWeight(distance, width, height, depth);
        obj.displayResult();
    }
}