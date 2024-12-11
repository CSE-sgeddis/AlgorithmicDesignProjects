/*
 * Written by Shalin Geddis
 */
class Vehicle {
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    public Vehicle() {
        this.manufacturerName = "none";
        this.numberOfCylinders = 6;
        this.ownerName = "none";
    }

    public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) {
        this.manufacturerName = (manufacturerName != null) ? manufacturerName : "none";
        this.numberOfCylinders = (numberOfCylinders > 0) ? numberOfCylinders : 6;
        this.ownerName = (ownerName != null) ? ownerName : "none";
    }

    // Accessors and Mutators
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        if (manufacturerName != null) {
            this.manufacturerName = manufacturerName;
        }
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        if (numberOfCylinders > 0) {
            this.numberOfCylinders = numberOfCylinders;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName != null) {
            this.ownerName = ownerName;
        }
    }

    public boolean equals(Vehicle other) {
        return this.manufacturerName.equals(other.manufacturerName) &&
                this.numberOfCylinders == other.numberOfCylinders &&
                this.ownerName.equals(other.ownerName);
    }

    public String toString() {
        return "Manufacturer's Name: " + manufacturerName + "\n" +
                "Number of Cylinders: " + numberOfCylinders + "\n" +
                "Owner's Name: " + ownerName + "\n";
    }
}
