package A;

import java.util.*;

public class Number_ArrayList {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		// HashSet<Integer> hashSet = new HashSet<>(); // 기본적으로 중복을 허용하지 않음
		// TreeSet<String> treeSet = new TreeSet<>(); // 오름차순 정렬하면서 저장(중복허용X)
		for(int i=0; ;i++) {
			System.out.println("학번을 입력하세요(종료하고싶으면 0입력)");
			int a=sc.nextInt();
			if(a==0) break;
			if(!list.contains(a)) list.add(a); //중복되면 추가X
			//hashSet.add(a);
		}
		System.out.println(list);
		//System.out.println(hashSet);
		for(int x:list) System.out.print(x+" "); //리스트 한개씩 출력
	}
}

/*class Student {
	//필드
	private String name;
	private int number;
	
	//생성자
	public Student(String name, int number) {
		this.name=name;
		this.number=number;
	}
	
	//메소드
	public String toString() {
		return String.format("name:%s, number:%d", name, number);
	}
}*/