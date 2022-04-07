package A;

import java.util.Scanner;

public class Hansu {
	static int[] abc(int n) {
		int a[] = new int[3];
		for(int i=0;i<3;i++) {
			a[i]=n%10;
			n/=10;
		}
		return a;
	}
	static int han(int n) {
		int cnt=0;
		for(int i=111;i<=n;i++) {
			if(i==1000) break;
			int[] a=abc(i);
			if(a[0]-a[1]==a[1]-a[2])cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<100) {
			System.out.print(n);
		}
		else {
			System.out.print(han(n)+99);
		}
	}

}