import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame  {
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
	String name = null;

	Font font = new Font("궁서체", Font.PLAIN, 18);
	JFrame f=new JFrame();
	static JPanel panel=new JPanel(){ImageIcon i = new ImageIcon("img/background.jpg");
	public void paintComponent(Graphics g) {
		g.drawImage(i.getImage(), 0, 0, 640, 480, null);
	}
	};

	JLabel login_idLabel = new JLabel("ID");
	JLabel login_passwdLabel = new JLabel("Password");
	JTextField login_id = new JTextField(10);

	JPasswordField login_passwd = new JPasswordField(15);
	JButton login_login = new JButton("로그인");
	JButton login_register = new JButton("회원가입");
	JLabel login_message = new JLabel();

	JLabel reg_idLabel = new JLabel("ID");
	JLabel reg_passwdLabel = new JLabel("비밀번호");
	JLabel reg_passwdCheckLabel = new JLabel("비밀번호 확인");
	JTextField reg_id = new JTextField(10);
	JPasswordField reg_passwd = new JPasswordField(15);
	JPasswordField reg_passwdCheck = new JPasswordField(15);
	JButton reg_register = new JButton("회원가입");
	JLabel reg_message = new JLabel("실패");

	JButton delete = new JButton("회원탈퇴");
	JButton delete2 = new JButton("회원탈퇴");
	JButton alter = new JButton("정보수정");
	JButton alter2 = new JButton("정보수정");
	JButton gameStart = new JButton("게임시작");


	public Login() throws SQLException {
		setTitle("Game Start");
		setSize(640,515);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 640, 480);
		add(panel);
		makeLoginComponents();
		makeRegisterComponents();
	}

	
	private void makeLoginComponents() {
		login_idLabel.setBounds(230, 200, 100, 20);
		login_idLabel.setFont(font);
		login_idLabel.setForeground(Color.white);
		login_id.setBounds(310, 200, 100, 25);

		login_passwdLabel.setBounds(200, 240, 100, 20);
		login_passwdLabel.setFont(font);
		login_passwdLabel.setForeground(Color.white);
		login_passwd.setBounds(310, 240, 100, 25);

		login_login.setBounds(200, 300, 100, 25);
		login_register.setBounds(310, 300, 100, 25);

		login_message.setBounds(80, 350, 450, 25);
		login_message.setFont(font);
		login_message.setVisible(true);
		login_message.setForeground(Color.red);
		login_message.setHorizontalAlignment(JLabel.CENTER); // 중앙정렬

		panel.add(login_idLabel);
		panel.add(login_id);
		panel.add(login_passwdLabel);
		panel.add(login_passwd);
		panel.add(login_login);
		panel.add(login_register);
		panel.add(login_message);

		login_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					name=login_id.getText();
					login(con, stmt, login_id.getText(), login_passwd.getText());

				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});

		login_register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hideLoginPage();
				showRegisterPage();
			}
		});
	}   

	
	private void makeRegisterComponents() {
		reg_idLabel.setBounds(270, 205, 100, 20);
		reg_idLabel.setFont(font);
		reg_idLabel.setForeground(Color.white);
		reg_id.setBounds(310, 205, 100, 20);

		reg_passwdLabel.setBounds(130, 245, 170, 20);
		reg_passwdLabel.setFont(font);
		reg_passwdLabel.setForeground(Color.white);
		reg_passwdLabel.setHorizontalAlignment(JLabel.RIGHT);
		reg_passwd.setBounds(310, 245, 100, 20);

		reg_passwdCheckLabel.setBounds(130, 285, 170, 20);
		reg_passwdCheckLabel.setFont(font);
		reg_passwdCheckLabel.setForeground(Color.white);
		reg_passwdCheckLabel.setHorizontalAlignment(JLabel.RIGHT);
		reg_passwdCheck.setBounds(310, 285, 100, 20);
		reg_register.setBounds(270, 335, 100, 25);

		hideRegisterPage();

		panel.add(reg_idLabel);
		panel.add(reg_id);
		panel.add(reg_passwdLabel);
		panel.add(reg_passwd);
		panel.add(reg_passwdCheckLabel);
		panel.add(reg_passwdCheck);
		panel.add(reg_register);
		panel.add(delete2);
		panel.add(alter2);
		
		reg_register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ((reg_passwd.getText().equals(reg_passwdCheck.getText()))) {
					try {
						register(con, stmt, reg_id.getText(), reg_passwdCheck.getText());
						login_message.setText("회원가입이 완료되었습니다.");
					} catch (SQLException e1) {
						login_message.setText("중복된 ID입니다.");
					}
					showLoginPage();
					hideRegisterPage();
					login_message.setVisible(true);
				}
				else reg_message.setVisible(true);
			}
		});
	}

	
	private void makeLoginAfter() {
		delete.setBounds(280, 300, 100, 25);
		alter.setBounds(280, 250, 100, 25);
		gameStart.setBounds(280, 200, 100, 25);
		panel.add(delete);
		panel.add(alter);
		panel.add(gameStart);
		delete.setVisible(true);
		alter.setVisible(true);
		gameStart.setVisible(true);

		delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				delete();
			}
		});
		alter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				alter();
			}
		});
		gameStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new TribeSelection();
			}
		});
	}

	
	public void alter() {
		gameStart.setVisible(false);
		delete.setVisible(false);
		alter.setVisible(false);
		makeRegisterComponents();
		showRegisterPage();
		reg_register.setVisible(false);

		alter2.setBounds(280, 330, 100, 25);
		alter2.setVisible(true);
		alter2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (name.equals(reg_id.getText()) && (reg_passwd.getText().equals(reg_passwdCheck.getText()))) {
					try {
						alterAccount(con, stmt, reg_id.getText(), reg_passwd.getText(),reg_passwdCheck.getText());
						hideRegisterPage();
						delete.setVisible(true);
						gameStart.setVisible(true);
						alter.setVisible(true);
						alter2.setBounds(280, 250, 100, 25);
						login_message.setVisible(true);
						login_message.setText("회원 정보 수정 완료.");

					} catch (SQLException e1) {
						login_message.setText("존재하지 않는 회원입니다.");
					}
					alter2.setVisible(false);
				}
				else { 
					login_message.setVisible(true);
					login_message.setText("정보수정에 실패했습니다.");
				}
			}
		});

	}

	
	public void delete() {
		gameStart.setVisible(false);
		alter.setVisible(false);
		delete.setVisible(false);
		showRegisterPage();
		reg_register.setVisible(false);

		delete2.setBounds(280, 330, 100, 25);
		delete2.setVisible(true);

		delete2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (name.equals(reg_id.getText()) && (reg_passwd.getText().equals(reg_passwdCheck.getText()))) {
					try {
						deleteAccount(con, stmt, reg_id.getText(), reg_passwdCheck.getText());
						hideRegisterPage();
						showLoginPage();	
						login_message.setVisible(true);
						login_message.setText("회원탈퇴가 완료되었습니다.");
					} catch (SQLException e1) {	
					}
					delete2.setVisible(false);
				}
				else { 
					login_message.setVisible(true);
					login_message.setText("회원탈퇴에 실패했습니다.");
				}

			}
		});
	}

	// 로그인 시 발생 가능한 오류
	private void login(Connection con, Statement stmt, String id, String password) throws SQLException {
		String s = "select password from star_login where id = '" + id + "'";
		ResultSet rs = stmt.executeQuery(s);

		if (rs.next()) {
			if (rs.getString("password").equals(password)) {
				hideLoginPage();
				makeLoginAfter();

			} else { 
				login_message.setVisible(true);
				login_message.setText("잘못된 비밀번호입니다."); }
		}
		else {
			login_message.setVisible(true);
			login_message.setText("존재하지 않는 ID입니다.");
		}
	}
	

	private void register(Connection con, Statement stmt, String id, String password) throws SQLException {
		String s = "insert into star_login (id, password) values ('" + id + "', '" + password + "');";
		stmt.executeUpdate(s);
	}

	
	public void alterAccount(Connection con, Statement stmt, String id, String password, String passwordcheck) throws SQLException {
		String s = "select password from star_login where id = '" + id + "'";
		ResultSet rs = stmt.executeQuery(s);

		if (rs.next()) {
			if (passwordcheck.equals(password)) { 
				String s1 = "update star_login set password=\'"+password+"\' where id = \'" + id + "\'";
				stmt.executeUpdate(s1);
			}
		}

	}

	private void deleteAccount(Connection con, Statement stmt, String id, String password) throws SQLException {
		String s = "select password from star_login where id = '" + id + "'";
		ResultSet rs = stmt.executeQuery(s);

		if (!(rs.next())) { login_message.setText("존재하지 않는 ID입니다."); }


		String s1 = "delete from star_login where id = '" + id + "';";
		stmt.executeUpdate(s1);
	}


	public void hideLoginPage() {
		login_idLabel.setVisible(false);
		login_id.setVisible(false);
		login_passwdLabel.setVisible(false);
		login_passwd.setVisible(false);
		login_login.setVisible(false);
		login_register.setVisible(false);
		login_message.setVisible(false);
		login_message.setText("");
		empty();
	}
	public void showLoginPage() {
		login_idLabel.setVisible(true);
		login_id.setVisible(true);
		login_passwdLabel.setVisible(true);
		login_passwd.setVisible(true);
		login_login.setVisible(true);
		login_register.setVisible(true);
		login_message.setVisible(true);
		empty();
	}
	public void showRegisterPage() {
		reg_idLabel.setVisible(true);
		reg_id.setVisible(true);
		reg_passwdLabel.setVisible(true);
		reg_passwd.setVisible(true);
		reg_passwdCheckLabel.setVisible(true);
		reg_passwdCheck.setVisible(true);
		reg_register.setVisible(true);
		login_message.setVisible(false);
		empty();
	}
	public void hideRegisterPage() {
		reg_idLabel.setVisible(false);
		reg_id.setVisible(false);
		reg_passwdLabel.setVisible(false);
		reg_passwd.setVisible(false);
		reg_passwdCheckLabel.setVisible(false);
		reg_passwdCheck.setVisible(false);
		reg_register.setVisible(false);
		reg_message.setVisible(false);
		login_message.setVisible(false);
		empty();
	}
	public void empty() {
		login_id.setText("");
		login_passwd.setText("");
		reg_id.setText("");
		reg_passwd.setText("");
		reg_passwdCheck.setText("");
	}

}