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
문제 이해도 : 5 (1~5사이 숫자)
문제 해결 : O
코딩 시간 : 3분
*/