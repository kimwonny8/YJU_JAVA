package Mission3;

import java.util.Scanner;

public class KJW_Q1362 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 		String t=""; int num=0;
		
		for(int i=1;;i++) {
			double o=sc.nextDouble(), w=sc.nextDouble();
			if(o==0 && w==0) break;
			
			while(true) {
				t=sc.next();
				num=sc.nextInt();
				if(t.equals("#") && num==0) break;
				if(t.equals("F")) w+=num;
				else if(t.equals("E")) {
					w-=num;
					if(w<=0) w=-1000000000;	
				}
			}
			if(w>o*0.5 && w<o*2) System.out.println(i+" :-)");
			else if(w<=0) System.out.println(i+" RIP");
			else System.out.println(i+" :-(");
		}
		
	}

}
/* 20220601
 * 문제 이해도 : 1 (1 ~ 5 사이 숫자)
 * 문제 해결 : O
 * 코딩 시간 : 30분
 */

