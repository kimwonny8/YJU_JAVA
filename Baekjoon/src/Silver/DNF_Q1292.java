package Silver;

import java.util.Scanner;

public class DNF_Q1292 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt(), b=sc.nextInt();
		int [] arr=new int[1001];
		int sum=0; 
		int cnt=1;
		
		for(int i=1; i<1001; i++) {
			for(int j=0; j<i; j++) {
				arr[cnt]=i;
				cnt++;	
			}
			System.out.print(arr[i]);
			}
		}
		
	}

