package Main2;

import java.util.Arrays;
import java.util.Scanner;

public class Arr3_211109 {
//2101059 김정원
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("2101059 김정원");
		final int row=5;
		final int col=5;
		int[][] arr=new int[row][col];
		int max=0, x=0, y=0;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=(int)(Math.random()*100);
				if(arr[i][j]>max) {
					max=arr[i][j]; x=i+1; y=j+1;
				}
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) 
				System.out.print(arr[i][j]+" "); 
			//for(int x:list[i]) System.out.printf("%5d",x);
			System.out.println();
		}
		System.out.println("최대값 : "+x+"행 "+y+"열 "+max);
	}
}
