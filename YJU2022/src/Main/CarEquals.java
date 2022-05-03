package Main;

class Car {
	private String model;
	public Car(String model) {
		this.model=model;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Car)
			return model.equals(((Car) obj).model);
		else return false;
	}
	
	// Object�� �޼ҵ��� public String toString() ������
	// ���������� ������ �ν��Ͻ��� ����
	public String toString() {
		return "�𵨸�: "+ this.model;
	}
}

public class CarEquals {

	public static void main(String[] args) {
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
		if(firstCar.equals(secondCar))
			System.out.println("������ ������ �ڵ����Դϴ�.");
		else System.out.println("������ ������ ���� �ƴմϴ�.");
		
		System.out.println(firstCar.toString());
		System.out.println(secondCar.toString());
	}

}
