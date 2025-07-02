class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "OpenAI Academy"; // class variable

    Course(String name, int dur, double f) {
        courseName = name;
        duration = dur;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 5000);
        Course c2 = new Course("Python", 2, 4000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("CyberSec Hub");
        System.out.println("--- After Update ---");
        c1.displayCourseDetails();
    }
}
