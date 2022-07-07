import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScanTest2 {
	public static void main(String[] args) throws IOException {
		Scanner s = null;
		double sum = 0;
		PrintWriter out = null;
		
//		out = new PrintWriter(new FileWriter("news.txt"));
//		out.println("9.5");
//		out.println("1000");
//		out.flush();
		s = new Scanner(new BufferedReader(new FileReader("news.txt")));
		while(s.hasNext()) {
			if(s.hasNextDouble()) sum+=s.nextDouble();
			else s.next();
		}
		if(out!=null) out.close();
		if(s!=null) s.close();
		System.out.println(sum);
	
	}
}

