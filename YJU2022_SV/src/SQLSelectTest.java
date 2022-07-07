import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLSelectTest {
   public static Connection makeConnection() {
      String url = "jdbc:mariadb://localhost/user";
      String id = "root";
      String password = "1234";
      Connection con = null;
      try {
         Class.forName("org.mariadb.jdbc.Driver");
         System.out.println("����̹� ���� ����");
         con = DriverManager.getConnection(url, id, password);
         System.out.println("�����ͺ��̽� ���� ����");
      }catch (ClassNotFoundException e) {
         System.out.println("����̹��� ã�� �� �����ϴ�.");
      }catch (SQLException e ) {
         System.out.println("���ῡ �����Ͽ����ϴ�.");
      }
   
      return con;
   }
   public static void main(String[] args) throws SQLException {
	   Connection con = makeConnection();
	   Statement stmt = con.createStatement();
	   Scanner sc=new Scanner(System.in);
	   System.out.print("\n��ȸ�� book_id �Է�: ");
	   int userid = sc.nextInt();
	   ResultSet rs = stmt.executeQuery("select * from books where book_id="+userid);
      
	   if(rs.next()) {
    	   int id = rs.getInt("book_id");
    	   String title = rs.getString("title");
    	   System.out.println(id + " " + title);
	   }
	   else  System.out.println("���̵� �����ϴ�.");
	   
	   
//	   if(rs.next()) {
//		   do {
//    	         int id = rs.getInt("book_id");
//    	         String title = rs.getString("title");
//    	         System.out.println(id + " " + title);
//		   } while(rs.next());
//      }
//	   else  System.out.println("���̵� �����ϴ�.");
   }
}