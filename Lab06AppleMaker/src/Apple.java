/* 
 * Written by Shalin Geddis
 */
// Apple class representing different types of apples
public class Apple {
    private String type;
    private double weight;
    private double price;

    public Apple() {
        this.type = "Gala";
        this.weight = 0.0;
        this.price = 0.0;
    }

    public Apple(String type, double weight, double price) {
        if (type.equals("Red Delicious") || type.equals("Golden Delicious") || type.equals("Gala") || type.equals("Granny Smith")) {
            this.type = type;
        } else {
            this.type = "Gala"; 
        }

        if (weight >= 0 && weight <= 2) {
            this.weight = weight;
        } else {
            this.weight = 0.0; 
        }

        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0.0; 
        }
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        if (type.equals("Red Delicious") || type.equals("Golden Delicious") || type.equals("Gala") || type.equals("Granny Smith")) {
            this.type = type;
        } else {
            this.type = "Gala"; 
        }
    }

    public void setWeight(double weight) {
        if (weight >= 0 && weight <= 2) {
            this.weight = weight;
        } else {
            this.weight = 0.0;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0.0; 
        }
    }

    public String toString() {
        return "Type: " + type + " Weight: " + weight + " Price: " + price;
    }

    public boolean equals(Apple other) {
        return this.type.equals(other.getType()) && this.weight == other.getWeight() && this.price == other.getPrice();
    }
}