public class Q10 {
    public static void main(String[] args) {
        try {
            String text = "hello";
            String sub = text.substring(4, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e);
        }
    }
}
