package Main2;

import java.util.*;

public class Arr1_211102 {
//2101059 ������
	public static void main(String[] args) {	
		System.out.println("2101059 ������");
		double[]arr=new double[5];
		
		for(int i=0; i<arr.length; i++) arr[i]=Math.random()*100;
		
		System.out.print("���� ��: ");
		for(double a:arr) System.out.printf("%3.1f ",a);

		Arrays.sort(arr);
		System.out.print("\n���� ��: ");
		for(double a:arr) System.out.printf("%3.1f ",a);		
	}
}
