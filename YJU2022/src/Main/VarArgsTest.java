package Main;

class Test100 {
	void sub(int...v) {
		System.out.println("인수의 개수: "+v.length);
		for(int x: v) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}

public class VarArgsTest {

	public static void main(String[] args) {
		Test100 hi = new Test100();
		hi.sub(1);
		hi.sub(2,3,4,5);
		hi.sub();
	}

}
