package A;

import java.util.*;

public class Number_ArrayList {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		// HashSet<Integer> hashSet = new HashSet<>(); // �⺻������ �ߺ��� ������� ����
		// TreeSet<String> treeSet = new TreeSet<>(); // �������� �����ϸ鼭 ����(�ߺ����X)
		for(int i=0; ;i++) {
			System.out.println("�й��� �Է��ϼ���(�����ϰ������ 0�Է�)");
			int a=sc.nextInt();
			if(a==0) break;
			if(!list.contains(a)) list.add(a); //�ߺ��Ǹ� �߰�X
			//hashSet.add(a);
		}
		System.out.println(list);
		//System.out.println(hashSet);
		for(int x:list) System.out.print(x+" "); //����Ʈ �Ѱ��� ���
	}
}

/*class Student {
	//�ʵ�
	private String name;
	private int number;
	
	//������
	public Student(String name, int number) {
		this.name=name;
		this.number=number;
	}
	
	//�޼ҵ�
	public String toString() {
		return String.format("name:%s, number:%d", name, number);
	}
}*/