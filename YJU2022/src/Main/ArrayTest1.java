package Main;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int STUDENTS = 5;
		int total = 0;
		int [] scores = new int[STUDENTS];
		for(int i=0; i<STUDENTS; i++) {
			System.out.print("성적을 입력하세요: ");
			scores[i]=sc.nextInt();
			total+= scores[i];
		}
		System.out.println("평균 성적은 "+total/STUDENTS+"점 입니다.");

	}

}
