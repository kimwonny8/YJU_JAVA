package CodeUp;

import java.util.Scanner;

public class KJW_Q1207 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a, sum=0;
		
		for(int i=0; i<4; i++) {
			a=sc.nextInt();
			if(a==1) sum++;
		}
		if(sum==1) System.out.println("도");
		else if(sum==2) System.out.println("개");
		else if(sum==3) System.out.println("걸");
		else if(sum==4) System.out.println("윷");
		else System.out.println("모");
	}

}
/*
20220414
문제 이해도 : 5 (1~5사이 숫자)
문제 해결 : O
코딩 시간 : 2분
*/

