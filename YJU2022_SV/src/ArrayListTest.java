import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	// ArrayList 반복자 사용하기
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("넷");
		
		String s;
		Iterator e=list.iterator();
		while(e.hasNext()){ // 다음 원소가 있으면 
			s = (String)e.next(); // 다음 원소를 얻는다!
			System.out.println(s);
		}
	}

}
