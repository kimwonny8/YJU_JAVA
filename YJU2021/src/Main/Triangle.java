package Main;
import java.util.Scanner;
//2101059 ������
public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		
		if(a>=b && a>=c) {
			if(a>b+c)
				System.out.println("�� ���� ���̰� ���� "+a+", "+b+", "+c+" ���� �ﰢ���� �̷� �� ����");
			else System.out.println("������ ���̰� "+a+"�̰�, ���� ���� ���̰� "+b+", "+c+" ���� �ﰢ���� �̷� �� ����");
		}
		else if(b>=a && b>=c) {
			if(b>a+c)
				System.out.println("�� ���� ���̰� ���� "+b+", "+a+", "+c+" ���� �ﰢ���� �̷� �� ����");
			else System.out.println("������ ���̰� "+b+"�̰�, ���� ���� ���̰� "+a+", "+c+" ���� �ﰢ���� �̷� �� ����");
		}
		else {
			if(c>a+b)
				System.out.println("�� ���� ���̰� ���� "+c+", "+a+", "+b+" ���� �ﰢ���� �̷� �� ����");
			else System.out.println("������ ���̰� "+c+"�̰�, ���� ���� ���̰� "+a+", "+b+" ���� �ﰢ���� �̷� �� ����");
		} 
}}
