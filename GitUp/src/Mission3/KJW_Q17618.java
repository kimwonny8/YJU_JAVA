package Mission3;

import java.util.Scanner;

public class KJW_Q17618 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		
		for(int i=1; i<=n; i++) {
			cnt+=number(i);
		}
		System.out.println(cnt);
	}
	
	public static int number(int i) {
		int sum=0; int x=i, y=0;
		while(x/10>0) {
			sum+=x%10;
			x=x/10;	
		}	
		if(x/10==0) sum+=x;
		
		if(i%sum==0) return 1;
		else return 0;
		
	}
}
/*
20220606
문제 이해도 : 3(1~5사이 숫자)
문제 해결 : O
코딩 시간 : 15분
*/

