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
			System.out.println("인뎃스 "+i+"는 사용할 수 없네요!");
		}
	}
}
// ArithmeticException => 0으로 나눴을 때 오류
// ArrayIndexOutOfBoundsException => 인덱스 초과 오류