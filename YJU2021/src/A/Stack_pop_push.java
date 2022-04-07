package A;

import java.util.Scanner;
import java.util.Stack;
//후입선출 Last in First out
public class Stack_pop_push {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Stack<Integer> stack =new Stack<Integer>();
			
		int n=sc.nextInt();
			
		for(int i=0; i<n; i++) {
			int number=sc.nextInt();
			if(number==0) stack.pop(); //마지막에 넣은 데이터 삭제 = pop
			else stack.push(number); //마지막에 데이터 삽입 = push
			//마지막 데이터 추출 = peek, 초기화 = clear
		}
		int sum=0;
		for(int x:stack) sum+=x;
		System.out.println(sum);
	 }
	}