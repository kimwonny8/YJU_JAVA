import java.util.Date;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		Date d = new Date();
		sb.append(d+"\n");
		sb.append(1900+d.getYear()+"\n");
		sb.append(d.getMonth()+1+"\n");
		sb.append(d.getDate()+"\n");
		System.out.println(sb);
	}
}
