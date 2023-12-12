package program;
public class BasicInheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Inherited method from Animal class
        dog.bark();  // Dog-specific method
    }

    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        public void bark() {
            System.out.println("Dog barks");
        }
    }
}
