import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(30);
		pq.add(80);
		pq.add(20);
		
		for(Integer o:pq) System.out.println(o);
		System.out.println("���� ����");
		while(!pq.isEmpty()) System.out.print(pq.remove()+" ");
	}

}