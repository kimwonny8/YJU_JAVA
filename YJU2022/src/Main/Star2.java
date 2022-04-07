package Main;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("높이 입력: ");
		int h=sc.nextInt();
		int cnt=h-1;
		int center=h-1;
		for(int i=0; i<h; i++) { // 세로길이(높이)
			
			for(int j=0; j<2*h-1; j++) { // 가로길이
				if(j>=center-cnt && j<=center+cnt) System.out.print("*"); 
				else System.out.print(" ");
			} // end of for j
			System.out.println();
			cnt--;
		} // end of for i

	}

}
