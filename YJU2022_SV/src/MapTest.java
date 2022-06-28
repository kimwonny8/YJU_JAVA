import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		
		String[] sample = {"a","b","c","d","hi","a","b","c"};
		
		for(String a:sample) {
			Integer freq=m.get(a);
			m.put(a, (freq==null)? 1 : freq+1);
		}
		
		System.out.println(m.size()+"�� �ܾ ����");
		System.out.println("a �ֳ�? "+m.containsKey("a"));
		System.out.println(m.isEmpty());
		System.out.println(m);
 	}

}
