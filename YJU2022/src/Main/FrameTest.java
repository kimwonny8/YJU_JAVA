package Main;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class FrameTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		//�θ� �������� ȭ�� ����� ��ġ
		f.setLocationRelativeTo(null);
		// ���̾ƿ� ����
		f.getContentPane().setLayout(null);
		
		
		JButton startBt = new JButton("�����ϱ�");
		JButton exitBt = new JButton("�����ϱ�");
		JLabel txt=new JLabel("ȯ���մϴ�");
		
		startBt.setBounds(75, 350, 150, 50);
		exitBt.setBounds(275, 350, 150, 50);
		txt.setBounds(120, 50, 150, 50);
		txt.setBounds(350, 100, 150, 150); 
		//startBt.setBackground(Color.CYAN);
		//exitBt.setBackground(Color.BLUE);
		
		f.add(startBt);
		f.add(exitBt);
		f.add(txt);

	}

}
