package Main;

import java.util.*;
public class for2 {
	//2101059 ������ 5������
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է��ϼ���(-9999�� �Է��ϸ� ����˴ϴ�.)");
		int n, a=0, b=0;
		for( ;; ){
			n=sc.nextInt();
			if(n==-9999) break;
			if(n>0) a++;
			if(n<0) b++;
		}
		System.out.println("��� : "+a+"��, ����: "+b+"��");
		System.out.println("2101059 ������");
	}

}
