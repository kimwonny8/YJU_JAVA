package Main;

import java.util.*;
public class for1 {
	//2101059 ������ 4������
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է��ϼ���(-9999�� �Է��ϸ� ����˴ϴ�.)");
		int n=sc.nextInt(), max=n;
		
		for(;;) {
			n=sc.nextInt();
			if(n==-9999) break;
			if(n>=max) max=n;
			
		}
		System.out.println("���� ū ���� "+max+"�Դϴ�.");
		System.out.println("2101059 ������");
	}
}