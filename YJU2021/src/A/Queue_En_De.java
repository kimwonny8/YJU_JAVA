package A;

import java.util.LinkedList;
import java.util.Queue;

//FIFO
//Enqueue �� �ڿ� ������ �߰�, Dequeue �� �� ������ ����
public class Queue_En_De {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Queue<String> queue2=new LinkedList<>();
		
		queue.add(1); //queue�� �� 1�߰�
		queue.add(2);
		
		queue.poll();//����1: poll ù��° �� ��ȯ�ϰ� ����, ����ִٸ� null ��ȯ
		queue.remove();//����2: remove ù��° �� ����
		//clear() �ʱ�ȭ
		queue.peek();//peek ù��° �� Ȯ��
	}

}