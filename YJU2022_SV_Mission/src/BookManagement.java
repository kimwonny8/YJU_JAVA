import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BookManagement {
	public static Scanner sc=new Scanner(System.in);
	
   public static Connection makeConnection() {
      String url = "jdbc:mariadb://localhost/user";
      String id = "root";
      String password = "1234";
      Connection con = null;
      try {
         Class.forName("org.mariadb.jdbc.Driver");
         //System.out.println("드라이버 적재 성공");
         con = DriverManager.getConnection(url, id, password);
        // System.out.println("데이터베이스 연결 성공");
      }catch (ClassNotFoundException e) {
         //System.out.println("드라이버를 찾을 수 없습니다.");
      }catch (SQLException e ) {
        // System.out.println("연결에 실패하였습니다.");
      }
   
      return con;
   }

   private static void selectBook() throws SQLException {
	   Connection con = makeConnection();
	   Statement stmt = con.createStatement();
	   
	   System.out.print("조회할 책 id 입력(전체면 전체 0 입력): ");
		  int userid = sc.nextInt();
		  if(userid==0) {
			  ResultSet rs = stmt.executeQuery("select * from books");
			   System.out.println("\n-----현재 책 재고-----");
			   while(rs.next()) {
				   int id = rs.getInt("book_id");
		    	   String title = rs.getString("title");
		    	   String pub = rs.getString("publisher");
		    	   String y = rs.getString("year");
		    	   int pri = rs.getInt("price");
		    	   System.out.println("id: "+id+", title: " +title+", publisher: "+pub+", year: "+y+", price: "+pri);
			   }
			   System.out.println();
		  }
		  else {
			  ResultSet rs = stmt.executeQuery("select * from books where book_id="+userid);
			  if(rs.next()) {
		    	   int id = rs.getInt("book_id");
		    	   String title = rs.getString("title");
		    	   String pub = rs.getString("publisher");
		    	   String y = rs.getString("year");
		    	   int pri = rs.getInt("price");
		    	   System.out.println("id: "+id+", title: " +title+", publisher: "+pub+", year: "+y+", price: "+pri);
			   }
			   else  System.out.println("아이디가 없습니다.");
		  }
   }
   
   private static void addBook() throws SQLException {
	   
		 Connection con = makeConnection();
		 Statement stmt = con.createStatement();
		   
		 System.out.print("책 이름? ");
		 String bookName = sc.next();
		 System.out.print("저자? ");
		 String bookPublisher = sc.next();
		 System.out.print("몇 년도 제작? ");
		 String bookYear = sc.next();
		 System.out.print("가격? ");
		 int bookPrice = sc.nextInt();
		  
		 String s = "insert into books (title, publisher, year, price) values ";
		 s+="('"+bookName+"','"+bookPublisher+"','"+bookYear+"','"+bookPrice+"')";
		 ResultSet rs = stmt.executeQuery(s);
		 System.out.println("책 추가 완료");
   }
   
   private static void updateBook() throws SQLException {
	   	 Connection con = makeConnection();
	   	 Statement stmt = con.createStatement();
	   	 System.out.print("수정하고싶은 책 id 입력: ");  
		 int userid = sc.nextInt();
		 System.out.print("수정하고 싶은 내용은? \n1.책 이름\n2.저자\n3.제작년도\n4.가격\n >>> 번호 입력: ");
		 int n=sc.nextInt();
		 if(n==1) {
			  System.out.print("변경할 책 이름 입력: ");
			  String change=sc.next();
			  ResultSet rs = stmt.executeQuery("update books set title=\""+change+"\" where book_id="+userid);
			  System.out.println("변경 완료");
		  }
		  else if(n==2) {
			  System.out.print("변경할 저자 입력: ");
			  String change=sc.next();
			  ResultSet rs = stmt.executeQuery("update books set publisher=\""+change+"\" where book_id="+userid);
			  System.out.println("변경 완료");
		  }
		  else if(n==3) {
			  System.out.print("변경할 제작년도 입력: ");
			  String change=sc.next();
			  ResultSet rs = stmt.executeQuery("update books set year=\""+change+"\" where book_id="+userid);
			  System.out.println("변경 완료");
		  }
		  else if(n==4) {
			  System.out.print("변경할 가격 입력: ");
			  int change=sc.nextInt();
			  ResultSet rs = stmt.executeQuery("update books set price="+change+" where book_id="+userid);
			  System.out.println("변경 완료");
		  }
   }
   private static void deleteBook() throws SQLException {
	      Connection con = makeConnection();
	   	  Statement stmt = con.createStatement();
	   	  System.out.print("삭제하고 싶은 책 id 입력: "); 
		  int userid = sc.nextInt();
		  ResultSet rs = stmt.executeQuery("delete from books where book_id="+userid);
		  System.out.println("삭제되었습니다.");
   }
   
   public static void main(String[] args) throws SQLException {
	   
	  while(true) {
		  System.out.println("\n>> 서적관리 시스템 v1.5\n");
		  System.out.println("1.책정보 추가\n2.책정보 수정\n3.책정보 삭제\n4.책정보 조회\n5.종료");
		  System.out.print("\n>>> 번호를 선택하시오: ");
		  int num=sc.nextInt();
		  
		  if(num==1) {
			  addBook();
		  }
		  else if(num==2) {
			  updateBook();
		  }
		  else if(num==3) {
			  deleteBook();
		  }
		  else if(num==4) {
			  selectBook();
		  }
		  else if(num==5) {
			  System.out.println("시스템 종료");
			  break;
		  }
	   }
	  }
	  
   
}