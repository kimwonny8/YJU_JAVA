package Main;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				for(int k=0; k<10; k++) {
					System.out.printf("i=%d, j=%d, k=%d \n",i,j,k);
				}
			}
		}

	}

}
