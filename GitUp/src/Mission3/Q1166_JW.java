package Mission3;

import java.util.Scanner;

public class Q1166_JW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0) System.out.println("yes");
		else System.out.println("no");
	}
}
/*
20220411
���� ���ص� : 3 (1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 10��
*/