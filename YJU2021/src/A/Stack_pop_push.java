package A;

import java.util.Scanner;
import java.util.Stack;
//���Լ��� Last in First out
public class Stack_pop_push {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Stack<Integer> stack =new Stack<Integer>();
			
		int n=sc.nextInt();
			
		for(int i=0; i<n; i++) {
			int number=sc.nextInt();
			if(number==0) stack.pop(); //�������� ���� ������ ���� = pop
			else stack.push(number); //�������� ������ ���� = push
			//������ ������ ���� = peek, �ʱ�ȭ = clear
		}
		int sum=0;
		for(int x:stack) sum+=x;
		System.out.println(sum);
	 }
	}