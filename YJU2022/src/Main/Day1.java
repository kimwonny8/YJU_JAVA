package Main;

public class Day1 {
	
	public static void main(String[] args) {
		// 2101059 ±èÁ¤¿ø #30
		for(int i=1; i<=100; i++) {
			if(i%9==1 && !(i/10==0 || i/10==10)) System.out.printf(" ");
			else System.out.print("*");
			if(i%10==0) System.out.printf("%n");
		}
	}
}