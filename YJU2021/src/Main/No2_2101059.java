package Main;

//2101059 김정원 _2번문제
import java.util.*;
public class No2_2101059 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("2101059 김정원");
		
		System.out.println("월을 입력하세요.");
		int a=sc.nextInt();
		if(a==12 || a==1 || a==2) System.out.println(a+"월은 겨울입니다.");
		else if(a>=3 && a<=5) System.out.println(a+"월은 봄입니다.");
		else if(a>=6 && a<=9) System.out.println(a+"월은 여름입니다.");
		else if(a==10 || a==11) System.out.println(a+"월은 가을입니다.");
		else System.out.println("오류입니다.");
	}

}
