
public class UFOBossEnemyShip extends EnemyShip {

		
		EnemyShipFactory shipFactory;
		
		public UFOBossEnemyShip(EnemyShipFactory shipFactory){
			
			this.shipFactory = shipFactory;
			
		}

		// EnemyShipBuilding calls this method to build a 
		// specific UFOEnemyShip
		
		void makeShip() {
			
			System.out.println("Making enemy ship " + getName());
			
			// The specific weapon & engine needed were passed in
			// shipFactory. We are assigning those specific part
			// objects to the UFOEnemyShip here
			
			weapon = shipFactory.addESGun();
			engine = shipFactory.addESEngine();
			
		}
		
	}