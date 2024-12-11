/*
 * Written by Shalin Geddis
 */
class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;

    public Truck() {
        super();
        this.loadCapacity = 1.0;
        this.towingCapacity = 1.0;
    }

    public Truck(String manufacturerName, int numberOfCylinders, String ownerName, double loadCapacity, double towingCapacity) {
        super(manufacturerName, numberOfCylinders, ownerName);
        this.loadCapacity = (loadCapacity >= 0) ? loadCapacity : 1.0;
        this.towingCapacity = (towingCapacity >= 0) ? towingCapacity : 1.0;
    }

    // Accessors and Mutators
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity >= 0) {
            this.loadCapacity = loadCapacity;
        }
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity >= 0) {
            this.towingCapacity = towingCapacity;
        }
    }

    public boolean equals(Truck other) {
        return super.equals(other) &&
                this.loadCapacity == other.loadCapacity &&
                this.towingCapacity == other.towingCapacity;
    }

    public String toString() {
        return super.toString() +
                "Towing Capacity: " + towingCapacity + "\n" +
                "Load Capacity: " + loadCapacity + "\n";
    }
}