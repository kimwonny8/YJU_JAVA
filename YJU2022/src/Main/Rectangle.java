package Main;

class Shape{
	public Shape() {
		System.out.println("Shape ������()");
	}
	public Shape(String msg) {
		System.out.println("Shape ������()"+msg);
	}
}

public class Rectangle extends Shape {
	public Rectangle() {
		System.out.println("Rectangle ������()");
	}

}

