package balleDynamique;

public class Bouge extends Thread {
	
	private BalleDynamique applet;
	
	Bouge(BalleDynamique b)
	{
		applet = b;
	}
	
	
	
	public void run()
	{
		while(isAlive())
		{
			applet.pause(5);
			applet.deplaceDisque();
			
		}
	}

}
