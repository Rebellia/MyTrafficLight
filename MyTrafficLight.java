import javax.swing.*;

public class MyTrafficLight extends JApplet
{
	private MyTrafficLightPanel trafficLight;

	//init
	public void init()
	{
		trafficLight = new MyTrafficLightPanel();
		getContentPane().add(trafficLight);
	}

	//start
	public void start()
	{
		trafficLight.getTimer().start();
	}
	//stop
	public void stop()
	{
		trafficLight.getTimer().stop();
	}
}