package Java0326Example01;

public class Triangle implements Shape {
    private double length;
    private double width;

    public Triangle(){
    }

    public Triangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width / 2;
    }

    @Override
    public double calculatePerimeter() {
        return width * 3;
    }
}
