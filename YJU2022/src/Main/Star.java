package Main;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// 2101059 김정원 
		System.out.print("높이 입력:");
		int h=sc.nextInt();
		//for 문 둘 다 0부터 시작하려면 cnt=1이랑 center=h-1 로 만듦
		for(int i=1; i<=h; i++) { // 세로길이(높이)
			
			for(int j=1; j<=2*h-1; j++) { // 가로길이
				if(j>h-i && j<h+i) System.out.print("*"); //j>center-cnt && j<center+cnt
				else System.out.print(".");
			} // end of for j
			
			System.out.println(); // 한 줄 찍고 줄바꿈
			//cnt++;
		} // end of for i
	}	
}