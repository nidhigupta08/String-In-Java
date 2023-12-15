package program;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lengths of the triangle sides:");
        System.out.print("Side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Side 3: ");
        int side3 = scanner.nextInt();

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("These sides cannot form a triangle.");
        } else {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        }

        scanner.close();
    }
}

