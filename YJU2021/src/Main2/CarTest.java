package Main2;

class car{
	int speed;
	int rotate;
	boolean onOff;
	
	void print() {
		if (onOff) System.out.println ("현재 속도는 "+speed+"입니다.");
		else System.out.println("시동이 꺼져있습니다."); 
	}
	
	car(int a, boolean b) { //인수가 넘어올 때
		speed=a;
		onOff=b;
	}
	car() {} //인수가 안넘어올 때
}

public class CarTest {

	public static void main(String[] args) {
		car redCar = new car(100,true);
		redCar.print();
	}

}
