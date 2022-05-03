package Main;

class Car0 {
	int speed;
	int gear;
	public String color;
	
	public void speedUp(int increment) {
		speed+=increment;
	}
	public void speedDown(int decrement) {
		speed-=decrement;
	}
}

class SportsCar extends Car0{
	boolean turbo;
	
	public void setTurbo(boolean value) {
		turbo=value;
	}
	public void print() {
		System.out.printf("%d, %d, %s, %b", speed, gear, color, turbo);
	}
}
// 하나의 파일엔 public 클래스는 한개, main 메소드에 있는 class에 public 붙일 것
public class Test1{		
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.color="red";
		c.speedUp(100);
		c.speedDown(30);
		c.setTurbo(true);
		//c.print();
		
		Car0 obj=new Car0();
		System.out.println("obj is of type "+obj.getClass().getName());

	}

}
