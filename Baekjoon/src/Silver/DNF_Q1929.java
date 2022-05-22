package Silver;

import java.util.Scanner;

public class DNF_Q1929 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		StringBuilder sb = new StringBuilder();
		
		int n=sc.nextInt(), m=sc.nextInt();
		boolean[] arr = new boolean[n+1];
		arr[0]=true; arr[1]=true;
		
		for(int i=2; i*i<=m; i++){
			int sum=0;
			if(!arr[i]) {
				for(int j =i*i; j<=n; j+=i) {
					arr[j]=true;
				}
			}
		}
		for(int i=m; i<=n; i++)
			if(!arr[i]) sb.append(i).append("\n");
		
		System.out.println(sb);
	}
}