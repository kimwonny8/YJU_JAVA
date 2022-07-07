import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("input.jpg");
			out = new FileOutputStream("output.jpg");
			int c;
			
			while((c=in.read()) != -1) out.write(c);
			
		} finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}

	}

}
