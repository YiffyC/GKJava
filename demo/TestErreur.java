package demo;

public class TestErreur {

	public static void main(String[] args) throws InterruptedException
	{	//possibilite de passer throws en signature mais attention, si erreur sortie brutale du code
		// TODO Auto-generated method stub
		
		try
		{
			Thread.sleep(30);
		}
		
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				
				System.out.println("Erreur sleep : " + e.getMessage());
				//Remonter l'erreur a l'appelant
				throw e;
			}

	}

}
