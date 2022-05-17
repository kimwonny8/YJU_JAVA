package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2 extends JFrame {
	private JLabel label;
	private JButton button;
	private boolean onOff = true;
	
	public MyFrame2() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				if(onOff == true) {
					label.setText("켜짐");
					onOff = false;
				}
				else {
					label.setText("꺼짐");
					onOff = true;
				}
			}
				
		}
	}
	
}

public class ActionListenerTest {
	public static void main(String[] args) {
		MyFrame2 t = new MyFrame2();
	}
}

