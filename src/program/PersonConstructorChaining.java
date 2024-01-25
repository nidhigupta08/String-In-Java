package program;

public class PersonConstructorChaining {
	private String name;
    private int age;

    // Parameterized constructor
    public PersonConstructorChaining(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with default values, chaining the parameterized constructor
    public PersonConstructorChaining() {
        this("John Doe", 25); // Default name: "John Doe", default age: 25
    }

    // Constructor with only name, chaining the parameterized constructor
    public PersonConstructorChaining(String name) {
        this(name, 25); // Set the provided name, default age: 25
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
    	PersonConstructorChaining person1 = new PersonConstructorChaining("Alice", 30);
    	PersonConstructorChaining person2 = new PersonConstructorChaining(); // Uses default values
    	PersonConstructorChaining person3 = new PersonConstructorChaining("Bob"); // Sets name, uses default age

        // Displaying information
        System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge() + " years old");
        System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge() + " years old");
        System.out.println("Person 3: " + person3.getName() + ", " + person3.getAge() + " years old");
    }
}
