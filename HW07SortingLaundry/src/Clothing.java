/*
 * Written by Shalin Geddis
 */

import java.util.Arrays;

class Clothing {
    private String type;
    private String color;

    // Constructors
    public Clothing() {
        this.type = "Socks";
        this.color = "Black";
    }

    public Clothing(String type, String color) {
        setType(type);
        setColor(color);
    }

    // Accessors
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    // Mutators
    public void setType(String type) {
        String[] validTypes = {"Undergarment", "Socks", "Stockings", "Top", "Bottom", "Cape"};
        if (Arrays.asList(validTypes).contains(type))
            this.type = type;
        else
            this.type = "Socks"; // Default value
    }

    public void setColor(String color) {
        String[] validColors = {"Brown", "Red", "Pink", "Black", "White", "Orange", "Green", "Blue", "Purple", "Grey"};
        if (Arrays.asList(validColors).contains(color))
            this.color = color;
        else
            this.color = "Black"; // Default value
    }

    // toString method
    public String toString() {
        return "[Clothing] Type: " + type + " Color: " + color;
    }

    // Equals method
    public boolean equals(Clothing other) {
        return this.type.equals(other.type) && this.color.equals(other.color);
    }
}
