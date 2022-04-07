package Main2;

//import java.util.Scanner;
public class Arr2 {
//2101059 ±èÁ¤¿ø_211026_No2 ¾ËÆÄºªÃâ·Â
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		char [] arr=new char[26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(char)('a'+i);
			//System.out.println(arr+" ");
		}
		for(int i=0;i<arr.length; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
}
