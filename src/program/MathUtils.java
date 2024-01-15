package program;

class MathUtils1 {
    static final double PI = 3.14159;

    static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
}

public class MathUtils {
    public static void main(String[] args) {
        System.out.println("Value of PI: " + MathUtils1.PI);
        System.out.println("Area of circle with radius 5: " + MathUtils1.calculateCircleArea(5));
    }
}
