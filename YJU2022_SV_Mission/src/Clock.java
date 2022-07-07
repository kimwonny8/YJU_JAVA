import java.io.*;
import java.awt.event.*;
import java.util.Date;
import java.util.Scanner;

import javax.swing.*;

public class Clock extends JFrame implements ActionListener  {
	static int h,m,s;
	static PrintWriter out = null;
	static JFrame f =new JFrame();
	
	static JButton btn = new JButton("Save");
	static JLabel label = new JLabel();
	
	Clock() throws IOException {
		btn.setBounds(110, 150, 70, 40);
		label.setBounds(80, 50, 300, 100);
		label.setFont(label.getFont().deriveFont(20.0f));
		label.setText("Clock");
		label.setVisible(true);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		f.add(label);
		f.add(btn);
		f.setLocationRelativeTo(null);
		
		btn.addActionListener(this);
		
//		try {
//			h=new Date().getHours();
//			m=new Date().getMinutes();
//			s=new Date().getSeconds();
//			
//			out=new PrintWriter(new FileWriter("mission.txt"));
//			out.print(h+"시 "+m+"분 "+s+"초");
//			
//			out.flush();
//			
//		} finally {
//			if(out != null) out.close();
//		}	
		Thread up = new Thread(new SecondUp());
		up.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			try {
				out=new PrintWriter(new FileWriter("mission.txt"));
			} catch (IOException err) {
				err.printStackTrace();
			}
				out.print(h+"시 "+m+"분 "+s+"초");
				out.flush();
			}
	}
	public static void main(String[] args) throws IOException {
		new Clock();
	}
}

class SecondUp implements Runnable {
	Clock c;
	ObjectInputStream in = null;
	static InputStream ins;
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			c.s++;
			if(c.s>=60) {
				c.s=0;
				c.m++;
			}
			if(c.m>=60) {
				c.m=0;
				c.s++;
			}
			if(c.h>=24) {
				c.h=0;
			}
			try {
				ins = new FileInputStream("mission.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		    Scanner obj = new Scanner(ins);
		    while (obj.hasNextLine()) {
		    	c.label.setText(obj.nextLine());
		    }
		    
		    	
		}
		
	}
}
