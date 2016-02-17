package danmaku;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Frame {

	JFrame main;
	
	
	public Frame() {
		// TODO Auto-generated constructor stub
		main = new JFrame("danmaku");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setSize(900, 600);
		main.setLayout(new BorderLayout());
		main.setLocationRelativeTo(null);
		main.setVisible(true);
	}

}
