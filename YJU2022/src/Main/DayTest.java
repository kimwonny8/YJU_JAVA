package Main;

//상수가 정의된 인터페이스
// 상수는 대개 정적 변수로 선언됨
interface Days {
	public static final int SUNDAY=1, MONDAY=2, TUESDAY=3,
			WENDESDAY=4, THURSDAY=5, FRIDAY=6, SATURDAY=7;
}

public class DayTest implements Days {
	public static void main(String[] args) {
		System.out.println("일요일: "+SUNDAY);
	}
}
