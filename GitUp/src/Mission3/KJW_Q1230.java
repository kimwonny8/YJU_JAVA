package Mission3;

import java.util.Scanner;

public class KJW_Q1230 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			int a=sc.nextInt();
			if(a<=170) {
				System.out.println("CRASH "+a);
				break;
			}
			if(i==2) System.out.println("PASS");
		}
	}
}
/*
20220507
���� ���ص� : 5(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 3��
*/
