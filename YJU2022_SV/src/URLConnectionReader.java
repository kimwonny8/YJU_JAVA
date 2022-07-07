import java.net.*;
import java.io.*;

public class URLConnectionReader {

	public static void main(String[] args) throws Exception {
		URL naver = new URL("https://www.naver.com/");
		URLConnection yc = naver.openConnection();
		BufferedReader in = new BufferedReader(
							new InputStreamReader(
							yc.getInputStream()));
		String inLine;
		
		while((inLine=in.readLine()) != null) System.out.println(inLine);
		in.close();


	}

}
