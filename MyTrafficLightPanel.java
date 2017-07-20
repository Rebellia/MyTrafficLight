import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MyTrafficLightPanel extends JPanel
{
	//instance variables
	private Timer timer;
	private int colorIndex;


	//constructor
	public MyTrafficLightPanel()
	{
		timer = new Timer(1000, new LightListener());
		colorIndex = 0; //starts on red
	}

	//accessor for timer
	public Timer getTimer()
	{
		return timer;
	}

	//paintComponent
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);

		page.drawRect(0, 0, 80, 240); //draws the outlining rectangle

		page.drawOval(0, 0, 80, 80); //top circle (red)
		page.drawOval(0, 80, 80, 80); //middle circle (yellow)
		page.drawOval(0, 160, 80, 80); //bottom circle (green)

		colorIndex %= 3;

		switch(colorIndex)
		{
			case 0:
				page.setColor(Color.red);
				page.fillOval(0, 0, 80, 80);
				break;

			case 1:
				page.setColor(Color.yellow);
				page.fillOval(0, 80, 80, 80);
				break;

			case 2:
				page.setColor(Color.green);
				page.fillOval(0,160,80,80);
				break;
		}
	}

	//listenerclass
	public class LightListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			colorIndex++;
			repaint();
		}
	}

}