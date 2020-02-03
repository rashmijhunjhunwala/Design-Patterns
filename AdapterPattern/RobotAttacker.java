import java.util.Random;
public class RobotAttacker {
	Random generator=new Random();
	public void attackWithHands()
	{
		int attackDamage=generator.nextInt(10)+1;
		System.out.println("The enemy robot does a damage of "+attackDamage+" with hands");
	}
	public void walkForward()
	{
		int movement=generator.nextInt(5)+1;
		System.out.println("The Enemy Robot walks forward by "+movement+" spaces");
		
	}
	public void reactToHuman(String driver)
	{
		System.out.println("THe enemy robot tramps on "+driver);
	}
}
