class Employee {
    static String companyName = "OpenAI Pvt Ltd";
    static int totalEmployees = 0;

    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    void showDetails() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name + ", ID: " + id + ", Role: " + designation);
        }
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Ayush", 101, "Developer");
        e.showDetails();
        displayTotalEmployees();
    }
}
