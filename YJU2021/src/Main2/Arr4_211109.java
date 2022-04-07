package Main2;

import java.util.Scanner;

public class Arr4_211109 {
//2101059 ±èÁ¤¿ø
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("2101059 ±èÁ¤¿ø\n");
		final int r=2;
		final int c=3;
		int[][] A=new int[r][c];
		int[][] B=new int[c][r];
		int[][] C=new int[c][c];
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				A[i][j]=(int)(Math.random()*10);
				System.out.print(A[i][j]+" ");
				}
			System.out.println();
		}
		System.out.println("*");
		
		for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++) {
				B[i][j]=(int)(Math.random()*10);
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=");
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) { 
				for(int k=0; k<c; k++) {
					C[i][j]+=A[i][k]*B[k][j];
				}
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	
	
	}
}
