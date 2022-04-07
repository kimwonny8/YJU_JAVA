package A;

public class Test {
	
	static int work(int n) {
		int sum=0;
		while (n!=0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr= new int[10001];
		for(int i=1;i<=10000;i++) {
			if(work(i)+i<=10000) arr[work(i)+i]++;
		}
		for(int i=1;i<=10000;i++) {
			if(arr[i]==0) {
				System.out.println(i);			}
		}
	}
}