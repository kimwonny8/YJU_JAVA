package A;
import java.util.*;

public class 달력 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		
	    System.out.println("몇년 몇월 달력?");
		int y=sc.nextInt(), m=sc.nextInt();
		
		cal.set(Calendar.YEAR, y); //입력받은 년도로 세팅 
		cal.set(Calendar.MONTH, m); //입력받은 월로 세팅
		cal.set(y, m-1, 1); //입력받은 월의 1일로 세팅, month는 0이 1월이므로 -1을 해준다
		
		int end = cal.getActualMaximum(Calendar.DATE); //해당 월 마지막 날짜 
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //해당 날짜의 요일(1:일요일 … 7:토요일) 
		
		System.out.println("일   월   화   수   목   금   토");
		
		for(int i=1; i<=end; i++) {
			if(i==1) { 
				for(int j=1; j<dayOfWeek; j++) System.out.print("    "); } 
			if(i<10) System.out.print(" "); //한자릿수일 경우 공백을 추가해서 줄맞추기
			System.out.print(" "+i+" "); 
			if(dayOfWeek%7==0) System.out.println();//한줄에 7일씩 출력 
			dayOfWeek++; } 			

	}
}
