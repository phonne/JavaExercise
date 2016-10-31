package Week5;

import javax.swing.*;

class HelloGUI extends JFrame {
	JPanel p;
	JButton b;
	JLabel l;

	HelloGUI() {
		p = new JPanel();
		b = new JButton("press me");
		l = new JLabel("Hello!");
		p.add(b);// add button to panel
		p.add(l);// add label to panel
		add(p);// add panel to parent frame
	}

	public static void main(String[] args) {
		HelloGUI hg = new HelloGUI();
		hg.setSize(200, 200);
		hg.setVisible(true);
		// f.show(); //deprecated
	}
}