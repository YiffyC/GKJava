package demo;

import java.util.ArrayList;
import java.util.Vector;

public class AnimalTest {

	public AnimalTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		System.out.println(a.toString());

		
		System.out.println("--------------");
		System.out.println("-----3.1-----");
		System.out.println("--------------");
		/*
		 * 
		 * Cours 3.1 les enveloppes
		 * 
		 */
		int i = 100;
		
		Vector tabDyn = new Vector();
		
		tabDyn.addElement(new Integer(i));
		tabDyn.addElement(22.5);
		tabDyn.addElement("Hello");
		tabDyn.addElement(new Animal());
		tabDyn.addElement('x');
		tabDyn.addElement(false);
		
		
		for (Object object : tabDyn)
		{
			if(object instanceof Animal)
			{
				Animal an = (Animal) object;
				System.out.println(an.getNom());       
			}
			
			else
				System.out.println(object.getClass());
				
		}
		
		
		//Array list
		ArrayList<Animal> listeAn = new ArrayList<Animal>();
		listeAn.add(new Animal());
		
		
		
		
		
		
	}

}
