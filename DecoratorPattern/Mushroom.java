
public class Mushroom extends ToppingDecorator{
	Mushroom(Pizza pizza)
	{
		super(pizza);
		System.out.println("Adding mushrooms");
	}
	public double cost()
	{
		System.out.println("Cost of mush"+1.00);
		return pizza.cost()+1.00;
	}
	public String getDescription()
	{
		return pizza.getDescription()+",Mushroom";
	}

}
