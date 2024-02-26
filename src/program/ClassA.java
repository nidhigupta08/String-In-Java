package program;

import program.ClassA;

//parameterized constructor
public class ClassA {

	ClassA(int a1, int b1) {

		int a=a1;
		int b=b1;
		System.out.println("Addition of two number is:" + (a+b));
	}
	

	ClassA() {

		 a=25;
		 b=36;
		System.out.println("Addition of two number is:" + (a+b));
	}

	int a;
	int b;

	public static void main(String[] args) {
		ClassA obj1 = new ClassA(40, 30);
		obj1.minus(50, 20);
	}

	public void minus(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("Subtraction of num1-num2 is: " + sub);
	}
}
