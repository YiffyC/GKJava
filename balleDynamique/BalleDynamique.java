package balleDynamique;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

public class BalleDynamique extends Applet
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
		/*
		afficheDisque(g);
		
		while(true)
		{
			
			pause(mil);
			effaceDisque(g, x, y);
			deplaceDisque();
			afficheDisque(g);
			
			
		}*/
	}
	
	
	private void afficheDisque(Graphics g)
	{
		Color c = new Color(255, 0, 255);
		g.setColor(c);
		g.fillOval(x, y, tailleD, tailleD);
	}
	
	
	public void effaceDisque(Graphics g, int x, int y)
	{
		g.clearRect(x, y, tailleD, tailleD);
	}
	
	
	public void deplaceDisque()
	{
		
		
		
		if( (x+tailleD) <= getWidth() )
		{
			if(droite)
				deplaceDisqueD();
			else
				deplaceDisqueG();

		}
		
		if ( y+tailleD <= getHeight())
		{
			
			if(haut)
				deplaceDisqueH();
			else
				deplaceDisqueB();
				
		}
		
		

	}
	
	public void deplaceDisqueD()
	{
		if((x+tailleD) == getWidth() )
			droite = false;
		else
			x++;			

	}
	

	
	public void deplaceDisqueG()
	{
		if((x+tailleD) != tailleD )
		x--;
		else 
			droite = true;

	}
	
	public void deplaceDisqueB()
	{
		if((y+tailleD) == getHeight() )
			haut = true;
		else
			y++;			

	}
	
	public void deplaceDisqueH()
	{
		if((y+tailleD) == 0 )
			haut = false;
		else
			y--;			

	}
	
	

	
	public void pause(int milisecondes)
	{
		try 
		{
			Thread.sleep(milisecondes);
		} catch (InterruptedException e) 
			{}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getTailleD() {
		return tailleD;
	}

	public void setTailleD(int tailleD) {
		this.tailleD = tailleD;
	}

	public int getMil() {
		return mil;
	}

	public void setMil(int mil) {
		this.mil = mil;
	}

	public boolean isDroite() {
		return droite;
	}

	public void setDroite(boolean droite) {
		this.droite = droite;
	}

	public boolean isHaut() {
		return haut;
	}

	public void setHaut(boolean haut) {
		this.haut = haut;
	}
	
	
	
	//getset
	
	
}
