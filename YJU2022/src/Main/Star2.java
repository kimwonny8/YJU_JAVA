package Main;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int h=sc.nextInt();
		int cnt=h-1;
		int center=h-1;
		for(int i=0; i<h; i++) { // ���α���(����)
			
			for(int j=0; j<2*h-1; j++) { // ���α���
				if(j>=center-cnt && j<=center+cnt) System.out.print("*"); 
				else System.out.print(" ");
			} // end of for j
			System.out.println();
			cnt--;
		} // end of for i

	}

}
