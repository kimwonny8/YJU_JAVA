package CodeUp;

import java.util.Scanner;

public class Q1078_JW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println(sum);
	}
}
/*
20220411
���� ���ص� : 5 (1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 1��
*/
