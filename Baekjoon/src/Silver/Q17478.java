package Silver;

import java.util.Scanner;

public class Q17478 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		String m="____";
		System.out.println("\"����Լ��� ������?\"");
		System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		for(int i=1; i<=n; i++) {
			if(i!=n) {
				System.out.println(m.repeat(i)+"\"����Լ��� ������?\"");
				System.out.println(m.repeat(i)+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
				System.out.println(m.repeat(i)+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
				System.out.println(m.repeat(i)+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			}
			else {
				System.out.println(m.repeat(i)+"\"����Լ��� ������?\"");
				System.out.println(m.repeat(i)+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			}
		}
		for(int i=n; i>=0; i--) {
			System.out.println(m.repeat(i)+"��� �亯�Ͽ���.");
		}
			
	}
}
