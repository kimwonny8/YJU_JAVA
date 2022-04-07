package A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int []arr=new int[5];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		int avg=sum/arr.length;
		System.out.println(avg);
		Arrays.sort(arr);
		System.out.println(arr[2]);
	}
}

//String[] arr= a.split("\s"); 문자열 공백기준으로 자르기
//Arrays.sort(arr, Collections.reverseOrder()); 내림차순정렬

/*문자열배열 인트배열로 String[] arr=a.split(",");
* int[] result =new int[arr.length]; 
	result[i]= Integer.parseInt(arr[i]); */

/*'throws IOException
 *  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int n=Integer.parseInt(br.readLine());
 StringTokenizer a=null;
a=new StringTokenizer(br.readLine()," "); */