
public class EnemyTesting {
	public static void main(String args[])
	{
		EnemyAttacker tank1=new TankAttacker();
		RobotAttacker robot1=new RobotAttacker();
		EnemyAttacker robot2=new EnemyRobotAdapter(robot1);
		
		System.out.println("Tank Attack\n");
		
		tank1.fireWeapon();
		tank1.moveForward();
		tank1.assignDriver("Somdutta");
		
		System.out.println("Robot Attack\n");
		
		robot1.attackWithHands();
		robot1.walkForward();
		robot1.reactToHuman("Sandeep");
		
		System.out.println("Using the adapter for robot attack\n");
		
		robot2.fireWeapon();
		robot2.moveForward();
		robot2.assignDriver("Arnab");
		
		
	}
}
