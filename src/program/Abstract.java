package program;
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class Abstract {
	 public static void main(String[] args) {
	        Shape circle = new Circle();
	        Shape square = new Square();

	        circle.draw(); // Drawing a circle
	        square.draw(); // Drawing a square
	    }
}
