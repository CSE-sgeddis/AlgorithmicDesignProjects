/*
 * Wriiten by Shalin Geddis
 */
public class PBJSandwich {
	private Bread topSlice;
    private PeanutButter peanutButter;
    private Jelly jelly;
    private Bread bottomSlice;

    // Constructor
    public PBJSandwich() {
        this.topSlice = new Bread();
        this.peanutButter = new PeanutButter();
        this.jelly = new Jelly();
        this.bottomSlice = new Bread();
    }

    // Accessors and Mutators
    public Bread getTopSlice() {
        return topSlice;
    }

    public void setTopSlice(Bread topSlice) {
        if (topSlice != null) {
            this.topSlice = topSlice;
        }
    }

    public PeanutButter getPeanutButter() {
        return peanutButter;
    }

    public void setPeanutButter(PeanutButter peanutButter) {
        if (peanutButter != null) {
            this.peanutButter = peanutButter;
        }
    }

    public Jelly getJelly() {
        return jelly;
    }

    public void setJelly(Jelly jelly) {
        if (jelly != null) {
            this.jelly = jelly;
        }
    }

    public Bread getBottomSlice() {
        return bottomSlice;
    }

    public void setBottomSlice(Bread bottomSlice) {
        if (bottomSlice != null) {
            this.bottomSlice = bottomSlice;
        }
    }

    // Equals method
    public boolean equals(PBJSandwich other) {
        return this.topSlice.equals(other.topSlice) &&
                this.peanutButter.equals(other.peanutButter) &&
                this.jelly.equals(other.jelly) &&
                this.bottomSlice.equals(other.bottomSlice);
    }

    // ToString method
    @Override
    public String toString() {
        return "PBJ Sandwich\n" +
                "Top Slice:\n" + topSlice +
                "Peanut Butter:\n" + peanutButter +
                "Jelly:\n" + jelly +
                "Bottom Slice:\n" + bottomSlice;
    }
}