package danmaku;

import java.awt.Point;
import java.util.Vector;

public class AttackSpell extends SpellCard {

	protected Vector<Bullet> bullets = new Vector<Bullet>();
	protected Vector<Point> startPoint = new Vector<Point>();
	protected Thread spellTH;
	protected Boolean activated;
	
	public Vector<Bullet> getBullets() {
		return bullets;
	}

	public void setBullets(Vector<Bullet> bullets) {
		this.bullets = bullets;
	}

	public Vector<Point> getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Vector<Point> startPoint) {
		this.startPoint = startPoint;
	}

	public Thread getSpellTH() {
		return spellTH;
	}

	public void setSpellTH(Thread spellTH) {
		this.spellTH = spellTH;
	}

	public Boolean getActivated() {
		return activated;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	public AttackSpell() {
		// TODO Auto-generated constructor stub
	}
	
	public void activate()
	{
		
	}
	
	public void stop()
	{
		
	}
	

}
