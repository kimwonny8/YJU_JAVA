package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class KJW_Q1293 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int [] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=n-1; i>=0; i--) {
			if(i==n-1) System.out.print(arr[i]+" ");
			if(i==0) System.out.print(arr[i]);
		}
	}
}

/*
20220427
문제 이해도 : 5(1~5사이 숫자)
문제 해결 : O
코딩 시간 : 3분
*/