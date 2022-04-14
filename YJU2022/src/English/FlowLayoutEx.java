package English;

import java.awt.*;
import java.awt.Dialog.ModalExclusionType; // �����
import javax.swing.*;


public class FlowLayoutEx extends JFrame {
	FlowLayoutEx() { // ������
		setTitle("FlowLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE); //�����
		Container cP = getContentPane();
		cP.setBackground(Color.green);
		cP.setFont(new Font("Arial", Font.ITALIC, 40));
		// cP�� ������Ʈ�� ���� ���̱� ������ Component�� Font ������� ������ ���� �ʴ´�.
		
		// ������Ʈ�� �������� ����! ���İ��� �ٸ� �ǹ�
		// cP.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
		cP.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		cP.add(new JLabel(cP.getFont().toString()));
		cP.add(new JLabel(cP.toString())); //FlowLayout �����ϱ� ���� ���
		cP.setLayout(new FlowLayout(0,30,40)); // ��������, ���򰣰� 30, ���������� 40 �ȼ���
		cP.add(new JLabel(cP.toString())); // FlowLayout ���� �� ���
		cP.add(new JButton("0: ��������"));
		cP.add(new JButton("1: �߾�����"));
		cP.add(new JButton("2: ��������"));
		cP.add(new JButton("3: ���� ����(��)���� ����"));
		cP.add(new JButton("4: �� ����(��)���� ����"));
		cP.add(new JLabel("FlowLayout �ǽ�"));
		cP.add(new JLabel(cP.getLayout().getClass().toString()));
		cP.add(new JLabel(cP.getLayout().toString()));
		
		setSize(1150,400); // ������ ũ�� ����
		setVisible(true); // ȭ�鿡 ������ ���
		//System.exit(0);
	}
	public static void main(String[] args) {
		new FlowLayoutEx();

	}

}
