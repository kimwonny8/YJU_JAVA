package Main;

//2101059 ������ _2������
import java.util.*;
public class No2_2101059 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("2101059 ������");
		
		System.out.println("���� �Է��ϼ���.");
		int a=sc.nextInt();
		if(a==12 || a==1 || a==2) System.out.println(a+"���� �ܿ��Դϴ�.");
		else if(a>=3 && a<=5) System.out.println(a+"���� ���Դϴ�.");
		else if(a>=6 && a<=9) System.out.println(a+"���� �����Դϴ�.");
		else if(a==10 || a==11) System.out.println(a+"���� �����Դϴ�.");
		else System.out.println("�����Դϴ�.");
	}

}
