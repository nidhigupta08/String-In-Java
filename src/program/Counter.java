package program;

class Counter1 {
    static int count;

    static {
        count = 0; // Initialize count to 0 when the class is loaded
    }

    static void increment() {
        count++;
    }
}

public class Counter {
    public static void main(String[] args) {
        Counter1.increment();
        Counter1.increment();
        System.out.println("Count: " + Counter1.count);  // Output: Count: 2
    }
}