public class Q19 {
    public static void main(String[] args) {
        int[] m = {78, 86, 91};
        double perc = (m[0] + m[1] + m[2]) / 3.0;
        char grade = perc >= 90 ? 'A' : perc >= 75 ? 'B' : 'C';
        System.out.println("Percentage: " + perc + ", Grade: " + grade);
    }
}
