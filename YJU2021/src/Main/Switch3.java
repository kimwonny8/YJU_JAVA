package Main;

import java.util.Scanner;
public class Switch3 {
//2101059 김정원
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("좌표를 입력해주세요");
		int x1=sc.nextInt(), y1=sc.nextInt();
		int x2=sc.nextInt(), y2=sc.nextInt();
		int x=x2-x1, y=y2-y1, a=x*y;
		
		if(a<0) a*=-1; 
		
		System.out.println("("+x1+","+y1+")과 ("+x2+","+y2+")로 이루어진 사각형의 면적은 "+a+"입니다.");
		System.out.println("2101059 김정원");
	}
}
