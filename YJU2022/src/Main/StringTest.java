package Main;

public class StringTest {

	public static void main(String[] args) {
		String proverb = "A barking dog";
		String s1,s2,s3,s4;
		
		System.out.println("문자열의 길이="+ proverb.length());

		s1 = proverb.concat(" never Bites!");
		s2 = proverb.replace('b','B');
		s3 = proverb.substring(2, 5);
		s4 = proverb.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(proverb.charAt(0));
		
		System.out.println(s2.equals(proverb));
		System.out.println(s2.equalsIgnoreCase(proverb));
		
		System.out.println("A".compareTo("a"));
		
	}

}
