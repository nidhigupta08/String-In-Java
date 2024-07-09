package program;

import java.util.ArrayList;
import java.util.Collections;

public class Extend {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("carrot");
        vegetables.add("potato");

        System.out.println("Original fruits list: " + fruits);
        System.out.println("Original vegetables list: " + vegetables);

        // Combine fruits and vegetables using extend (addAll)
        fruits.addAll(vegetables);

        System.out.println("Combined list using extend (addAll): " + fruits);
    }
}