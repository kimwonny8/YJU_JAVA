package English;

import java.util.Vector; 
// import => �ڹ��� ��ƿ���� Vector��� ��ü(class)�� �޸𸮿� �ҷ���
// test
public class VectorEx {
	public static void main(String[] args) {
		 Vector<Integer> v = new Vector<Integer>(7); 
		 // ������, v ��� ��ü���� �������, new �ڿ� ������ (������)
		 // Ŭ�����̸� Vector = �������̸� Vector, ()�� �Ű�����
		 // () �ȿ� �Ű����� �Է¾����� �⺻���� 10�� �������
		 // 10���� �Ѿ�� �� ���Ŀ� �ڵ����� �� ����� �� 10�� ������ �����
		 System.out.println("Vector Size : " + v.size());
	     System.out.println("Vector Capacity : " + v.capacity());
		 v.add(5); // add��� �޼ҵ� : �߰�
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
