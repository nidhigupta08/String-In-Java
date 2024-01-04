package program;
//Superclass
class Animal {
 private String species;

 public Animal(String species) {
     this.species = species;
 }

 public void display() {
     System.out.println("Species: " + species);
 }
}

//Subclass inheriting from Animal
class Dog extends Animal {
 private String breed;

 public Dog(String species, String breed) {
     super(species); // Calling the superclass constructor
     this.breed = breed;
 }

 public void displayDetails() {
     super.display(); // Calling the method from the superclass
     System.out.println("Breed: " + breed);
 }
}
public class KeywordSuper {
	 public static void main(String[] args) {
	        // Creating an object of the subclass
	        Dog myDog = new Dog("Canine", "Labrador");
	        
	        // Using methods from both superclass and subclass
	        myDog.display(); // Calling the method from the superclass
	        myDog.displayDetails(); // Calling the method from the subclass
	    }
}
