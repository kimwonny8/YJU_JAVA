package Main;

class Point {
	private int x,y;
	
	public Point(int a, int b) {
		x=a;
		y=b;
	}
}
class Circle{
	private int radius =0;
	private Point center; // Point 참조 변수가 필드로 선언되어 있음.
	
	public Circle(Point p,int r) {
		center = p;
		radius = r;
	}
}
public class CircleTest {

	public static void main(String[] args) {
		Point p = new Point(25,78);
		Circle c = new Circle(p, 10);
		// Circle 객체를 생성할 때, Point 객체 참조값을 넘긴다.
	}

}
