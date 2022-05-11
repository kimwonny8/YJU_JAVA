package CodeUp;

import java.util.Scanner;

public class KJW_Q2525 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt(), m=sc.nextInt(); 
		m+=sc.nextInt();
		
		int sum=h*60+m;
		h=sum/60;
		if(h>=24) h%=24;
		m=sum%60;
		
		System.out.println(h+" "+m);
	}
}

/*
20220510
문제 이해도 : 5(1~5사이 숫자)
문제 해결 : O
코딩 시간 : 4분
*/
