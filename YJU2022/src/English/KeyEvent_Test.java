package English;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEvent_Test extends JFrame {
	JPanel cp = new JPanel();
	JLabel la = new JLabel("¿Ã¶ó");
	JLabel la2 = new JLabel("±Â");
	KeyEvent_Test(){
		super("KeyEvent_Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(cp);
		cp.setLayout(null);
		cp.addKeyListener(new KeyE_test());
		la.setBounds(50,50,300,100);
		la.setFont(new Font("±Ã¼­Ã¼",Font.BOLD,30));
		la2.setBounds(50,100,300,100);
		la2.setFont(new Font("±Ã¼­Ã¼",Font.BOLD,30));
		cp.add(la);
		cp.add(la2);
		setSize(500,400);
		setVisible(true);
		cp.requestFocus();
	}
	class KeyE_test extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			char KeyChar = e.getKeyChar();
				la.setText("KeyChar°ª: "+KeyChar);
			int keyCode = e.getKeyCode();
				la2.setText("KeyCode°ª: "+Integer.toString(keyCode));
			switch(keyCode) {
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY()-10); break;
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY()+10); break;
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX()-10, la.getY()); break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX()+10, la.getY()); break;
			}
		}
	}
	public static void main(String [] args) {
		new KeyEvent_Test();
	}
}
