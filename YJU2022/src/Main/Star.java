package Main;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// 2101059 ������ 
		System.out.print("���� �Է�:");
		int h=sc.nextInt();
		//for �� �� �� 0���� �����Ϸ��� cnt=1�̶� center=h-1 �� ����
		for(int i=1; i<=h; i++) { // ���α���(����)
			
			for(int j=1; j<=2*h-1; j++) { // ���α���
				if(j>h-i && j<h+i) System.out.print("*"); //j>center-cnt && j<center+cnt
				else System.out.print(".");
			} // end of for j
			
			System.out.println(); // �� �� ��� �ٹٲ�
			//cnt++;
		} // end of for i
	}	
}