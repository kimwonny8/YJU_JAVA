package Main;

class CarArray{
	public int speed;
	public int gear;
	public String color;
	
	public CarArray() {
		speed = 0 ;
		gear = 1;
		color = "red";
	}
	public void speedUp() {
		speed+=10;
	}
	public String toString() {
		return "�ӵ�:"+speed+" ���:"+gear+" ����:"+color;
	}
}

public class CarArrayTest {

	public static void main(String[] args) {
		final int NUM_CARS=5;
		CarArray[] cars = new CarArray[NUM_CARS];
		for(int i=0; i<cars.length; i++) {
			cars[i]=new CarArray();
				cars[i].speedUp();
			System.out.println(cars[i]);
		}
	}

}
