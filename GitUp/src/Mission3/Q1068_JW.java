package Mission3;

import java.util.Scanner;

public class Q1068_JW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Byte score = sc.nextByte();
		
		if(score<=100 && score>=90)	System.out.println("A");
		else if(score>=70) System.out.println("B");
		else if(score>=40) System.out.println("C");
		else if(score>=0) System.out.println("D");
	}
}
/*
 20220411
 ���� ���ص� : 5 (1~5���� ����)
 ���� �ذ� : O
 �ڵ� �ð� : 3��
 */

