/*
 * Written by Shalin Geddis
 */
class Bicycle {
    // Instance variables
    private String make;
    private Wheel frontWheel;
    private Wheel backWheel;
    private Frame frame;

    // Constructors
    public Bicycle() {
        this.make = "none";
        this.frontWheel = new Wheel();
        this.backWheel = new Wheel();
        this.frame = new Frame();
    }

    public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame) {
        setMake(make);
        setFrontWheel(frontWheel);
        setBackWheel(backWheel);
        setFrame(frame);
    }

    // Accessors and Mutators
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make != null && !make.isEmpty()) {
            this.make = make;
        } else {
            this.make = "none";
        }
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public void setFrontWheel(Wheel frontWheel) {
        if (frontWheel != null) {
            this.frontWheel = frontWheel;
        } else {
            this.frontWheel = new Wheel(); // Set to default Wheel
        }
    }

    public Wheel getBackWheel() {
        return backWheel;
    }

    public void setBackWheel(Wheel backWheel) {
        if (backWheel != null) {
            this.backWheel = backWheel;
        } else {
            this.backWheel = new Wheel(); // Set to default Wheel
        }
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        if (frame != null) {
            this.frame = frame;
        } else {
            this.frame = new Frame(); // Set to default Frame
        }
    }

    // Equals method
    public boolean equals(Bicycle other) {
        return this.make.equalsIgnoreCase(other.getMake()) && this.frontWheel.equals(other.getFrontWheel()) &&
                this.backWheel.equals(other.getBackWheel()) && this.frame.equals(other.getFrame());
    }

    // ToString method
    public String toString() {
        return "[Bicycle] Make: " + make + " Front Wheel: " + frontWheel.toString() +
                " Back Wheel: " + backWheel.toString() + " Frame: " + frame.toString();
    }
}