package program;

class Animall {
    String name;

    public Animall(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog1 extends Animall {
    public Dog1(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}

public class IS_A_relationship {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1("Buddy");

        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        myDog.bark();   // Specific to Dog
    }
}
