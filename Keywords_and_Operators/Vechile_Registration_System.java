class Vehicle {
    static int registrationFee = 1500;

    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    void showDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg No: " + registrationNumber);
        }
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
        System.out.println("Fee updated to ₹" + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Ayush", "Car", "DL-123");
        v.showDetails();
        updateRegistrationFee(2000);
    }
}
