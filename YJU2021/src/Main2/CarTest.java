package Main2;

class car{
	int speed;
	int rotate;
	boolean onOff;
	
	void print() {
		if (onOff) System.out.println ("���� �ӵ��� "+speed+"�Դϴ�.");
		else System.out.println("�õ��� �����ֽ��ϴ�."); 
	}
	
	car(int a, boolean b) { //�μ��� �Ѿ�� ��
		speed=a;
		onOff=b;
	}
	car() {} //�μ��� �ȳѾ�� ��
}

public class CarTest {

	public static void main(String[] args) {
		car redCar = new car(100,true);
		redCar.print();
	}

}
