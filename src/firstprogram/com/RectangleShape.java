package firstprogram.com;

public class RectangleShape {
    private double length;
    private double breadth;

    // Non-parameterized constructor
    public RectangleShape() {
        this.length = 0;
        this.breadth = 0;
    }

    // Parameterized constructor
    public RectangleShape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for breadth
    public double getBreadth() {
        return breadth;
    }

    // Setter for breadth
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
