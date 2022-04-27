package Main;

public class Main {

	public static void main(String[] args) {
		int x=10, y=20, z=30;
		System.out.println((x>0)||(y<0)&&(z<0));
		System.out.println((x%2==0)&&(z%x==0));
		System.out.println(!(x>y)&&!(y<z));
		System.out.println((x>y)||(y<z));
	}

}
