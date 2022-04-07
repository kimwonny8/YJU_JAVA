package English;

import java.util.Vector; 
// import => 자바의 유틸에서 Vector라는 객체(class)를 메모리에 불러옴
// test
public class VectorEx {
	public static void main(String[] args) {
		 Vector<Integer> v = new Vector<Integer>(7); 
		 // 정수형, v 라는 객체변수 만들어짐, new 뒤에 생성자 (가변적)
		 // 클래스이름 Vector = 생성자이름 Vector, ()는 매개변수
		 // () 안에 매개변수 입력없으면 기본으로 10개 만들어짐
		 // 10개가 넘어가면 그 이후엔 자동으로 더 만드는 데 10개 단위로 만든다
		 System.out.println("Vector Size : " + v.size());
	     System.out.println("Vector Capacity : " + v.capacity());
		 v.add(5); // add라는 메소드 : 추가
	     v.add(-1);
	     v.add(15);
	     v.add(5);
	     v.add(-1);
	     v.add(15);
	     v.add(5);
	     v.add(-1);
	     v.add(3);
	     v.add(3);
	     v.addElement(3);
	     System.out.println("Vector Size : " + v.size());
	     System.out.println("Vector Capacity : " + v.capacity()); 
	     
	     for (int i = 0; i < v.size(); i++) {
	    	  int n = v.get(i);
	    	  System.out.println(n);
	      }
	      
	     int sum=0;
	     for (int i = 0; i < v.size(); i++) {
	         int n = v.elementAt(i);
	         sum +=n;
	     }
	     System.out.println("Sum of Vector : " + sum);
	}

}
