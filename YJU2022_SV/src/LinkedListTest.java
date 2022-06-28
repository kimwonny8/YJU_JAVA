import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add(1,"넷");
		list.set(2, "다섯");
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) System.out.println(list.get(i));

	}

}
