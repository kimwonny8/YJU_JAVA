package wd2a;

abstract class Shape {
	int x, y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
};

class Rectangle extends Shape{
	int width, height;
	public void draw() {
		move(200,200);
		System.out.println("�簢�� �׸��� �޼ҵ� ");
	}
};

class Circle extends Shape {
	int radius; 
	public void draw() {
		System.out.println("�� �׸��� �޼ҵ� ");
	}
};

public class abstractTest {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		Shape myS = new Rectangle();
		c1.draw();
		r1.draw();
		myS.draw();

	}

}