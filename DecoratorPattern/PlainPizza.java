
public class PlainPizza implements Pizza {
	
	public PlainPizza()
	{
		System.out.println("Adding dough");
	}

	@Override
	public double cost() {
		System.out.println("Cost of Dough: " + 4.00);
		return 4.00;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Thin dough";
	}

}
