package danmaku;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import attackspells.Simple;

public class Main implements KeyListener {

	JFrame mainFrame;
	Game mainField;
	int slowDown=0;
	
	public Main() {
		// TODO Auto-generated constructor stub
		mainField = new Game();
		mainField.setPlayer(new Player(500,500));
		
		mainFrame = new JFrame("danmaku");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(900, 600);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(mainField);
		mainFrame.addKeyListener(mainField);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		
		Danmaku danmaku = new Danmaku();
		danmaku.addSpell(new Simple());
		mainField.setDanmaku(danmaku);
		
		
//		while(true)
//		{
//			try {
//				Thread.sleep(1000/60);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
