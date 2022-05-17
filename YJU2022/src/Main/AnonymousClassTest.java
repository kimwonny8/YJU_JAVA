package Main;

interface RemoteControl {
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		// 무명 클래스 정의
		RemoteControl ac = new RemoteControl() {
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
		};
		ac.turnOn();
		ac.turnOff();

	}

}
