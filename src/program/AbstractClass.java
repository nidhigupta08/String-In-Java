package program;

abstract class Shape1 {
    abstract double calculateArea();
}

class Rectangle extends Shape1 {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle1 extends Shape1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClass {
	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle1 circle = new Circle1(7);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
