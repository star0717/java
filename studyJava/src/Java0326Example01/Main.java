package Java0326Example01;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 3);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        Circle circle = new Circle(5);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());


        System.out.println();
        Triangle triangle = new Triangle(5,4);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}