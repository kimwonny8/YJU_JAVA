package English;

import javax.swing.*;
import java.awt.*;
//awt => ������ â �ȿ��� ���ϴ� �� ���� ����
// TEST
public class ContentPaneEx extends JFrame { 
	// JFrame�̶�� Ŭ������ ��ӹ���
	
	ContentPaneEx(){
		setTitle("JFrame �������ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �����ư�� ������ �� �����ִ� �ɼ� 
		// EXIT_ON_CLOSE => �����ϸ鼭 �޸� �ʱ�ȭ��Ű�� �ɼ�
		
		Container contentPane = getContentPane();
		// contentPane��� ������ ContentPane�� �������� ��
		// getContentPane()�� javax.swing.RootPaneContainer�� �޼ҵ�
		// �׸� �׸��°� Jpanel�̶�� ��ü�� ������ 
		
		contentPane.setBackground(Color.GREEN);
		contentPane.setLayout(new FlowLayout());
		// ������Ʈ�� ��ġ�ϴ� ��� �߿� �ϳ� ( 5���� �� �ϳ��� FlowLayout )
		// FlowLayout => ������Ʈ�� ���� �������		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JLabel("����"));
		
		setSize(300, 200); // JFrame�� �޼ҵ�
		setVisible(true); // �̰� �ؾ� ���̰� �� 
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
