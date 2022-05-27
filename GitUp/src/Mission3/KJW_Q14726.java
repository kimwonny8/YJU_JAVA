package Mission3;

import java.util.Scanner;

public class KJW_Q14726 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char [] arr=new char[16];
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			String tmp=sc.next();
			int sum=0;
			for(int j=0; j<16; j++) {
				arr[j]=tmp.charAt(j);
			}
			for(int j=15; j>=0; j--) {
				if(j%2==0) {
					int x=(int)(arr[j]-'0')*2;
					if(x>=10) {
							sum+=x%10;
							sum+=x/10;
						}
					else sum+=x; 
				}
				else sum+=(int)(arr[j]-'0');
			}
			if(sum%10==0) System.out.println("T");
			else System.out.println("F");
		}
	}

}
/* 20220601
 * 문제 이해도 : 4 (1 ~ 5 사이 숫자)
 * 문제 해결 : O
 * 코딩 시간 : 15분
 */
