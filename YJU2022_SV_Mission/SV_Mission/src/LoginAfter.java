import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class LoginAfter extends JFrame {
	Login l;
	// DB ����
	   public static Connection makeConnection() {
	      String url = "jdbc:mariadb://localhost:3306/star_db";
	      Connection con = null;
	      
	      try {
	         Class.forName("org.mariadb.jdbc.Driver");
	         con = DriverManager.getConnection(url, "root", "1234");
	      } catch (ClassNotFoundException e) {
	         System.err.println("����̹��� ã�� �� �����ϴ�");
	      } catch (SQLException e) {
	         System.err.println("���ῡ �����߽��ϴ�");
	      }
	      return con;
	   }
	   Connection con = makeConnection();
	   Statement stmt = con.createStatement();
	   
	   JButton delete = new JButton("ȸ��Ż��");
	   JButton alter = new JButton("��������");
	   JButton gameStart = new JButton("���ӽ���");
	   
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
		                  
		                  l.login_message.setText("ȸ��Ż�� �Ϸ�Ǿ����ϴ�.");
		               } catch (SQLException e1) {}
		            }
		            else { 
		               // 2�� ���� ó��
		               l.reg_message.setVisible(true);
		            }
		           }
		      });
	   }
	   
	   
	   private void deleteAccount(Connection con, Statement stmt, String id, String password) throws SQLException {
	      String s = "select password from star_login where id = '" + id + "'";
	      ResultSet rs = stmt.executeQuery(s);

	      if (!(rs.next())) { l.login_message.setText("�������� �ʴ� ID�Դϴ�."); }
	      
	      String s1 = "delete from star_login where id = '" + id + "';";
	      stmt.executeUpdate(s1);
	   }
}