package Main;

import java.util.Scanner;
public class Switch {
//2101059 ������
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int x=sc.nextInt();
	
		if(x<0) {
			if(x%2==0) {
				System.out.println("�����̸鼭 ¦���Դϴ�.");
			}
			else {System.out.println("�����̸鼭 Ȧ���Դϴ�");
			}
		}
		else {
			if(x%2==0) {
				System.out.println("����̸鼭 ¦���Դϴ�.");
			}
			else {
				System.out.println("����̸鼭 Ȧ���Դϴ�.");
			}
		}
		System.out.println("2101059 ������");
	}
}
