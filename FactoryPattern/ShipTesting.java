import java.io.*;
public class ShipTesting {
	public static void main(String args[])
	{
		String s = null;
		try
		{
			System.out.println("Choose U for UFOSHIP, R for RocketShip and B for BIGUFOSHIP:");
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
			s=in.readLine();
		}
		catch(Exception e)
		{}
		EnemyFactory obj=new EnemyFactory();
		EnemyShip EnemyShip=null;
		EnemyShip=obj.makeEnemyShip(s);
		if(EnemyShip!=null)
			display(EnemyShip);
		else
		{
			System.out.println("Enter a proper choice");
		}
		
	}
	public static void display(EnemyShip enemyship)
	{
		enemyship.enemyshipshoots();
	}
}
