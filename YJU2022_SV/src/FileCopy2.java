import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("output.txt");
			int c;
			
			while((c=inputStream.read()) != -1) outputStream.write(c);
			
		} finally {
			if(inputStream != null) inputStream.close();
			if(outputStream != null) outputStream.close();
		}

	}

}
