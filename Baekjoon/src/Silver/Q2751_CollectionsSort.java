package Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2751_CollectionsSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list); //Timsort -> �պ� �� ��������

		for(int i=0; i<n; i++) {
			sb.append(list.get(i)).append("\n");
			//sb�� list i��°�� �߰��ϰ�, ���� ����
		}
		System.out.println(sb);
	}
}