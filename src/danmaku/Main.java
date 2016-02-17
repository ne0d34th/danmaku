package danmaku;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import attackspells.Simple;

public class Main implements KeyListener {

	JFrame mainFrame;
	Game mainField;
	Player player;
	int dx, dy;
	int slowDown=0;
	
	public Main() {
		// TODO Auto-generated constructor stub
		mainField = new Game();
		player = new Player(500, 500);
		mainField.setPlayer(player);
		
		mainFrame = new JFrame("danmaku");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(900, 600);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(mainField);
		mainFrame.addKeyListener(this);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		
		Danmaku danmaku = new Danmaku();
		danmaku.addSpell(new Simple());
		mainField.setDanmaku(danmaku);
		
		
		while(true)
		{
			player.getSprite().getPosition().translate(dx,dy);
			mainField.setPlayer(player);
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_LEFT)
		{
			dx = -(player.getSpeed()-this.slowDown);
		}
		else if(key==KeyEvent.VK_RIGHT)
		{
			dx = (player.getSpeed()-this.slowDown);
		}
		else if(key==KeyEvent.VK_UP)
		{
			dy = -(player.getSpeed()-this.slowDown);
		}
		else if(key==KeyEvent.VK_DOWN)
		{
			dy = (player.getSpeed()-this.slowDown);
		}
		else if(key==KeyEvent.VK_SHIFT)
		{
			this.slowDown = player.getSlowDown();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_LEFT)
		{
			dx = 0;
		}
		else if(key==KeyEvent.VK_RIGHT)
		{
			dx = 0;
		}
		else if(key==KeyEvent.VK_UP)
		{
			dy = 0;
		}
		else if(key==KeyEvent.VK_DOWN)
		{
			dy = 0;
		}
		else if(key==KeyEvent.VK_SHIFT)
		{
			this.slowDown = 0;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
