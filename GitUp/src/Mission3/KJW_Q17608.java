package Mission3;

import java.util.Scanner;

public class KJW_Q17608 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0; i<n; i++) 
			arr[i]=sc.nextInt();
				
		int max=arr[n-1], x=n-1, cnt=1;
		
		for(int i=n-1; i>=0; i--) {
			if(arr[i]<=max) arr[i]=0;
			else {
				cnt++;
				max=arr[i];
			}
		}
		System.out.println(cnt);
	}
}
/* 20220601
 * ���� ���ص� : 4 (1 ~ 5 ���� ����)
 * ���� �ذ� : O
 * �ڵ� �ð� : 20��
 */
