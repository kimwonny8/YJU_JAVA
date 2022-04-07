package Main;

import java.util.Scanner;

public class ComparisonThree2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		int max=a;
		
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		System.out.println("가장 큰 수는 "+max);

	}

}
