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
         System.out.println("드라이버 적재 성공");
         con = DriverManager.getConnection(url, id, password);
         System.out.println("데이터베이스 연결 성공");
      }catch (ClassNotFoundException e) {
         System.out.println("드라이버를 찾을 수 없습니다.");
      }catch (SQLException e ) {
         System.out.println("연결에 실패하였습니다.");
      }
   
      return con;
   }
   public static void main(String[] args) throws SQLException {
	   Connection con = makeConnection();
	   Statement stmt = con.createStatement();
	   Scanner sc=new Scanner(System.in);
	   System.out.print("\n조회할 book_id 입력: ");
	   int userid = sc.nextInt();
	   ResultSet rs = stmt.executeQuery("select * from books where book_id="+userid);
      
	   if(rs.next()) {
    	   int id = rs.getInt("book_id");
    	   String title = rs.getString("title");
    	   System.out.println(id + " " + title);
	   }
	   else  System.out.println("아이디가 없습니다.");
	   
	   
//	   if(rs.next()) {
//		   do {
//    	         int id = rs.getInt("book_id");
//    	         String title = rs.getString("title");
//    	         System.out.println(id + " " + title);
//		   } while(rs.next());
//      }
//	   else  System.out.println("아이디가 없습니다.");
   }
}