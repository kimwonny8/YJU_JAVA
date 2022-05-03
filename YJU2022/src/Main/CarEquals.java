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
	
	// Object의 메소드인 public String toString() 재정의
	// 재정의하지 않으면 인스턴스가 나옴
	public String toString() {
		return "모델명: "+ this.model;
	}
}

public class CarEquals {

	public static void main(String[] args) {
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
		if(firstCar.equals(secondCar))
			System.out.println("동일한 종류의 자동차입니다.");
		else System.out.println("동일한 종류의 차가 아닙니다.");
		
		System.out.println(firstCar.toString());
		System.out.println(secondCar.toString());
	}

}
