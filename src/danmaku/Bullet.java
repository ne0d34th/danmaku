package danmaku;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bullet extends Sprite {

	int dx, dy;
	
	public Bullet() {
		// TODO Auto-generated constructor stub
		this.width = 10;
		this.height = 10;
	}
	
	public void move()
	{
		this.position.translate(dx, dy);
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	@Override
	public void render(Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(Color.WHITE);
		g2d.fillOval(this.position.x, this.position.y, this.width, this.height);
	}

}
