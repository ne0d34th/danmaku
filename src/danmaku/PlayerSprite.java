package danmaku;

import java.awt.Color;
import java.awt.Graphics2D;

public class PlayerSprite extends Sprite {

	public PlayerSprite() {
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public void render(Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(Color.RED);
		g2d.fillOval(this.position.x, this.position.y, this.width, this.height);
		
	}

}
