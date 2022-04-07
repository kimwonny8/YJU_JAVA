package Main2;

class Television {
	boolean OnOff; 
	int channel; //멤버 변수
	int volume;
	
	//출력을 위한 메소드
	void print() {
		System.out.println("채널:"+channel+", 볼륨:"+volume);
	}
}

public class TvTest {

	public static void main(String[] args) {
		Television MyTV = new Television();
		Television YourTV =new Television();
		
		MyTV.channel=7;
		MyTV.volume=10;
		MyTV.print();
		
		YourTV.channel=10;
		YourTV.volume=8;		
		YourTV.print();
		
		System.out.println(MyTV.channel+" "+MyTV.volume);
	}
}
