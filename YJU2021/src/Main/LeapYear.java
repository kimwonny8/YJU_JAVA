package Main;
import java.util.Scanner;

public class LeapYear {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("�⵵? ");
      int year = sc.nextInt();
      boolean isLeapYear;
      isLeapYear = year%4==0;
      //System.out.println("�Էµ� �⵵��"+year);
      //System.out.println(isLeapYear);
      
      if(isLeapYear==true) {
         System.out.println(year+"���� �����Դϴ�");
      }
      else { System.out.println(year+"���� ������ �ƴմϴ�"); }
   }
}
