package Algorithm_Study;

import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
		String a="F ABC CD EEE Z";
		
		StringTokenizer st = new StringTokenizer(a," ");
		
		// �迭 ����
		String [] arr=new String[st.countTokens()];

		// st�� ������ �ִ� ���� arr�� ���� ��ū�� ��´�
		for(int i=0; i<arr.length;i++) arr[i]=st.nextToken();
		
		sort(arr);
	}
	
	public static void sort(String[]arr) {
		String tmp="";
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) { // ������ ��Ҵ� ���ص� ��
				if(arr[j].compareTo(arr[j+1]) > 1) {
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}