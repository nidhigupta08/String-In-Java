package program;

//Define an interface named Calculator
interface Calculator1 {
 // Abstract methods to be implemented by classes that implement this interface
 double add(double num1, double num2);
 double subtract(double num1, double num2);
 double multiply(double num1, double num2);
 double divide(double num1, double num2);
}

//Create a class named BasicCalculator that implements the Calculator interface
class BasicCalculator implements Calculator1 {
 @Override
 public double add(double num1, double num2) {
     return num1 + num2;
 }

 @Override
 public double subtract(double num1, double num2) {
     return num1 - num2;
 }

 @Override
 public double multiply(double num1, double num2) {
     return num1 * num2;
 }

 @Override
 public double divide(double num1, double num2) {
     // Check if the divisor is not zero before performing division
     if (num2 != 0) {
         return num1 / num2;
     } else {
         System.out.println("Cannot divide by zero.");
         return Double.NaN; // NaN (Not a Number) represents an undefined or unrepresentable value
     }
 }
}

//Main class to test the BasicCalculator
public class InterfaceExample {
 public static void main(String[] args) {
     // Create an instance of BasicCalculator
     BasicCalculator calculator = new BasicCalculator();

     // Perform calculations using the implemented interface methods
     System.out.println("Addition: " + calculator.add(10, 5));
     System.out.println("Subtraction: " + calculator.subtract(10, 5));
     System.out.println("Multiplication: " + calculator.multiply(10, 5));
     System.out.println("Division: " + calculator.divide(10, 5));
     System.out.println("Division by zero: " + calculator.divide(10, 0));
 }
}
