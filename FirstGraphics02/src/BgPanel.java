import java.awt.Graphics;

import javax.swing.JPanel;

public class BgPanel extends JPanel {
	
	public BgPanel()
	{
		// initialize stuff
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawLine(100, 100, 200, 200);
		g.drawLine(100, 100, 500, 200);
		g.drawRect(250, 300, 100, 100);
		g.drawOval(100, 200, 100, 50);
	}
}
