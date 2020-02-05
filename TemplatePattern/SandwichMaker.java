
public class SandwichMaker {
	public static void main(String args[])
	{
		Sandwich sandwichMaker;
		sandwichMaker=new VegSandwich();
		sandwichMaker.makeSandwich();
		System.out.println();
		sandwichMaker=new NonVeg();
		sandwichMaker.makeSandwich();
	}

}
