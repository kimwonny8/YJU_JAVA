package CodeUp;

import java.util.Scanner;

public class KJW_Q1207 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a, sum=0;
		
		for(int i=0; i<4; i++) {
			a=sc.nextInt();
			if(a==1) sum++;
		}
		if(sum==1) System.out.println("��");
		else if(sum==2) System.out.println("��");
		else if(sum==3) System.out.println("��");
		else if(sum==4) System.out.println("��");
		else System.out.println("��");
	}

}
/*
20220414
���� ���ص� : 5 (1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 2��
*/

