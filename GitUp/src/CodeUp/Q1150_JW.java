package CodeUp;

import java.util.Scanner;

public class Q1150_JW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		
		if(a<=b && a<=c) System.out.println(a);
		else if(b<=a && b<=c) System.out.println(b);
		else if(c<=a && c<=b) System.out.println(c);
	}
}
/*
20220411
���� ���ص� : 5 (1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 3��
*/