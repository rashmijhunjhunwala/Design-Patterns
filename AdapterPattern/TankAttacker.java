import java.util.Random;
public class TankAttacker implements EnemyAttacker{
	Random generator=new Random();
	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		int attackDamage=generator.nextInt(10)+1;
		System.out.println("Enemy Tank does "+attackDamage+" Damage");
		
	}

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		int movement=generator.nextInt(5)+1;
		System.out.println("The Enemy Tank moves forward by "+movement+" spaces");
		
	}

	@Override
	public void assignDriver(String driver) {
		// TODO Auto-generated method stub
		System.out.println("The Enemy tank is driven by "+driver);
		
	}

}
