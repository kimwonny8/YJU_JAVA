package Main2;

import java.util.ArrayList;

public class ArrList {
//2101059 김정원
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("python");
		list.add("C");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i)); //지우는건 remove

	}
}
