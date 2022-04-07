package A;

public class Variable {
	static void Int(int a) {
		a=a+5;
	}
	static void Ints(int[] a) {
		a[0]=-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int[] b= {1,2,3};
		Int(a);Ints(b);
		System.out.println(a);
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+", ");
	}

}
