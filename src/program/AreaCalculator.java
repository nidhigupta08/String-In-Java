package program;

public class AreaCalculator {
    
    // Method to calculate area of a square
    public double calculateArea1(double side) {
        return side * side;
    }
    
    // Overloaded method to calculate area of a rectangle
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    
    // Overloaded method to calculate area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        
        double squareArea = calculator.calculateArea1(5.0);
        double rectangleArea = calculator.calculateArea(4.0, 6.0);
        double circleArea = calculator.calculateArea1(3.0);
        
        System.out.println("Area of square: " + squareArea);
        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of circle: " + circleArea);
    }
}
