package Main;

import java.util.*;
public class for0 {
	//2101059 김정원 3번문제
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("2101059 김정원");
		System.out.println("시작과 끝 정수를 입력하세요. ");
		int a=sc.nextInt(), b=sc.nextInt();
		for(int i=a; i<=b; i++) {
			if(i%4==0 || i%5==0) continue;
			System.out.print(i+" ");
		}
	}
}
