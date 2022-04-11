package CodeUp;

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
 문제 이해도 : 5 (1~5사이 숫자)
 문제 해결 : O
 코딩 시간 : 3분
 */

