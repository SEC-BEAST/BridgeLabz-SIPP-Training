public class Q1 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob"};
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e);
        }
    }
}
