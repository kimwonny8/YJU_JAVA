package Mission3;

import java.util.Scanner;

public class KJW_Q1204 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		if(!(n>=11 && n<=13)) { 
			int num=n%10;
			if(num==1) System.out.println(n+"st");
			else if(num==2) System.out.println(n+"nd");
			else if(num==3) System.out.println(n+"rd");
			else System.out.println(n+"th");
		}
		else System.out.println(n+"th");
	}
}
/*
20220507
���� ���ص� : 5(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 5��
*/
