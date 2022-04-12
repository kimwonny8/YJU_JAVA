package Main;

class Car2 {
	private String color;
	private int speed;
	private int gear;
	
	private int id;
	private static int numberOfCars = 0;
	
	public Car2(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		
		id = ++numberOfCars;
	}
	// 정적 메소드
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
	public String toString() {
		return String.format("%s, %d, %d", color, speed, gear);
	}
}
public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2("blue", 100,1);
		Car2 c2 = new Car2("white", 0,1);
		int n = Car2.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = "+n);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
