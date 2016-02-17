package danmaku;

import javax.swing.JPanel;


public abstract class Run extends JPanel implements DrawCanvas{
	protected Thread TH = new Thread(new Runnable() {
		
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(1000/60);
					update();
					repaint();
				} catch (Exception e) {
					// TODO: handle exception
				}			
			}
		}
	});
}
