package Mission3;

import java.util.Arrays;
import java.util.Scanner;
//�ϰ�������
public class KJW_Q2309 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[9];
		int sum=0, a=0, b=0;
		for(int i=0; i<9; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(arr[i]+arr[j]==sum-100) {
					a=i; b=j;
				}
			}
		}
		  for(int i=0; i<9; i++) {
			  if(i!=a && i!=b) System.out.println(arr[i]);
		  }
	}

}
/*
20220524
���� ���ص� : 2(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 40��
*/