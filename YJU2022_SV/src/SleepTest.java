
public class SleepTest {

	public static void main(String[] args) throws InterruptedException {
		String messages[] = { 
				"Pride will hava a fall.",
				"Power is dangerous unless you hava humility.",
				"Office changes manners.",
				"Empty vessels make the most sound."
		};
		
		for(int i=0; i<messages.length; i++) {
			Thread.sleep(1000);
			System.out.println(messages[i]);
		}

	}

}
