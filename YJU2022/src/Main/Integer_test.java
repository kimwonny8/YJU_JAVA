package Main;

public class Integer_test {

	public static void main(String[] args) {
		
		int a=Integer.parseInt("15");
		double b =Double.parseDouble("3.14");
		
		System.out.println(new Integer(75).doubleValue());
		
		String c = Integer.toBinaryString(a); //2진수
		String d= Integer.toHexString(a); // 16진수
		String e= Integer.toOctalString(a); // 8진수
		
		System.out.println(a+100);
		System.out.println(b*100);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
