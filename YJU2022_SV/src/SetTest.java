import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		//Hashset<String> set=new Hashset<String>(); // 중복 제거
		TreeSet<String> set=new TreeSet<String>(); 
		// 중복 제거 후 알파벳 순서로 정렬
		
		set.add("MILK");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		System.out.println(set); 
		
		// <-------- 다른 예제 -------->
		
		Set<String> s=new HashSet<>();
		String[] sample = {"단어","중복","구절","중복"};
		for(String a:sample) {
			if(!s.add(a)) System.out.println("중복된 단어 "+a);
			System.out.println(s.size()+" 중복되지 않은 단어: "+s);
		}
	}

}
