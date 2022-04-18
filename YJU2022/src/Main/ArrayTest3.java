package Main;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int size=sc.nextInt();
		int [] scores = new int[size];
		
		for(int i=0; i<scores.length; i++) {
			System.out.print("성적을 입력하세요: ");
			scores[i]=sc.nextInt();
			total+= scores[i];
		}
		System.out.println("평균 성적은 "+total/scores.length+"점 입니다.");

	}

}
