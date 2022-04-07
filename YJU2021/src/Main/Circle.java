package Main;
import java.util.Scanner;

public class Circle {

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("원의 반지름을 입력하시오.");
      double 반지름=sc.nextDouble();
      double 면적=3.141592*반지름*반지름;
      
      System.out.println("반지름이 "+반지름+"인 원의 면적은 "+면적+"입니다.");
      System.out.printf("반지름이 %.2f인 원의 면적은 %.2f입니다.",반지름,면적);

   }

}