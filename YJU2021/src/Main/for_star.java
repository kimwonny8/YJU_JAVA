package Main;

import java.util.*;
public class for_star {
	//2101059 ������ 2������
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�� ���� ����ұ��?");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("2101059 ������");
	}

}
