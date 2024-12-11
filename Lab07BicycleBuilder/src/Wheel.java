/*
 * Written by Shalin Geddis
 */
public class Wheel {
	// Instance variables
    private double diameter;
    private double width;

    // Constructors
    public Wheel() {
        this.diameter = 16.0;
        this.width = 1.0;
    }

    public Wheel(double diameter, double width) {
        setDiameter(diameter);
        setWidth(width);
    }

    // Accessors and Mutators
    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (diameter >= 16 && diameter <= 55) {
            this.diameter = diameter;
        } else {
            this.diameter = 16;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 1 && width <= 2.5) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    // Equals method
    public boolean equals(Wheel other) {
        return this.diameter == other.getDiameter() && this.width == other.getWidth();
    }

    // ToString method
    public String toString() {
        return "[Wheel] Diameter: " + diameter + " Width: " + width;
    }
}
