package demoBalle;

import java.awt.Color;
import java.awt.Graphics;

public class Balle {
	
	private int x, y, diam;
	Color c;
	
	
	public Balle(int x, int y, int d)
	{
		this.x = x;
		this.y = y;
		this.diam = d;
		this.c = new Color(255,0,255);
	}

	
	public Balle(int x, int y, int d, int r, int g, int b)
	{
		this.x = x;
		this.y = y;
		this.diam = d;
		this.c = new Color(r,g,b);
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


	public int getDiam() {
		return diam;
	}


	public void setDiam(int diam) {
		this.diam = diam;
	}


	public Color getC() {
		return c;
	}


	public void setC(Color c) {
		this.c = c;
	}
	
	
	

}
