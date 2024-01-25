package program;

public class ConstructorChaining {
	private int value;

    // Constructor with parameter
    public ConstructorChaining(int value) {
        this.value = value;
    }

    // Default constructor that calls the parameterized constructor with a default value
    public ConstructorChaining() {
        this(42); // Calls the parameterized constructor with a default value of 42
    }

    public int getValue() {
        return value;
    }
	public static void main(String[] args) {
		ConstructorChaining obj1 = new ConstructorChaining(10);
        System.out.println(obj1.getValue()); // Output: 10

        ConstructorChaining obj2 = new ConstructorChaining();
        System.out.println(obj2.getValue()); // Output: 42 (default value from constructor chaining)
    }
}
