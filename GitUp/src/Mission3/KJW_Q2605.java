package Mission3;

import java.util.ArrayList;
import java.util.Scanner;

public class KJW_Q2605 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt(),i+1);
		}
		for(int i=n-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
	}

}
/*
20220524
문제 이해도 : 3(1~5사이 숫자)
문제 해결 : O
코딩 시간 : 15분
*/