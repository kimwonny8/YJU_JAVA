package Main;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr={1,2,3,4,5};
		int i=0;
		try {
			for(i=0; i<=arr.length; i++) {
				System.out.println(arr[i]+" ");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� "+i+"�� ����� �� ���׿�!");
		}
	}
}
// ArithmeticException => 0���� ������ �� ����
// ArrayIndexOutOfBoundsException => �ε��� �ʰ� ����