package danmaku;

import java.awt.Graphics2D;
import java.awt.Point;

public class Sprite implements DrawCanvas {
	
	protected Point position;
	protected int width;
	protected int height;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Sprite() {
		// TODO Auto-generated constructor stub
		
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	@Override
	public void render(Graphics2D g2d) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	

}
