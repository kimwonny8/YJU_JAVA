import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int sum=0;
		int snum=Integer.parseInt(s);
		for(int i=0; i<5; i++) {
			int num=snum%10;
			sum+=Math.pow(num, 5);
			snum/=10;
		}
		System.out.println(sum);
	}
}

