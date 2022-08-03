import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import javax.swing.table.*;
import javax.swing.border.*;

class TribeSelection extends JFrame {
	StarUI User;
	TribeSelection()  {
		User = new StarUI(0, "User");
		User.setBounds(0, 58, 640, 650);
		User.setVisible(true);
		User.setLocationRelativeTo(null);

	}
	public static void main(String[] args) throws SQLException   {
		new Login();
		// new TribeSelection();

	}

}