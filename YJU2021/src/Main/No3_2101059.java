package Main;

//2101059 ������ _3������
import java.util.*;
public class No3_2101059 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("2101059 ������");
		
		//�й� �Է� �޾Ƽ� �� 4�ڸ� ���ڸ� b�� ����
		//p�� ����� ��, m�� ������ ��
		System.out.println("�й��� �Է��ϼ���.");
		int a, b=sc.nextInt()%10000, p=0, m=0; 

		while (true) {
			System.out.println("������ �Է��ϼ���.("+b+"�� �ԷµǸ� ����)");	
			a=sc.nextInt(); 
			if(a==b) break;
			else if(a==0) System.out.println("����! 0�� �ƴ� ������ �Է����ּ���.");
			else if(a>0) p+=a;
			else if(a<0) m+=a;	
		}
		System.out.println("����� ��:"+p+", ������ ��:"+m);
		
		//����� ������ ���� ���밪 �߿� ū�� ���
		m=m*-1;
		if(p>m) System.out.println("����� ���밪�� "+p+"�� ��Ů�ϴ�.");
		else if(p==m) System.out.println("��������� ���밪�� "+p+"�� ���� �����ϴ�."); //���� �� ���� �߰��߽��ϴ�.
		else System.out.println("������ ���밪�� "+m+"�� ��Ů�ϴ�.");
	}
}
