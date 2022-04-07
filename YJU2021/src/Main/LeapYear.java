package Main;
import java.util.Scanner;

public class LeapYear {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("년도? ");
      int year = sc.nextInt();
      boolean isLeapYear;
      isLeapYear = year%4==0;
      //System.out.println("입력된 년도는"+year);
      //System.out.println(isLeapYear);
      
      if(isLeapYear==true) {
         System.out.println(year+"년은 윤년입니당");
      }
      else { System.out.println(year+"년은 윤년이 아닙니당"); }
   }
}
