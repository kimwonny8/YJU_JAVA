package Main;
import java.util.Scanner;

public class Circle {

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("���� �������� �Է��Ͻÿ�.");
      double ������=sc.nextDouble();
      double ����=3.141592*������*������;
      
      System.out.println("�������� "+������+"�� ���� ������ "+����+"�Դϴ�.");
      System.out.printf("�������� %.2f�� ���� ������ %.2f�Դϴ�.",������,����);

   }

}