class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    public void updateSalary(double newSalary) {
        salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    void display() {
        System.out.println("ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + getSalary());
    }

    public static void main(String[] args) {
        Manager m = new Manager(101, "IT", 60000);
        m.updateSalary(70000);
        m.display();
    }
}
