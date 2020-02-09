
public class Mozarella extends ToppingDecorator {
	public Mozarella(Pizza pizza)
	{
		super(pizza);
		System.out.println("Adding mozarella");
	}
	public double cost()
	{
		System.out.println("Cost of moz"+0.50);
		return pizza.cost()+0.50;
	}
	public String getDescription()
	{
		return pizza.getDescription()+",Mozarella";
	}

}
