package Bronze;

import java.util.Scanner;

public class Q14730 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int [][]arr=new int[n][2];
		int sum=0;
		for(int i=0; i<n; i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
			sum+=arr[i][0]*arr[i][1];
		}
		System.out.println(sum);

	}

}
