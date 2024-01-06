package program;

public class ThisKeyword {
    private String name;
    private int age;

    // Constructor using 'this' keyword
    public ThisKeyword(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable 'name'
        this.age = age;   // 'this.age' refers to the instance variable 'age'
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + this.name); // Using 'this' to access instance variable 'name'
        System.out.println("Age: " + this.age);   // Using 'this' to access instance variable 'age'
    }

    // Method to compare the ages of two ThisKeyword objects
    public void compareAge(ThisKeyword otherPerson) {
        if (this.age < otherPerson.age) {
            System.out.println(this.name + " is younger than " + otherPerson.name);
        } else if (this.age > otherPerson.age) {
            System.out.println(this.name + " is older than " + otherPerson.name);
        } else {
            System.out.println(this.name + " and " + otherPerson.name + " are of the same age.");
        }
    }

    public static void main(String[] args) {
        // Creating two ThisKeyword objects
        ThisKeyword person1 = new ThisKeyword("Alice", 25);
        ThisKeyword person2 = new ThisKeyword("Bob", 30);

        // Using methods and 'this' keyword
        person1.displayInfo(); // Display information about person1
        person2.displayInfo(); // Display information about person2

        // Comparing ages using the compareAge method
        person1.compareAge(person2); // Comparing ages between person1 and person2
    }
}
