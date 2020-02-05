
public class VegSandwich extends Sandwich{
	
	public boolean wantsmeat()
	{
		return false;
	}
	String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
	String[] cheeseUsed = { "Provolone" };
	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] ketchupUsed = { "Tomato", "RedChilli","GreenChilli" };
	@Override
	public void giveMeat() {
		// TODO Auto-generated method stub
		System.out.print("Adding Meat: ");
		for(String meat:meatUsed)
		{
			System.out.print(meat+" ");
		}
		
	}

	@Override
	public void giveCheese() {
		// TODO Auto-generated method stub
		System.out.print("Adding Cheese: ");
		for(String cheese:cheeseUsed)
		{
			System.out.print(cheese+" ");
		}
		
	}

	@Override
	public void giveKetchup() {
		// TODO Auto-generated method stub
		System.out.print("Adding Ketchup: ");
		for(String ketchup:ketchupUsed)
		{
			System.out.print(ketchup+" ");
		}
		
	}

	@Override
	public void giveVeggies() {
		// TODO Auto-generated method stub
		System.out.print("Adding Veggies: ");
		for(String veggies:veggiesUsed)
		{
			System.out.print(veggies+" ");
		}
		
	}

}
