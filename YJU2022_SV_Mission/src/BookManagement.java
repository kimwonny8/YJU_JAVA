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
         //System.out.println("����̹� ���� ����");
         con = DriverManager.getConnection(url, id, password);
        // System.out.println("�����ͺ��̽� ���� ����");
      }catch (ClassNotFoundException e) {
         //System.out.println("����̹��� ã�� �� �����ϴ�.");
      }catch (SQLException e ) {
        // System.out.println("���ῡ �����Ͽ����ϴ�.");
      }
   
      return con;
   }

   private static void selectBook() throws SQLException {
	   Connection con = makeConnection();
	   Statement stmt = con.createStatement();
	   
	   System.out.print("��ȸ�� å id �Է�(��ü�� ��ü 0 �Է�): ");
		  int userid = sc.nextInt();
		  if(userid==0) {
			  ResultSet rs = stmt.executeQuery("select * from books");
			   System.out.println("\n-----���� å ���-----");
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
			   else  System.out.println("���̵� �����ϴ�.");
		  }
   }
   
   private static void addBook() throws SQLException {
	   
		 Connection con = makeConnection();
		 Statement stmt = con.createStatement();
		   
		 System.out.print("å �̸�? ");
		 String bookName = sc.next();
		 System.out.print("����? ");
		 String bookPublisher = sc.next();
		 System.out.print("�� �⵵ ����? ");
		 String bookYear = sc.next();
		 System.out.print("����? ");
		 int bookPrice = sc.nextInt();
		  
		 String s = "insert into books (title, publisher, year, price) values ";
		 s+="('"+bookName+"','"+bookPublisher+"','"+bookYear+"','"+bookPrice+"')";
		 ResultSet rs = stmt.executeQuery(s);
		 System.out.println("å �߰� �Ϸ�");
   }
   
   private static void updateBook() throws SQLException {
	   	 Connection con = makeConnection();
	   	 Statement stmt = con.createStatement();
	   	 System.out.print("�����ϰ���� å id �Է�: ");  
		 int userid = sc.nextInt();
		 System.out.print("�����ϰ� ���� ������? \n1.å �̸�\n2.����\n3.���۳⵵\n4.����\n >>> ��ȣ �Է�: ");
		 int n=sc.nextInt();
		 if(n==1) {
			  System.out.print("������ å �̸� �Է�: ");
			  String change=sc.next();
			  ResultSet rs = stmt.executeQuery("update books set title=\""+change+"\" where book_id="+userid);
			  System.out.println("���� �Ϸ�");
		  }
		  else if(n==2) {
			  System.out.print("������ ���� �Է�: ");
			  String change=sc.next();
			  ResultSet rs = stmt.executeQuery("update books set publisher=\""+change+"\" where book_id="+userid);
			  System.out.println("���� �Ϸ�");
		  }
		  else if(n==3) {
			  System.out.print("������ ���۳⵵ �Է�: ");
			  String change=sc.next();
			  ResultSet rs = stmt.executeQuery("update books set year=\""+change+"\" where book_id="+userid);
			  System.out.println("���� �Ϸ�");
		  }
		  else if(n==4) {
			  System.out.print("������ ���� �Է�: ");
			  int change=sc.nextInt();
			  ResultSet rs = stmt.executeQuery("update books set price="+change+" where book_id="+userid);
			  System.out.println("���� �Ϸ�");
		  }
   }
   private static void deleteBook() throws SQLException {
	      Connection con = makeConnection();
	   	  Statement stmt = con.createStatement();
	   	  System.out.print("�����ϰ� ���� å id �Է�: "); 
		  int userid = sc.nextInt();
		  ResultSet rs = stmt.executeQuery("delete from books where book_id="+userid);
		  System.out.println("�����Ǿ����ϴ�.");
   }
   
   public static void main(String[] args) throws SQLException {
	   
	  while(true) {
		  System.out.println("\n>> �������� �ý��� v1.5\n");
		  System.out.println("1.å���� �߰�\n2.å���� ����\n3.å���� ����\n4.å���� ��ȸ\n5.����");
		  System.out.print("\n>>> ��ȣ�� �����Ͻÿ�: ");
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
			  System.out.println("�ý��� ����");
			  break;
		  }
	   }
	  }
	  
   
}