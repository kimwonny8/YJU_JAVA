package Mission3;

import java.util.Scanner;

public class KJW_Q1267 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int y=0, m=0;
		for(int i=0; i<n; i++) {
			int time=sc.nextInt();
			y+=time/30*10;
			if(time%30>=0) y+=10;
			m+=time/60*15;
			if(time%60>=0) m+=15;
		}
		if(y<m) System.out.println("Y "+y);
		else if(y==m) System.out.println("Y M "+y);
		else System.out.println("M "+m);

	}
}

/*
20220510
���� ���ص� : 4(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 8��
*/
