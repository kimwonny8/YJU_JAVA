package Mission3;

import java.util.Scanner;

public class KJW_Q14681 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt();
		
		if(x>0 && y>0) System.out.println("1");
		else if(x<0 && y>0) System.out.println("2");
		else if(x<0 && y<0) System.out.println("3");
		else System.out.println("4");
	}

}
/*
20220521
���� ���ص� : 5(1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 1��
*/