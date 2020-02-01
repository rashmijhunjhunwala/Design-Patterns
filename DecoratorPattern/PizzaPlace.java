
public class PizzaPlace {
	public static void main(String args[])
	{
		Pizza pizz=new Mushroom(new Mozarella(new Mozarella(new PlainPizza())));
		System.out.println(pizz.getDescription());
		System.out.println(pizz.cost());
	}
}
