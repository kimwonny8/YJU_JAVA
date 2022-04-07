package A;

import java.util.LinkedList;
import java.util.Queue;

//FIFO
//Enqueue 맨 뒤에 데이터 추가, Dequeue 맨 앞 데이터 삭제
public class Queue_En_De {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Queue<String> queue2=new LinkedList<>();
		
		queue.add(1); //queue에 값 1추가
		queue.add(2);
		
		queue.poll();//제거1: poll 첫번째 값 반환하고 제거, 비어있다면 null 반환
		queue.remove();//제거2: remove 첫번째 값 제거
		//clear() 초기화
		queue.peek();//peek 첫번째 값 확인
	}

}