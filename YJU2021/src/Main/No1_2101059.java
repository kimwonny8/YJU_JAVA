package Main;

//2101059 ������ _1������
import java.util.*;
public class No1_2101059 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("2101059 ������");
		
		int a=sc.nextInt(), b=sc.nextInt(); //�밢�� ���� �ΰ� �ޱ�
		int x=(a*b)/2; //������ ����
		if(a<=0 || b<=0) System.out.println("�����Դϴ�");
		else System.out.println("�밢�� ���̰� "+a+", "+b+"�� �������� ������ "+x+"�Դϴ�.");
	}

}
