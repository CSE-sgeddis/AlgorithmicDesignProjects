/*
 * Written by Shalin Geddis
 */
public class Jelly {
	private String name;
    private int calories;
    private String fruitType;

    // Constructor
    public Jelly() {
        this.name = "none";
        this.calories = 50;
        this.fruitType = "Grape";
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
        if (calories >= 50 && calories <= 200) {
            this.calories = calories;
        } else {
            this.calories = 50;
        }
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        if (fruitType.equalsIgnoreCase("Apple") ||
                fruitType.equalsIgnoreCase("Blackberry") ||
                fruitType.equalsIgnoreCase("Grape") ||
                fruitType.equalsIgnoreCase("Blueberry") ||
                fruitType.equalsIgnoreCase("Tomato")) {
            this.fruitType = fruitType;
        } else {
            this.fruitType = "Grape";
        }
    }

    // Equals method
    public boolean equals(Jelly other) {
        return this.name.equalsIgnoreCase(other.name) &&
                this.calories == other.calories &&
                this.fruitType.equalsIgnoreCase(other.fruitType);
    }

    // ToString method
    public String toString() {
        return "Jelly\n" +
                "Name: " + name + "\n" +
                "Calories: " + calories + "\n" +
                "Fruit Type: " + fruitType + "\n";
    }
}
