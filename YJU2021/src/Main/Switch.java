package Main;

import java.util.Scanner;
public class Switch {
//2101059 김정원
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int x=sc.nextInt();
	
		if(x<0) {
			if(x%2==0) {
				System.out.println("음수이면서 짝수입니다.");
			}
			else {System.out.println("음수이면서 홀수입니다");
			}
		}
		else {
			if(x%2==0) {
				System.out.println("양수이면서 짝수입니다.");
			}
			else {
				System.out.println("양수이면서 홀수입니다.");
			}
		}
		System.out.println("2101059 김정원");
	}
}
