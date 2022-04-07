package Main2;

class Tv {
	int 채널;
	int 소리;
	boolean 전원;
	String 이름;
	private int test=100;
	
	Tv(){
		채널 = 10000;
		System.out.println("채널:"+채널);
	}
	Tv(String a){
		이름 = a;
		System.out.println("이름:"+이름);
	}
	Tv(int a, String b){
		채널=a;
		이름=b;
		System.out.println("채널:"+채널+" 이름:"+이름);
	}
	
	public int getTest() {return test;}
	public void setTest(int test) { this.test=test; }
	
	int add(int x, int y) { return x+y;}
	int 현재채널() { return 채널; }
	int 현재소리() { return 소리; }
	void 채널바꾸기( int x ) { 채널 = x; }
	void 소리바꾸기 ( int x ) { 소리 = x; }
	void print() { 
		System.out.println("채널:"+채널+" 이름:"+이름);}
}

public class Sample {

	public static void main(String[] args) {
		Tv my=new Tv();
		Tv your=new Tv("유어");
		Tv hi=new Tv(500,"하이");

		my.소리=5;
		my.채널=11;
		my.채널바꾸기(21);
		int a=my.현재채널();
		System.out.println("my의 현재채널: "+a);
		my.이름=("마이이름없어");
		my.print();
		
		System.out.println(my.add(1, 1));
		
		System.out.println(my.getTest());
		my.setTest(1000);
		System.out.println(my.getTest());
	}

}
