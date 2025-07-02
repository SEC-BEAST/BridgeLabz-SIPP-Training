class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int r, String n, double c) {
        rollNumber = r;
        name = n;
        CGPA = c;
    }

    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int r, String n, double c) {
        super(r, n, c);
    }

    void display() {
        System.out.println("Roll: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Ayush", 9.2);
        pg.display();
    }
}
