package Mission3;

import java.util.Arrays;
import java.util.Scanner;

public class KJW_Q2587 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int sum=0;
		int [] arr=new int[5];
		for(int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		System.out.printf("%d\n%d",sum/5,arr[2]);
	}

}
/*
20220524
���� ���ص� : 5(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 2��
*/