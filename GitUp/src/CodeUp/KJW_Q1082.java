package CodeUp;

import java.util.Scanner;

public class KJW_Q1082 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int num = Integer.parseInt(n,16);
		
		for(int i=1; i<=15; i++) {
			String result=Integer.toString(num*i,16).toUpperCase();
			String mulnum=Integer.toString(i,16).toUpperCase();
			System.out.println(n+"*"+mulnum+"="+result);
		}
	}
}
/*
20220507
���� ���ص� : 3(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 13��
*/
