package Java0326Example01;

public class Rectangle implements Shape {
    private double length;
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}