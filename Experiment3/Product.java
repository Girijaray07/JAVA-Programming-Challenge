public class Product
{
    String pName;
    int pID;
    float Price;
    int quantyStock;

    Product(String pName, int pID, float Price, int quantyStock)
    {
        this.pName = pName;
        this.pID = pID;
        this.Price = Price;
        this.quantyStock = quantyStock;
    }

    public void applyDiscount(float dPert) {
        float discountAmount = (Price * dPert) / 100;
        Price -= discountAmount;
        System.out.println(Price+"\n");
    }

    public void displayProduct() {
        System.out.println("Product Name: " + pName);
        System.out.println("Product ID: " + pID);
        System.out.println("Price: " + Price);
        System.out.println("Quantity in Stock: " + quantyStock);
    }

    public static void main (String args[]) {
        Product prod = new Product("Laptop", 101, 50000, 10);
        prod.displayProduct();
        
        System.out.print("\nApplying 10% discount: ");
        prod.applyDiscount(10);
        
        prod.displayProduct();


        Product prod1 = new Product("PC", 102, 500000, 12);
        prod1.displayProduct();
        
        System.out.print("\nApplying 10% discount: ");
        prod1.applyDiscount(10);
        
        prod1.displayProduct();
    }
}