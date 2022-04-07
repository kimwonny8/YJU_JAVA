package Main;

import java.util.*;
public class for1 {
	//2101059 김정원 4번문제
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("임의의 숫자를 입력하세요(-9999를 입력하면 종료됩니다.)");
		int n=sc.nextInt(), max=n;
		
		for(;;) {
			n=sc.nextInt();
			if(n==-9999) break;
			if(n>=max) max=n;
			
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
		System.out.println("2101059 김정원");
	}
}