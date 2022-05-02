package English;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	BorderLayoutEx(){
		setTitle("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		cp.setBackground(Color.RED);
		BorderLayout bd = new BorderLayout(10,20); //수평간격, 수직간격
		//BorderLayout bd = new BorderLayout();
		cp.setLayout(bd);
	
		JButton jb1 = new JButton("중앙");
		JButton jb2 = new JButton("상");
		
		cp.add(jb1, bd.CENTER);
		cp.add(jb2, bd.NORTH);
		cp.add(new JButton("하"),bd.SOUTH); 	
		cp.add(new JButton("좌"),bd.WEST);
		cp.add(new JButton("우"),bd.EAST);
		
		//cp.add(new Label("컴포넌트 수평간격 : "+bd.getHgap()), bd.NORTH);
		//cp.add(new Label("컴포넌트 수직간격 : "+bd.getVgap()), bd.SOUTH);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
