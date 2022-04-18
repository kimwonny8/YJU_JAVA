package Main;

import java.util.Scanner;

public class ArrayTest4 {
	final static int n = 5;
	
	public static void main(String[] args) {
		int[] arr=new int[n];
		getValues(arr);
		getAverage(arr);
	}
	// 매개변수는 배열의 참조값 전달 
	private static void getValues(int[] array){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<array.length; i++) {
			System.out.print("성적을 입력하세요: ");
			array[i]=sc.nextInt();
		}
	}
	private static void getAverage(int[]array) {
		int total=0;
		for(int i=0; i<array.length; i++)
			total+=array[i];
		System.out.println("평균 성적은 "+total/array.length+"점 입니다.");
	}

}
