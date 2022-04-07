package Main;

import java.util.Scanner;

public class ComparisonThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("a가 제일 큰 수");
			}
			else {
				System.out.println("c가 제일 큰 수");
			}
		}
		else if(b>a) {
			if(b>c) {
				System.out.println("b가 제일 큰 수");
			}
			else {
				System.out.println("c가 제일 큰 수");
			}
		}

	}

}
