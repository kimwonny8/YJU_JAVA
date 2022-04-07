package Main;

import java.util.*;
public class for_star {
	//2101059 김정원 2번문제
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("2101059 김정원");
	}

}
