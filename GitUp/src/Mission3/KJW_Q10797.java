package Mission3;

import java.util.Scanner;

public class KJW_Q10797 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), cnt=0;
		for(int i=0; i<5; i++) {
			if(sc.nextInt()==n) cnt++;
		}
		System.out.println(cnt);
	}
}
/*
20220517
���� ���ص� : 5(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 1��
*/