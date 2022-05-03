package Main;

class Shape{
	public Shape() {
		System.out.println("Shape 持失切()");
	}
	public Shape(String msg) {
		System.out.println("Shape 持失切()"+msg);
	}
}

public class Rectangle extends Shape {
	public Rectangle() {
		System.out.println("Rectangle 持失切()");
	}

}

