import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name =name;
	}
	
	public String toString() {
		return name;
	}
	public int compareTo(Student s) {
		return number - s.number;
	}
}

public class SortTest {

	public static void main(String[] args) {
		Student arr[] = {
				new Student(20090001,"김"),
				new Student(20090002,"이"),
				new Student(20090003,"박"),
		};
		List<Student> list = Arrays.asList(arr);
		Collections.sort(list);
		// 역순정렬 Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
