package demoBalle;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

public class DemoB extends Applet
{
	
	private int x, y, tailleD, mil;
	private boolean droite, haut;

	@Override
	public void init() {

		x = 0;
		y = 60;
		
		tailleD = 25;
		
		//temps
		mil = 4;
		
		//sens
		droite = true;
		haut = true;
		

		
	}

	@Override
	public void paint(Graphics g)
	{			
		Balle b1 = new Balle(0, 0, 15, 255, 0, 255);
		Balle b2 = new Balle(50, 50, 25, 255, 26, 95);
	

		
		
		afficheBalle(g, b1);
		
		while(true)
		{
			
			pause(mil);
			effaceBalle(g, b1);
			effaceBalle(g, b2);
			deplaceBalle(b1);
			deplaceBalle(b2);
			afficheBalle(g, b1);
			afficheBalle(g, b2);
			
			
		}
	}
	
	
	private void afficheBalle(Graphics g, Balle b)
	{
		g.setColor(b.getC());
		g.fillOval(b.getX(), b.getY(), b.getDiam(), b.getDiam());
	}
	
	
	public void effaceBalle(Graphics g, Balle b)
	{
		g.clearRect(b.getX(), b.getY(), b.getDiam(), b.getDiam());
	}
	
	
	public void deplaceBalle(Balle b)
	{
		
		
		
		if( (b.getX()+b.getDiam()) <= getWidth() )
		{
			if(droite)
				deplaceBalleD(b);
			else
				deplaceBalleG(b);

		}
		
		if ( b.getY()+ b.getDiam() <= getHeight())
		{
			
			if(haut)
				deplaceBalleH(b);
			else
				deplaceBalleB(b);
				
		}
		
		

	}
	
	public void deplaceBalleD(Balle b)
	{
		if((b.getX()+b.getDiam()) == getWidth() )
			droite = false;
		else
			b.setX(b.getX()+1);			

	}
	
	
	public void deplaceBalleG(Balle b)
	{
		if((b.getX()+b.getDiam()) != b.getDiam() )
		b.setX(b.getX()-1);
		else 
			droite = true;

	}
	
	public void deplaceBalleB(Balle b)
	{
		if((b.getY()+b.getDiam()) == getHeight() )
			haut = true;
		else
			b.setY(b.getY()+1);			

	}
	
	public void deplaceBalleH(Balle b)
	{
		if((b.getY()+b.getDiam()) == 0 )
			haut = false;
		else
			b.setY(b.getY()-1);			

	}
	
	

	
	public void pause(int milisecondes)
	{
		try 
		{
			Thread.sleep(milisecondes);
		} catch (InterruptedException e) 
			{}
	}
	
	
}
