package Main2;

//import java.util.Scanner;
public class Arr1 {
//2101059 김정원_211026_No1
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		final int SIZE=5;
		double[] arr=new double[SIZE]; double max=0;
		System.out.println("?");
		
		//입력 및 MAX값 찾기
		for(int i=0; i<arr.length; i++) {
			arr[i]=Math.random()*100;
			if(arr[i]>max) max=arr[i];
		}
		//출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("가장 큰 수:"+max);
	}
}
