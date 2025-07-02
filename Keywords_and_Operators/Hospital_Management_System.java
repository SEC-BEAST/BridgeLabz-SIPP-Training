class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    void display() {
        if (this instanceof Patient) {
            System.out.println("Patient: " + name + ", Age: " + age + ", Ailment: " + ailment + ", ID: " + patientID);
        }
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public static void main(String[] args) {
        Patient p = new Patient("Ayush", 22, "Fever", 1001);
        p.display();
        getTotalPatients();
    }
}
