package English;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyTyped_Test extends JFrame {
	JPanel cp = new JPanel();
	JLabel la = new JLabel("getKeyChar()");
	JLabel la2 = new JLabel("getKeyCode()");
	
	KeyTyped_Test(){
		super("KeyTypedEvent�� getKeyCode()�� �������� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(cp); 
		cp.setLayout(null);
		cp.addKeyListener(new KeyTypedEvent());
		la.setBounds(50,10,300,100);
		la2.setBounds(50,60,300,100);
		la.setFont(new Font("�ü�ü",Font.BOLD,30));
		la2.setFont(new Font("�ü�ü",Font.BOLD,30));
		cp.add(la);
		cp.add(la2);
		setSize(500,400);
		setVisible(true);
		cp.requestFocus();
	}
	
		class KeyTypedEvent extends KeyAdapter {
			public void KeyTyped(KeyEvent e) {
				char KeyChar = e.getKeyChar();
				la.setText("KeyChar��: "+KeyChar);
				int keyCode = e.getKeyCode();
				la2.setText("keyCode��: "+keyCode);
				if(KeyChar == 'Q') System.exit(0);
			}
		}
	
	public static void main(String[] args) {
		new KeyTyped_Test();
	}

}
