import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("�ϳ�");
		list.add("��");
		list.add("��");
		list.add(1,"��");
		list.set(2, "�ټ�");
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) System.out.println(list.get(i));

	}

}
