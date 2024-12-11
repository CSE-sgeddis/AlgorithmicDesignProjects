/*
 * Written by Shalin Geddis
 */
class Car extends Vehicle {
    private double gasMileage;
    private int numberOfPassengers;

    public Car() {
        super();
        this.gasMileage = 1.0;
        this.numberOfPassengers = 1;
    }

    public Car(String manufacturerName, int numberOfCylinders, String ownerName, double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownerName);
        this.gasMileage = (gasMileage >= 0) ? gasMileage : 1.0;
        this.numberOfPassengers = (numberOfPassengers >= 0) ? numberOfPassengers : 1;
    }

    // Accessors and Mutators
    public double getGasMileage() {
        return gasMileage;
    }

    public void setGasMileage(double gasMileage) {
        if (gasMileage >= 0) {
            this.gasMileage = gasMileage;
        }
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers >= 0) {
            this.numberOfPassengers = numberOfPassengers;
        }
    }

    public boolean equals(Car other) {
        return super.equals(other) &&
                this.gasMileage == other.gasMileage &&
                this.numberOfPassengers == other.numberOfPassengers;
    }

    public String toString() {
        return super.toString() +
                "Gas Mileage: " + gasMileage + "\n" +
                "Number of Passengers: " + numberOfPassengers + "\n";
    }
}
