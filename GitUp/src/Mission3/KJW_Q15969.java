package Mission3;

import java.util.Arrays;
import java.util.Scanner;

public class KJW_Q15969 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[n-1]-arr[0]);
	}

}
/*
20220517
���� ���ص� : 5(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 2��
*/