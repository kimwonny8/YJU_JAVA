package Main;

import java.util.*;
public class for0 {
	//2101059 ������ 3������
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("2101059 ������");
		System.out.println("���۰� �� ������ �Է��ϼ���. ");
		int a=sc.nextInt(), b=sc.nextInt();
		for(int i=a; i<=b; i++) {
			if(i%4==0 || i%5==0) continue;
			System.out.print(i+" ");
		}
	}
}
