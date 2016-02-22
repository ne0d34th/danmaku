package danmaku;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class Game extends Run implements DrawCanvas, KeyListener {
	
	Player player;
	int dx,dy;
	int slowDown;
	Vector<Sprite> sprites = new Vector<Sprite>();
	Danmaku danmaku;
	
	public Danmaku getDanmaku() {
		return danmaku;
	}



	public void setDanmaku(Danmaku danmaku) {
		this.danmaku = danmaku;
		danmaku.activate();
	}



	public Game() {
		// TODO Auto-generated constructor stub
		this.setSize(900, 600);
		//this.addKeyListener(this);
		TH.start();
	}
	
	

	public Player getPlayer() {
		return player;
	}



	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 900, 600);
		// TODO Auto-generated method stub
//		super.paint(g);
		this.player.getSprite().getPosition().translate(dx, dy);
		this.player.getSprite().render(g2d);
		danmaku.render(g2d);
		int collision = danmaku.checkCollision(this.player.getSprite());
		if(collision==1)
		{
			danmaku.endDanmaku();
		}
		
//		try {
//			Thread.sleep(1000/60);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		repaint();
		
	}



	@Override
	public void render(Graphics2D g2d) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void update() {
		// TODO Auto-generated method stub
		
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
