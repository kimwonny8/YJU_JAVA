package Main;

class Time {
	private int hour; // 0-23
	private int minute; // 0-59
	private int second; // 0-59
	
	// ù ��° ������
	public Time() {
		this(0,0,0);
	}
	
	// �� ��° ������
	public Time(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	// �ð� ���� �Լ�
	public void setTime(int h, int m, int s) {
		hour =((h>=0 && h<24) ? h : 0);
		minute =((m>=0 && m<60) ? m : 0);
		second =((s>=0 && s<60) ? s : 0);
	}
	
	// "��:��:��" ���� ���, �������̵� ����
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}
	
}

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();

		System.out.print("�⺻ ������ ȣ�� �� �ð�: ");
		System.out.println(t.toString());
		
		// �� ��° ������ ȣ��
		Time t2 = new Time(13,27,6);
		System.out.print("�� ��° ������ ȣ�� �� �ð�: ");
		System.out.println(t2.toString());
		
		// �ùٸ��� ���� �ð����� �����غ� �� ȣ��
		Time t3 = new Time(99,66,77);
		System.out.print("�ùٸ��� ���� �ð� ���� �� �ð�: ");
		System.out.println(t3); 
		// toString ��� ��µ� => ���
		// �޼ҵ� toString() ����� ����� ��� �� ��
	}

}
