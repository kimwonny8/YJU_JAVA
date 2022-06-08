package Gold;

import java.util.Scanner;

public class Q1300 {
// �迭���� k��° �� x, x �̸��� ��<k , x ������ ��>=k, x�� k��° ��
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt();
		
		long low=1, high=k, ans=0;
		
		while(low<high) {
			long mid=(low+high)/2;
			
			int cnt=0;
			for(int i=1; i<=n; i++) {
				cnt+=Math.min(mid/i, n);
			}
			if(cnt>=k) high=mid;
			else low=mid+1;
		}
		System.out.println(low);
	}
}
