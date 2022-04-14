package English;

import java.awt.*;
import java.awt.Dialog.ModalExclusionType; // 모달폼
import javax.swing.*;


public class FlowLayoutEx extends JFrame {
	FlowLayoutEx() { // 생성자
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE); //모달폼
		Container cP = getContentPane();
		cP.setBackground(Color.green);
		cP.setFont(new Font("Arial", Font.ITALIC, 40));
		// cP는 컴포넌트를 놓은 곳이기 때문에 Component의 Font 사이즈는 영향을 받지 않는다.
		
		// 컴포넌트가 놓여지는 방향! 정렬과는 다른 의미
		// cP.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
		cP.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		cP.add(new JLabel(cP.getFont().toString()));
		cP.add(new JLabel(cP.toString())); //FlowLayout 적용하기 전에 출력
		cP.setLayout(new FlowLayout(0,30,40)); // 왼쪽정렬, 수평간격 30, 수직간격을 40 픽셀로
		cP.add(new JLabel(cP.toString())); // FlowLayout 적용 후 출력
		cP.add(new JButton("0: 좌측정렬"));
		cP.add(new JButton("1: 중앙정렬"));
		cP.add(new JButton("2: 우측정렬"));
		cP.add(new JButton("3: 시작 지점(좌)부터 정렬"));
		cP.add(new JButton("4: 끝 지점(우)부터 정렬"));
		cP.add(new JLabel("FlowLayout 실습"));
		cP.add(new JLabel(cP.getLayout().getClass().toString()));
		cP.add(new JLabel(cP.getLayout().toString()));
		
		setSize(1150,400); // 프레임 크기 설정
		setVisible(true); // 화면에 프레임 출력
		//System.exit(0);
	}
	public static void main(String[] args) {
		new FlowLayoutEx();

	}

}
