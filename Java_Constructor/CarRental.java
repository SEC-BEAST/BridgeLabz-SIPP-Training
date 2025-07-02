class CarRental {
    String customer;
    int days;

    CarRental(String c, int d) {
        customer = c;
        days = d;
    }

    void show() {
        int cost = days * 1000;
        System.out.println("Customer: " + customer);
        System.out.println("Days: " + days);
        System.out.println("Total Cost: ₹" + cost);
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Ayush", 5);
        cr.show();
    }
}
