
public class EnemyRobotAdapter implements EnemyAttacker {
	RobotAttacker robot;
	public EnemyRobotAdapter(RobotAttacker robot)
	{
		this.robot=robot;
	}
	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		this.robot.attackWithHands();
		
	}

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		this.robot.walkForward();
		
	}

	@Override
	public void assignDriver(String driver) {
		// TODO Auto-generated method stub
		this.robot.reactToHuman(driver);
		
	}

}
