package Main;

import java.util.Scanner;
public class Switch2 {
//2101059 김정원
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("주민등록번호 7번째까지 입력해주세요");
		int x=sc.nextInt();
		int y=x%10;
	
		switch(y){
			case 1,3:
				System.out.println("남녀구분이 "+y+"라서 남자입니다.");
				break;
			case 2,4:
				System.out.println("남녀구분이 "+y+"라서 여자입니다.");
				break;
			default:
				System.out.println("주민등록번호 오류입니다.");	
			}
		System.out.println("2101059 김정원");
	}
}
