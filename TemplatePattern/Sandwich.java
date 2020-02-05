
public abstract class Sandwich {
	public void makeSandwich()
	{
		cutbun();
		if(wantsmeat())
		{
			giveMeat();
			System.out.println();
		}
		if(wantsVeggies())
		{
			giveVeggies();
			System.out.println();
		}
		if(wantsCheese())
		{
			giveCheese();
			System.out.println();
		}
		if(wantsKetchup())
		{
			giveKetchup();
			System.out.println();
		}
		wrapIt();
	}
	public void cutbun()
	{
		System.out.println("Cutting the bun");
		
	}
	public abstract void giveMeat();
	public abstract void giveCheese();
	public abstract void giveKetchup();
	public abstract void giveVeggies();
	
	public void wrapIt()
	{
		System.out.println("Wrapping It Up");
		System.out.println("Your sandwich is ready");
	}
	public boolean wantsmeat()
	{
		return true;
	}
	public boolean wantsCheese()
	{
		return true;
	}
	public boolean wantsKetchup()
	{
		return true;
	}
	public boolean wantsVeggies()
	{
		return true;
	}
	
}
