class Circle {
    double radius;

    Circle() {
        this(1.0); // calls parameterized constructor
    }

    Circle(double r) {
        radius = r;
    }

    void show() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();     // default
        Circle c2 = new Circle(5.5);  // parameterized

        c1.show();
        System.out.println("-----");
        c2.show();
    }
}
