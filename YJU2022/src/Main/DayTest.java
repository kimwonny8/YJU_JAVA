package Main;

//����� ���ǵ� �������̽�
// ����� �밳 ���� ������ �����
interface Days {
	public static final int SUNDAY=1, MONDAY=2, TUESDAY=3,
			WENDESDAY=4, THURSDAY=5, FRIDAY=6, SATURDAY=7;
}

public class DayTest implements Days {
	public static void main(String[] args) {
		System.out.println("�Ͽ���: "+SUNDAY);
	}
}
