import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		StringBuilder sb = new StringBuilder();
		
		int n=sc.nextInt();
		boolean []arr=new boolean[n+1];
		// false ¸é ¼Ò¼ö
		arr[0]=arr[1]=true;
		int sum=0;
		for(int i=2; i*i<=n; i++) {
			for(int j=i*i; j<=n; j+=i) {
				arr[j]=true;
				sum+=j;
			}
		}
		System.out.println(sum);
	}
}
