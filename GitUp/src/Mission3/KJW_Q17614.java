package Mission3;

import java.util.Scanner;

public class KJW_Q17614 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		for(int i=1; i<=n; i++) {
			String a=Integer.toString(i);
			for(int j=0; j<a.length(); j++) {
				char b=a.charAt(j);
				if(b=='3'||b=='6'||b=='9') cnt++;
			}
		}
		System.out.println(cnt);
	}

}
/*
20220606
문제 이해도 : 4(1~5사이 숫자)
문제 해결 : O
코딩 시간 : 10분
*/
