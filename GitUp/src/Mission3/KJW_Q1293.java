package Mission3;

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
���� ���ص� : 5(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 3��
*/