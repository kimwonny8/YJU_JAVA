package English;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Action_Test extends JFrame {
	Action_Test(){
		setTitle("ActionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.setBackground(Color.CYAN);
		JButton btn1 = new JButton("Hello");
		JLabel lb1 = new JLabel("   ¾È³ç! ÀÌ¶ó´Â ¶æ");
		btn1.setFont(new Font("±Ã¼­Ã¼",Font.BOLD,30));
		
		btn1.addActionListener(new TestAListener());
		lb1.setFont(new Font("±Ã¼­Ã¼",Font.BOLD,20));
		cp.add(btn1);
		cp.add(lb1);
		setSize(500,300);
		setVisible(true);
	}
	class TestAListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			
			if(b.getText().equals("Hello")) {
				b.setBackground(Color.RED);
				b.setText("Holla");
			}
			else {
				b.setBackground(Color.ORANGE);
				b.setText("Hello");
			}
		}
	}
	public static void main(String[]args) {
		new Action_Test();
	}
}
