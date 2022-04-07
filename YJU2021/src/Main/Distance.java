package Main;

public class Distance {

	   public static void main(String[] args) {
	      final int light_speed=300000; //final은 상수
	      long distance = 40_000_000_000_000l; //double로 바꾸면 40e12; float로 바꾸면 40e12f;
	      double secs;
	      secs=distance/light_speed;
	      double light_year=secs/(60*60*24*365);
	      System.out.println("걸리는 시간은 "+light_year+" 광년입니다.");
	   }

	}