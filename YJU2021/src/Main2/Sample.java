package Main2;

class Tv {
	int ä��;
	int �Ҹ�;
	boolean ����;
	String �̸�;
	private int test=100;
	
	Tv(){
		ä�� = 10000;
		System.out.println("ä��:"+ä��);
	}
	Tv(String a){
		�̸� = a;
		System.out.println("�̸�:"+�̸�);
	}
	Tv(int a, String b){
		ä��=a;
		�̸�=b;
		System.out.println("ä��:"+ä��+" �̸�:"+�̸�);
	}
	
	public int getTest() {return test;}
	public void setTest(int test) { this.test=test; }
	
	int add(int x, int y) { return x+y;}
	int ����ä��() { return ä��; }
	int ����Ҹ�() { return �Ҹ�; }
	void ä�ιٲٱ�( int x ) { ä�� = x; }
	void �Ҹ��ٲٱ� ( int x ) { �Ҹ� = x; }
	void print() { 
		System.out.println("ä��:"+ä��+" �̸�:"+�̸�);}
}

public class Sample {

	public static void main(String[] args) {
		Tv my=new Tv();
		Tv your=new Tv("����");
		Tv hi=new Tv(500,"����");

		my.�Ҹ�=5;
		my.ä��=11;
		my.ä�ιٲٱ�(21);
		int a=my.����ä��();
		System.out.println("my�� ����ä��: "+a);
		my.�̸�=("�����̸�����");
		my.print();
		
		System.out.println(my.add(1, 1));
		
		System.out.println(my.getTest());
		my.setTest(1000);
		System.out.println(my.getTest());
	}

}
