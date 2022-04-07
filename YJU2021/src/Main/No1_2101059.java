package Main;

//2101059 김정원 _1번문제
import java.util.*;
public class No1_2101059 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("2101059 김정원");
		
		int a=sc.nextInt(), b=sc.nextInt(); //대각선 길이 두개 받기
		int x=(a*b)/2; //마름모 면적
		if(a<=0 || b<=0) System.out.println("오류입니다");
		else System.out.println("대각선 길이가 "+a+", "+b+"인 마름모의 면적은 "+x+"입니다.");
	}

}
