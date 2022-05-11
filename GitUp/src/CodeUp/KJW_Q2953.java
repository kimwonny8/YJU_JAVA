package CodeUp;

import java.util.Scanner;

public class KJW_Q2953 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[4];
		int max=0, num=0;
		for(int i=0; i<5; i++) {
			int sum=0;
			for(int j=0; j<4; j++) {
				arr[j]=sc.nextInt();
				sum+=arr[j];
			}
			if(max<sum) {
				max=sum;
				num=i+1;
			}
		}
		System.out.println(num+" "+max);
	}
}

/*
20220510
문제 이해도 : 5(1~5사이 숫자)
문제 해결 : O
코딩 시간 : 4분
*/
