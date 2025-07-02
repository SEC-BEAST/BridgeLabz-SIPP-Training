class Product {
    static double discount = 10.0; // percent

    final String productID;
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    void display() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + ", Price: ₹" + price + ", Qty: " + quantity);
        }
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 50000, 1, "P123");
        p.display();
        updateDiscount(15);
    }
}
