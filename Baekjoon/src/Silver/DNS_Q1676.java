package Silver;

import java.util.Scanner;

public class DNS_Q1676 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=1, cnt=0;
		for(int i=1; i<=n; i++) {
			sum*=i;
		}
		System.out.println(sum);
		while(true) {
			if(sum%10==0) {
				cnt++;
				sum/=10;
			} else break;
		}
		System.out.println(cnt);
	}

}
