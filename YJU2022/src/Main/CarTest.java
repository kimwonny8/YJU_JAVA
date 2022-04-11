package Main;

class Car {
	// 필드 정의
	private String color;
	private int speed;
	private int gear;
	
	// 생성자
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	// 생성자2 
	public Car() {
		color = "default color";
		speed = 10;
		gear = 10;
	}
	
	// this 생성자
	public Car(String c) {
		this(c,0,1);
	}
	
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
		// 생성자가 만들어지면 디폴트 생성자는 만들어지지 않기때문에 오류남
		Car myCar = new Car(); // 객체 생성
		Car yourCar = new Car("Hi",10,2);
		Car test1 = new Car("pink",70,3);
		Car test2 = new Car();
		
		test1.print();
		test2.print();
		
		myCar.setColor("red"); 
		myCar.setSpeed(20);
		myCar.setGear(1);
		//myCat.color="red"; // 객체의 필드 변경
		//myCar.print(); // 객체의 메소드 호출
		System.out.println("색상: "+myCar.getColor());
		System.out.println("속도: "+myCar.getSpeed());
		System.out.println("기어: "+myCar.getGear());
		
		System.out.println(yourCar.getColor()==myCar.getColor());
		System.out.println(yourCar.getColor().equals(myCar.getColor()));
		System.out.println(yourCar.equals(myCar));		
		// 클래스는 재정의된 equals로 비교해야됨
		
	}
}
