package English;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	BorderLayoutEx(){
		setTitle("BorderLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		cp.setBackground(Color.RED);
		BorderLayout bd = new BorderLayout(10,20); //���򰣰�, ��������
		//BorderLayout bd = new BorderLayout();
		cp.setLayout(bd);
	
		JButton jb1 = new JButton("�߾�");
		JButton jb2 = new JButton("��");
		
		cp.add(jb1, bd.CENTER);
		cp.add(jb2, bd.NORTH);
		cp.add(new JButton("��"),bd.SOUTH); 	
		cp.add(new JButton("��"),bd.WEST);
		cp.add(new JButton("��"),bd.EAST);
		
		//cp.add(new Label("������Ʈ ���򰣰� : "+bd.getHgap()), bd.NORTH);
		//cp.add(new Label("������Ʈ �������� : "+bd.getVgap()), bd.SOUTH);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
