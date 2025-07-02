class Vehicle {
    String ownerName;
    String vehicleType;
    static int registrationFee = 1000;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: ₹" + registrationFee);
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ayush", "Car");
        Vehicle v2 = new Vehicle("Raj", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1500);
        System.out.println("--- Updated Fee ---");
        v1.displayVehicleDetails();
    }
}
