package danmaku;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Player {

	Sprite sprite;
	int hp;
	int speed;
	int slowDown;
	
	public Sprite getSprite() {
		return sprite;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	public Player(int x, int y) {
		// TODO Auto-generated constructor stub
		this.sprite = new PlayerSprite();
		Point pos = new Point(x, y);
		this.sprite.setPosition(pos);
		this.sprite.setHeight(10);
		this.sprite.setWidth(10);
		this.hp = 10;
		this.speed = 5;
		this.slowDown = 3;
	}

	public int getSlowDown() {
		return slowDown;
	}

	public void setSlowDown(int slowDown) {
		this.slowDown = slowDown;
	}

}
