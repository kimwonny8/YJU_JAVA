package Main;

import java.util.Scanner;

public class ComparisonThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("a�� ���� ū ��");
			}
			else {
				System.out.println("c�� ���� ū ��");
			}
		}
		else if(b>a) {
			if(b>c) {
				System.out.println("b�� ���� ū ��");
			}
			else {
				System.out.println("c�� ���� ū ��");
			}
		}

	}

}
