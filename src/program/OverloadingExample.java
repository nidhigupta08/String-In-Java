package program;

public class OverloadingExample {
    
    // Method with the same name but different parameters
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method with the same name but different parameters
    public double add(double a, double b) {
        return a + b;
    }
    
    // Another overloaded method
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        
        // Calling the methods with different parameter lists
        int sum1 = obj.add(10, 20);
        double sum2 = obj.add(10.5, 20.7);
        int sum3 = obj.add(5, 10, 15);
        
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}
