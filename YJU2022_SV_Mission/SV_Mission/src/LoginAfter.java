import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class LoginAfter extends JFrame {
	Login l;
	// DB 관련
	   public static Connection makeConnection() {
	      String url = "jdbc:mariadb://localhost:3306/star_db";
	      Connection con = null;
	      
	      try {
	         Class.forName("org.mariadb.jdbc.Driver");
	         con = DriverManager.getConnection(url, "root", "1234");
	      } catch (ClassNotFoundException e) {
	         System.err.println("드라이버를 찾을 수 없습니다");
	      } catch (SQLException e) {
	         System.err.println("연결에 실패했습니다");
	      }
	      return con;
	   }
	   Connection con = makeConnection();
	   Statement stmt = con.createStatement();
	   
	   JButton delete = new JButton("회원탈퇴");
	   JButton alter = new JButton("정보수정");
	   JButton gameStart = new JButton("게임시작");
	   
	   public LoginAfter() throws SQLException {
		   delete.setBounds(280, 300, 100, 25);
		   alter.setBounds(280, 250, 100, 25);
		   gameStart.setBounds(280, 200, 100, 25);
		   l.panel.add(delete);
		   l.panel.add(alter);
		   l.panel.add(gameStart);
	   
		   delete.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseClicked(MouseEvent e) {
		        	 delete();
		        }
		   });
		   
	   }
	   
	   public void delete() {
		   gameStart.setVisible(false);
		   alter.setVisible(false);
		   l.makeRegisterComponents();
		   l.showRegisterPage();
		   l.reg_register.setVisible(false);
		   
		   delete.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseClicked(MouseEvent e) {
		            if ((l.reg_passwd.getText().equals(l.reg_passwdCheck.getText()))) {
		               try {
		                  deleteAccount(con, stmt, l.reg_id.getText(), l.reg_passwd.getText());
		                  
			              l.hideRegisterPage();
		                  l.showLoginPage();
		                  
		                  l.login_message.setText("회원탈퇴가 완료되었습니다.");
		               } catch (SQLException e1) {}
		            }
		            else { 
		               // 2번 오류 처리
		               l.reg_message.setVisible(true);
		            }
		           }
		      });
	   }
	   
	   
	   private void deleteAccount(Connection con, Statement stmt, String id, String password) throws SQLException {
	      String s = "select password from star_login where id = '" + id + "'";
	      ResultSet rs = stmt.executeQuery(s);

	      if (!(rs.next())) { l.login_message.setText("존재하지 않는 ID입니다."); }
	      
	      String s1 = "delete from star_login where id = '" + id + "';";
	      stmt.executeUpdate(s1);
	   }
}
