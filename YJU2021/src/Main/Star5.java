package Main;

import java.util.Scanner;
public class Star5 {
//2101059 김정원
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?");
		int n=sc.nextInt(), i=0, j;
		while(i<n) {
			j=0;
			while(j<=i) {
				if(j%2==0) 
					System.out.print("*");
				else 
					System.out.print("!");
				j++;
			}
			System.out.println("");
			i++;
		}	
		System.out.println("2101059김정원");
	}
}