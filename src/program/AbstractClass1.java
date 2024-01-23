package program;

abstract class Animal1{
	public abstract void sound();
	
	public void sound1() {
		System.out.println("meow");
	}
}

//Subclass (inherit from Animal1)
class Pig extends Animal1 {
public void sound() {
 // The body of Sound() is provided here
 System.out.println("The pig says: wee wee");
}
}

public class AbstractClass1 {
public static void main(String[] args) {
	Pig myPig = new Pig(); // Create a Pig object
    myPig.sound();
    myPig.sound1();

}
}
