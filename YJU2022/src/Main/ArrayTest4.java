package Main;

import java.util.Scanner;

public class ArrayTest4 {
	final static int n = 5;
	
	public static void main(String[] args) {
		int[] arr=new int[n];
		getValues(arr);
		getAverage(arr);
	}
	// �Ű������� �迭�� ������ ���� 
	private static void getValues(int[] array){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<array.length; i++) {
			System.out.print("������ �Է��ϼ���: ");
			array[i]=sc.nextInt();
		}
	}
	private static void getAverage(int[]array) {
		int total=0;
		for(int i=0; i<array.length; i++)
			total+=array[i];
		System.out.println("��� ������ "+total/array.length+"�� �Դϴ�.");
	}

}
