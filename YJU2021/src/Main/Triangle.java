package Main;
import java.util.Scanner;
//2101059 김정원
public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 세개를 입력하세요");
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		
		if(a>=b && a>=c) {
			if(a>b+c)
				System.out.println("세 변의 길이가 각각 "+a+", "+b+", "+c+" 여서 삼각형을 이룰 수 없음");
			else System.out.println("빗변의 길이가 "+a+"이고, 가로 세로 길이가 "+b+", "+c+" 여서 삼각형을 이룰 수 있음");
		}
		else if(b>=a && b>=c) {
			if(b>a+c)
				System.out.println("세 변의 길이가 각각 "+b+", "+a+", "+c+" 여서 삼각형을 이룰 수 없음");
			else System.out.println("빗변의 길이가 "+b+"이고, 가로 세로 길이가 "+a+", "+c+" 여서 삼각형을 이룰 수 있음");
		}
		else {
			if(c>a+b)
				System.out.println("세 변의 길이가 각각 "+c+", "+a+", "+b+" 여서 삼각형을 이룰 수 없음");
			else System.out.println("빗변의 길이가 "+c+"이고, 가로 세로 길이가 "+a+", "+b+" 여서 삼각형을 이룰 수 있음");
		} 
}}
