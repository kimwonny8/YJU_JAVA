package CodeUp;

import java.util.Scanner;

public class KJW_Q2480 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		
		if(a==b && b==c) System.out.println(10000+a*1000);
		else if(a==b || c==b) System.out.println(1000+b*100);
		else if(a==c)  System.out.println(1000+a*100);
		else {
			if(a>=b && a>=c)System.out.println(a*100);
			else if(b>=c && b>=a) System.out.println(b*100);
			else System.out.println(c*100);
		}		

	}
}

/*
20220510
���� ���ص� : 5(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 3��
*/
