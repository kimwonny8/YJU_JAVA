package Main;

public class Distance {

	   public static void main(String[] args) {
	      final int light_speed=300000; //final�� ���
	      long distance = 40_000_000_000_000l; //double�� �ٲٸ� 40e12; float�� �ٲٸ� 40e12f;
	      double secs;
	      secs=distance/light_speed;
	      double light_year=secs/(60*60*24*365);
	      System.out.println("�ɸ��� �ð��� "+light_year+" �����Դϴ�.");
	   }

	}