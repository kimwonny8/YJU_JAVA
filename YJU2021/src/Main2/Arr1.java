package Main2;

//import java.util.Scanner;
public class Arr1 {
//2101059 ������_211026_No1
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		final int SIZE=5;
		double[] arr=new double[SIZE]; double max=0;
		System.out.println("?");
		
		//�Է� �� MAX�� ã��
		for(int i=0; i<arr.length; i++) {
			arr[i]=Math.random()*100;
			if(arr[i]>max) max=arr[i];
		}
		//���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("���� ū ��:"+max);
	}
}
