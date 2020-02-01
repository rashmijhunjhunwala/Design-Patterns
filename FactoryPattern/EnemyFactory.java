
public class EnemyFactory {
	public EnemyShip makeEnemyShip(String selec)
	{
		if(selec.contentEquals("U"))
			return new UFOShip();
		else if(selec.contentEquals("R"))
			return new RocketShip();
		else if(selec.contentEquals("B"))
			return new BigUFOShip();
		else
			return null;
	}
}
