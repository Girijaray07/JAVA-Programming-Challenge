public class InvoiceItem {
    String id;
    String description;
    int quantity;
    double unitPrice;

    public InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return quantity * unitPrice;
    }

    public double applyDiscount(double discountPercentage) {
        return getTotal() * (1 - discountPercentage / 100);
    }

    public double applyTax(double taxPercentage) {
        return getTotal() * (1 + taxPercentage / 100);
    }

    public void displayInvoice() {
        System.out.println("Invoice Item:");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total: $" + getTotal());
    }

    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem("001", "Laptop", 2, 750.00);
        item.displayInvoice();
        System.out.println("Total after 10% discount: $" + item.applyDiscount(10));
        System.out.println("Total after 8% tax: $" + item.applyTax(8));
    }
}