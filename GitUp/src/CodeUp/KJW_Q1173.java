package CodeUp;

import java.util.Scanner;

public class KJW_Q1173 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt(), m=sc.nextInt();
		m=60*h+m-30;
		if(m<0)	m=m+1440;
		System.out.println(m/60+" "+m%60);
	}
}	
/*
20220507
���� ���ص� : 4(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 10��
*/
