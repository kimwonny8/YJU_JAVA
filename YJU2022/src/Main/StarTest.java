package Main;

import java.util.Scanner;
//2101059 ±èÁ¤¿ø #10
public class StarTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || i==n) System.out.print("*");
				else if(j==1 || j==n) System.out.print("*");
				else System.out.print(" ");
			} 
			System.out.println();
		}
	}
}