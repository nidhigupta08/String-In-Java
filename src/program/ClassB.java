package program;

import program.ClassA;
import program.ClassB;

public class ClassB {

	// constructor - constructs object
	// Use - create object, initialize variables, call super constructor

	// signature of constructor
	
	ClassB() {
		//System.out.println("I am in default ka bhai but not the default");
		age = 23;
		name = "Nidhi";
	}

	ClassB(int age, String name) {		
		this.age = age;
		this.name = name;
	}
	
	
	 int age;
	 String name;

	public static void main(String[] args) {
		
		ClassB b = new ClassB(); //default
        ClassB second = new ClassB();
		
		
		ClassB bc = new ClassB(54, "Chandan"); // parameterized constructor		
		ClassB bc1 = new ClassB(64, "Nidhi"); 
		
        System.out.println("Age is : " + b.age);
        System.out.println("Name is : " + b.name);
          	
        System.out.println("Age is : " + bc.age);
        System.out.println("Name is : " + bc.name);
        
        ClassA cls = new ClassA(56, 14);
                             
	}

	public void method01() {

	}

}
