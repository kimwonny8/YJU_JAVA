package Mission3;

import java.util.Scanner;

public class KJW_Q1671 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt();
		if((a==0 && b==1)||(a==1 && b==2)||(a==2 && b==0)) System.out.println("win");
		else if(a==b) System.out.println("tie");
		else System.out.println("lose");
	}
}

/*
20220427
���� ���ص� : 5(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 4��
*/