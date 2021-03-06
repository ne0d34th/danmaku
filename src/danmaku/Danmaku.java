package danmaku;

import java.awt.Graphics2D;
import java.util.Vector;

public class Danmaku {
	
	Vector<AttackSpell> spells = new Vector<AttackSpell>();
	
	Boolean running;
	
	public Vector<AttackSpell> getSpells() {
		return spells;
	}

	public void setSpells(Vector<AttackSpell> spells) {
		this.spells = spells;
	}

	public Boolean getRunning() {
		return running;
	}

	public void setRunning(Boolean running) {
		this.running = running;
	}

	Thread danmakuTH = new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	});
	
	public Danmaku() {
		// TODO Auto-generated constructor stub
	}
	
	public void render(Graphics2D g2d)
	{
		for(int i=0;i<this.spells.size();i++)
		{
			for(int j=0;j<this.spells.get(i).getBullets().size();j++)
			{
				this.spells.get(i).getBullets().get(j).move();
				this.spells.get(i).getBullets().get(j).render(g2d);
			}
		}
	}
	
	public void activate()
	{
		for(int i=0;i<this.spells.size();i++)
		{
			spells.get(i).activate();
		}
	}
	
	public void addSpell(AttackSpell newSpell)
	{
		this.spells.add(newSpell);
	}
	
	public void flushSpell()
	{
		this.spells.clear();
	}
	
	public void endDanmaku()
	{
		for(int i=0;i<this.spells.size();i++)
		{
			spells.get(i).stop();
		}
	}
	
	public int checkCollision(Sprite player)
	{
		int xp = (int)player.getPosition().getX();
		int yp = (int)player.getPosition().getY();
		int radp = (int)(player.getWidth()/2);
		for(int i=0;i<this.spells.size();i++)
		{
			for(int j=0;j<this.spells.get(i).getBullets().size();j++)
			{
				Bullet temp = this.spells.get(i).getBullets().get(j);
				int xt = (int) temp.getPosition().getX();
				int yt = (int) temp.getPosition().getY();
				int radt = (int) (temp.getWidth()/2);
				int distance = (xp-xt) * (xp-xt) + (yp-yt) * (yp-yt);
				int rad = (radt+radp) * (radt+radp);
				if(distance <= rad)
				{
					return 1;
				}
			}
		}
		return 0;
	}

}
