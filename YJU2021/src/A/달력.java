package A;
import java.util.*;

public class �޷� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		
	    System.out.println("��� ��� �޷�?");
		int y=sc.nextInt(), m=sc.nextInt();
		
		cal.set(Calendar.YEAR, y); //�Է¹��� �⵵�� ���� 
		cal.set(Calendar.MONTH, m); //�Է¹��� ���� ����
		cal.set(y, m-1, 1); //�Է¹��� ���� 1�Ϸ� ����, month�� 0�� 1���̹Ƿ� -1�� ���ش�
		
		int end = cal.getActualMaximum(Calendar.DATE); //�ش� �� ������ ��¥ 
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //�ش� ��¥�� ����(1:�Ͽ��� �� 7:�����) 
		
		System.out.println("��   ��   ȭ   ��   ��   ��   ��");
		
		for(int i=1; i<=end; i++) {
			if(i==1) { 
				for(int j=1; j<dayOfWeek; j++) System.out.print("    "); } 
			if(i<10) System.out.print(" "); //���ڸ����� ��� ������ �߰��ؼ� �ٸ��߱�
			System.out.print(" "+i+" "); 
			if(dayOfWeek%7==0) System.out.println();//���ٿ� 7�Ͼ� ��� 
			dayOfWeek++; } 			

	}
}
