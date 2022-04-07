package Main;
	
import java.util.Scanner;
public class chapter4_5_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구의 반지름: ");
		double r = sc.nextDouble();     
		System.out.println("구의 부피: " +(r*r*r)*4/3);
    }
}

