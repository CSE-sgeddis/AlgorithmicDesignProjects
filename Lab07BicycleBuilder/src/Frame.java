/*
 * Written by Shalin Geddis
 */
public class Frame {
	// Instance variables
    private double size;
    private String type;

    // Constructors
    public Frame() {
        this.size = 18.5;
        this.type = "Diamond";
    }

    public Frame(double size, String type) {
        setSize(size);
        setType(type);
    }

    // Accessors and Mutators
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size >= 18.5 && size <= 60) {
            this.size = size;
        } else {
            this.size = 18.5;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("Diamond") || type.equals("Step-Through") || type.equals("Truss") || type.equals("Penny-Farthing")) {
            this.type = type;
        } else {
            this.type = "Diamond";
        }
    }

    // Equals method
    public boolean equals(Frame other) {
        return this.size == other.getSize() && this.type.equals(other.getType());
    }

    // ToString method
    public String toString() {
        return "[Frame] Size: " + size + " Type: " + type;
    }
}
