package Bronze;

import java.util.Scanner;

// ���װ��_���丮�� ���
public class Q11050 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt();
		System.out.println(two(n)/(two(k)*(two(n-k))));
	}
	
	public static int two(int n) {
		if(n==0) return 1;
		else return n * two(n-1);
	}

}
