package Mission3;

import java.util.Scanner;

public class KJW_Q1409 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(arr[k-1]);
	}
}

/*
20220429
���� ���ص� : 5 (1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 1��
*/