package Main;

class Car {
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

class SportsCar extends Car{
	boolean turbo;
	
	public void setTurbo(boolean value) {
		turbo=value;
	}
	public void print() {
		System.out.printf("%d, %d, %s, %b", speed, gear, color, turbo);
	}
}
// �ϳ��� ���Ͽ� public Ŭ������ �Ѱ�, main �޼ҵ忡 �ִ� class�� public ���� ��
public class Test1{		
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.color="red";
		c.speedUp(100);
		c.speedDown(30);
		c.setTurbo(true);
		c.print();

	}

}
