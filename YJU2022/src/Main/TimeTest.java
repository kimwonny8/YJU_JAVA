package Main;

class Time {
	private int hour; // 0-23
	private int minute; // 0-59
	private int second; // 0-59
	
	// 첫 번째 생성자
	public Time() {
		this(0,0,0);
	}
	
	// 두 번째 생성자
	public Time(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	// 시간 설정 함수
	public void setTime(int h, int m, int s) {
		hour =((h>=0 && h<24) ? h : 0);
		minute =((m>=0 && m<60) ? m : 0);
		second =((s>=0 && s<60) ? s : 0);
	}
	
	// "시:분:초" 형식 출력, 오버라이딩 개념
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}
	
}

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();

		System.out.print("기본 생성자 호출 후 시간: ");
		System.out.println(t.toString());
		
		// 두 번째 생성자 호출
		Time t2 = new Time(13,27,6);
		System.out.print("두 번째 생성자 호출 후 시간: ");
		System.out.println(t2.toString());
		
		// 올바르지 않은 시간으로 설정해본 후 호출
		Time t3 = new Time(99,66,77);
		System.out.print("올바르지 않은 시간 설정 후 시간: ");
		System.out.println(t3); 
		// toString 없어도 출력됨 => 상속
		// 메소드 toString() 지우면 제대로 출력 안 됨
	}

}
