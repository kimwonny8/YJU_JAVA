package Main;

class Car {
	// �ʵ� ����
	private String color;
	private int speed;
	private int gear;
	
	// ������
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	// ������2 
	public Car() {
		color = "default color";
		speed = 10;
		gear = 10;
	}
	
	// this ������
	public Car(String c) {
		this(c,0,1);
	}
	
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	// this.color => �ʵ��� color, �׳� color�� �Ű�����
	
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

public class CarTest1 {

	public static void main(String[] args) {
		// �����ڰ� ��������� ����Ʈ �����ڴ� ��������� �ʱ⶧���� ������
		Car myCar = new Car(); // ��ü ����
		Car yourCar = new Car("Hi",10,2);
		Car test1 = new Car("pink",70,3);
		Car test2 = new Car();
		
		test1.print();
		test2.print();
		
		myCar.setColor("red"); 
		myCar.setSpeed(20);
		myCar.setGear(1);
		//myCat.color="red"; // ��ü�� �ʵ� ����
		//myCar.print(); // ��ü�� �޼ҵ� ȣ��
		System.out.println("����: "+myCar.getColor());
		System.out.println("�ӵ�: "+myCar.getSpeed());
		System.out.println("���: "+myCar.getGear());
		
		System.out.println(yourCar.getColor()==myCar.getColor());
		System.out.println(yourCar.getColor().equals(myCar.getColor()));
		System.out.println(yourCar.equals(myCar));		
		// Ŭ������ �����ǵ� equals�� ���ؾߵ�
		
	}
}
