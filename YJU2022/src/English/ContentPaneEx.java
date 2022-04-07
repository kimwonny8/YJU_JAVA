package English;

import javax.swing.*;
import java.awt.*;
//awt => 윈도우 창 안에서 원하는 걸 보게 해줌
// TEST
public class ContentPaneEx extends JFrame { 
	// JFrame이라는 클래스를 상속받음
	
	ContentPaneEx(){
		setTitle("JFrame 디자인하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 종료버튼을 눌렀을 때 보여주는 옵션 
		// EXIT_ON_CLOSE => 종료하면서 메모리 초기화시키는 옵션
		
		Container contentPane = getContentPane();
		// contentPane라는 변수에 ContentPane을 가져오는 것
		// getContentPane()은 javax.swing.RootPaneContainer의 메소드
		// 그림 그리는건 Jpanel이라는 객체를 가져옴 
		
		contentPane.setBackground(Color.GREEN);
		contentPane.setLayout(new FlowLayout());
		// 컴포넌트를 배치하는 방식 중에 하나 ( 5가지 중 하나인 FlowLayout )
		// FlowLayout => 컴포넌트를 놓는 순서대로		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JLabel("선택"));
		
		setSize(300, 200); // JFrame의 메소드
		setVisible(true); // 이걸 해야 보이게 됨 
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
