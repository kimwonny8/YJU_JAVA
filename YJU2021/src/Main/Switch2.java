package Main;

import java.util.Scanner;
public class Switch2 {
//2101059 ������
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ 7��°���� �Է����ּ���");
		int x=sc.nextInt();
		int y=x%10;
	
		switch(y){
			case 1,3:
				System.out.println("���౸���� "+y+"�� �����Դϴ�.");
				break;
			case 2,4:
				System.out.println("���౸���� "+y+"�� �����Դϴ�.");
				break;
			default:
				System.out.println("�ֹε�Ϲ�ȣ �����Դϴ�.");	
			}
		System.out.println("2101059 ������");
	}
}
