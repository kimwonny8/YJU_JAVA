import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		//Hashset<String> set=new Hashset<String>(); // �ߺ� ����
		TreeSet<String> set=new TreeSet<String>(); 
		// �ߺ� ���� �� ���ĺ� ������ ����
		
		set.add("MILK");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		System.out.println(set); 
		
		// <-------- �ٸ� ���� -------->
		
		Set<String> s=new HashSet<>();
		String[] sample = {"�ܾ�","�ߺ�","����","�ߺ�"};
		for(String a:sample) {
			if(!s.add(a)) System.out.println("�ߺ��� �ܾ� "+a);
			System.out.println(s.size()+" �ߺ����� ���� �ܾ�: "+s);
		}
	}

}
