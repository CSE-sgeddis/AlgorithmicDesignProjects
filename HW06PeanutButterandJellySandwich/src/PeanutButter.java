/*
 * Written by Shalin Geddis
 */
public class PeanutButter {
	 private String name;
	    private int calories;
	    private boolean isCrunchy;

	    // Constructor
	    public PeanutButter() {
	        this.name = "none";
	        this.calories = 100;
	        this.isCrunchy = false;
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
	        if (calories >= 100 && calories <= 300) {
	            this.calories = calories;
	        } else {
	            this.calories = 100;
	        }
	    }

	    public boolean isCrunchy() {
	        return isCrunchy;
	    }

	    public void setCrunchy(boolean crunchy) {
	        this.isCrunchy = crunchy;
	    }

	    // Equals method
	    public boolean equals(PeanutButter other) {
	        return this.name.equalsIgnoreCase(other.name) &&
	                this.calories == other.calories &&
	                this.isCrunchy == other.isCrunchy;
	    }

	    // ToString method
	    public String toString() {
	        return "Peanut Butter\n" +
	                "Name: " + name + "\n" +
	                "Calories: " + calories + "\n" +
	                "Is Crunchy: " + isCrunchy + "\n";
	    }
	}