import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	// ArrayList �ݺ��� ����ϱ�
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("�ϳ�");
		list.add("��");
		list.add("��");
		list.add("��");
		
		String s;
		Iterator e=list.iterator();
		while(e.hasNext()){ // ���� ���Ұ� ������ 
			s = (String)e.next(); // ���� ���Ҹ� ��´�!
			System.out.println(s);
		}
	}

}
