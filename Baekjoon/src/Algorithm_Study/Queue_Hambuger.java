package Algorithm_Study;

import java.util.*;

public class Queue_Hambuger {

	public static void main(String[] args) {
		Queue <Integer> q=new LinkedList<>();
		
		int [] hambuger = {12, 15, 24}; 
		int [] arr = new int[3]; // �ܹ��� Ƚ�� �� �迭
		int repeat = 100; // �ùķ��̼� ���� Ƚ��
		int seat = 90; // seat �����ο� �����ؼ� ������
		int wait=0, success = 0, fail = 0;
		
		for(int j=0; j<repeat; j++) {
			for(int i=0; i<3600; i++) {
				if(i%15==0) { // 15�� �Ǹ� ���� �ֹ�
					Random rand = new Random();
					q.add(hambuger[rand.nextInt(3)]);
					wait++;
				}
				if(!q.isEmpty()) { // �ֹ� ������, �ֹ��Ϸ� -> ��ť
					if(i%q.peek()==0) {
						q.remove();
						wait--;
					}
				}
				if (wait > seat) break;
			}
			if(wait > seat) fail++; 
			else success++;
			
			while(!q.isEmpty()) { // �ùķ��̼� ������ �������ؼ� ť �ʱ�ȭ
				q.remove();
			}
		}
				
		System.out.printf("Success: %d, fail: %d, Percentage: %d%%", success, fail, success * 100 / repeat);
	}

}
