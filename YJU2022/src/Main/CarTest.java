package Main;

class Car {
	//필드 정의
	private String color;
	private int speed;
	private int gear;
	
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	// this.color => 필드의 color, 그냥 color는 매개변수
	
	public int getSpeed() {	return speed; }
	public void setSpeed(int speed) { 
		if(speed<0) this.speed=0; 
		else this.speed = speed; 
		}
	
	public int getGear() { return gear; }
	public void setGear(int gear) {	this.gear = gear; }

	void print() {
		System.out.println(color+", "+speed+", "+gear);
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car(); // 객체 생성
		
		myCar.setColor("red"); 
		myCar.setSpeed(20);
		myCar.setGear(1);
		//myCat.color="red"; // 객체의 필드 변경
		//myCar.print(); // 객체의 메소드 호출
		System.out.println("색상: "+myCar.getColor());
		System.out.println("속도: "+myCar.getSpeed());
		System.out.println("기어: "+myCar.getGear());
		
		Car yourCar = new Car();
		yourCar.setColor("red"); 
		yourCar.setSpeed(20);
		yourCar.setGear(1);
		yourCar.print();
		
		System.out.println(yourCar.getColor()==myCar.getColor());
		System.out.println(yourCar.getColor().equals(myCar.getColor()));
		System.out.println(yourCar.equals(myCar));
		// 클래스는 재정의된 equals로 비교해야됨
		
//		System.out.println(yourCar==myCar);
//		yourCar=myCar;
//		System.out.println(yourCar==myCar);
	}
}
