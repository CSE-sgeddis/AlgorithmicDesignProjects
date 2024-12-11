/*
 * Written by Shalin Geddis
 */
public class Bread {
	private String name;
    private int calories;
    private String type;

    // Constructor
    public Bread() {
        this.name = "none";
        this.calories = 50;
        this.type = "Whole Grain";
    }

    // Accessors and Mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "none";
        }
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories >= 50 && calories <= 250) {
            this.calories = calories;
        } else {
            this.calories = 50;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equalsIgnoreCase("Honey Wheat") ||
                type.equalsIgnoreCase("White") ||
                type.equalsIgnoreCase("Whole Grain") ||
                type.equalsIgnoreCase("Whole Wheat")) {
            this.type = type;
        } else {
            this.type = "Whole Grain";
        }
    }

    // Equals method
    public boolean equals(Bread other) {
        return this.name.equalsIgnoreCase(other.name) &&
                this.calories == other.calories &&
                this.type.equalsIgnoreCase(other.type);
    }

    // ToString method
    public String toString() {
        return "Bread\n" +
                "Name: " + name + "\n" +
                "Calories: " + calories + "\n" +
                "Type: " + type + "\n";
    }
}

