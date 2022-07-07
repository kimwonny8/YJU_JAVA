import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
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
   }

}