package CodeUp;

import java.util.Scanner;

public class KJW_Q1171 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next(), b=sc.next(),c=sc.next();
		
		if(c.length()==3) {
			if(b.length()==2) System.out.printf("%s%s%s",a,b,c);
			else System.out.printf("%s0%s%s",a,b,c);
		}
		else if(c.length()==2) {
			if(b.length()==2) System.out.printf("%s%s0%s",a,b,c);
			else System.out.printf("%s0%s0%s",a,b,c);
		}
		else {
			if(b.length()==2) System.out.printf("%s%s00%s",a,b,c);
			else System.out.printf("%s0%s00%s",a,b,c);
		}
	}
}

/*
20220429
���� ���ص� : 5 (1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 6��
*/