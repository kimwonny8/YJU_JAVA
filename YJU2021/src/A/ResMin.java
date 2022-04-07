package A;

import java.util.Scanner;

public class ResMin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a=sc.nextInt(), b=sc.nextInt();
			int x=gcd(a,b); //최대공약수
			int y= a*b/x; //최대공배수
			System.out.println(y);
			System.out.println(x);
		}
	}
	public static int gcd(int a, int b) {
		if(b>a) {
			int temp = a;
			a=b;
			b=temp;
		}
		if(b==0) return a;
		else return gcd(b,a%b);
	}
}
