package attackspells;

import java.awt.Point;

import danmaku.AttackSpell;
import danmaku.Bullet;

public class Simple extends AttackSpell {

	
	
	public Simple() {
		// TODO Auto-generated constructor stub
		this.startPoint.add(new Point(450, 300));
		this.activated = true;
		this.spellTH = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(activated)
				{
					for(int i=0;i<startPoint.size();i++)
					{
						Bullet newBullet = new Bullet();
						newBullet.setPosition(new Point(startPoint.get(i)));
						newBullet.setDx(0);
						newBullet.setDy(5);
						bullets.add(newBullet);
					}
					try {
						Thread.sleep(600);
					} catch (Exception e) {
						// TODO: handle exception
					}	
					
				}
			}
		});
	}
	
	public void activate()
	{
		this.spellTH.start();
	}
	
	public void stop()
	{
		this.activated = false;
		this.spellTH.interrupt();
	}

}
