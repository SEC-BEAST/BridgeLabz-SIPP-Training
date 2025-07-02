class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;

    final int rollNumber;
    String name, grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    void display() {
        if (this instanceof Student) {
            System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + grade);
        }
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student s = new Student("Ayush", 1, "A");
        s.display();
        displayTotalStudents();
    }
}
