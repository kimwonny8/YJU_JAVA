package Main2;

import java.util.*;

public class Arr2_211102 {
//2101059 김정원
	public static void main(String[] args) {	
		System.out.println("2101059 김정원");
		
		int[][] arr=new int[3][5];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j]=(int)(Math.random()*100);
			}
		}
		System.out.println("\n3행 5열");
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) { 
				System.out.print(arr[i][j]+" "); 
			} 
			System.out.println(); 
		}
		//for-each문
		System.out.println("\nfor-each 3행 5열");
		for(int i=0; i<3; i++) {
			for(int x : arr[i]) { 
				System.out.print(x+" "); 
			} 
			System.out.println(); 
		}
		
		System.out.println("\n5행 3열");
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) { 
				System.out.print(arr[j][i]+" "); 
			}
			System.out.println();
		}
	}
}
