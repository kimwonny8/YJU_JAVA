package Main;

import java.util.Scanner;
public class Star6 {
//2101059 김정원
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?");
		int n=sc.nextInt(), i=0, j, k;
		while(i<n) {
			j=n-i;
			while(j>i) {
				System.out.print(" ");
				j--;
			}
			k=i;
			while(k<i) {
				System.out.print("*");
				k++;
			}
			System.out.println("");
			i++;
		}
//		while(i<n) {
//			j=0;
//			while(j<=n-i-1) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println("");
//			i++;
//		}	
		System.out.println("2101059 김정원");
	}
}

