package Mission3;

import java.util.Scanner;

public class KJW_Q10797 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), cnt=0;
		for(int i=0; i<5; i++) {
			if(sc.nextInt()==n) cnt++;
		}
		System.out.println(cnt);
	}
}
/*
20220517
문제 이해도 : 5(1~5사이 숫자)
문제 해결 : O
코딩 시간 : 1분
*/