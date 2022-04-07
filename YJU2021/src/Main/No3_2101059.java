package Main;

//2101059 김정원 _3번문제
import java.util.*;
public class No3_2101059 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("2101059 김정원");
		
		//학번 입력 받아서 끝 4자리 숫자를 b로 지정
		//p는 양수의 합, m은 음수의 합
		System.out.println("학번을 입력하세요.");
		int a, b=sc.nextInt()%10000, p=0, m=0; 

		while (true) {
			System.out.println("정수를 입력하세요.("+b+"이 입력되면 종료)");	
			a=sc.nextInt(); 
			if(a==b) break;
			else if(a==0) System.out.println("오류! 0이 아닌 정수를 입력해주세요.");
			else if(a>0) p+=a;
			else if(a<0) m+=a;	
		}
		System.out.println("양수의 합:"+p+", 음수의 합:"+m);
		
		//양수와 음수의 합의 절대값 중에 큰것 출력
		m=m*-1;
		if(p>m) System.out.println("양수의 절대값인 "+p+"가 더큽니다.");
		else if(p==m) System.out.println("양수음수의 절대값은 "+p+"로 값이 같습니다."); //같을 때 조건 추가했습니다.
		else System.out.println("음수의 절대값인 "+m+"가 더큽니다.");
	}
}
