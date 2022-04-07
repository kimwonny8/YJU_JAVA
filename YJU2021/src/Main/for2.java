package Main;

import java.util.*;
public class for2 {
	//2101059 김정원 5번문제
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("임의의 숫자를 입력하세요(-9999를 입력하면 종료됩니다.)");
		int n, a=0, b=0;
		for( ;; ){
			n=sc.nextInt();
			if(n==-9999) break;
			if(n>0) a++;
			if(n<0) b++;
		}
		System.out.println("양수 : "+a+"개, 음수: "+b+"개");
		System.out.println("2101059 김정원");
	}

}
