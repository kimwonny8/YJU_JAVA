package Main2;

import java.util.*;

public class Sort {
//2101059 ±èÁ¤¿ø
	public static void main(String[] args) {
		System.out.println("2101059 ±èÁ¤¿ø");
		final int n=5;
		int [] arr=new int[5]; int tmp=0;
		
		for(int i=0; i<n; i++)
			arr[i]=(int)(Math.random()*100);
		for(int i=0; i<n; i++) 
			System.out.print(arr[i]+" ");
		System.out.println();
		
		for(int i=0; i<n-1; i++) 
			for(int j=0; j<n-1; j++)
				if(arr[j]>arr[j+1]) {
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
		for(int i=0; i<n; i++) 
			System.out.print(arr[i]+" ");	
	}
}
