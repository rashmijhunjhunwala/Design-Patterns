
abstract class Dog {
	Grooming groomingbehaviour;
	Shedding sheddingbehaviour;
	public Dog(Shedding sheddingbehaviour,Grooming groomingbehaviour)
	{
		this.sheddingbehaviour=sheddingbehaviour;
		this.groomingbehaviour=groomingbehaviour;
	}
	public void characteristics()
	{
		System.out.println("Good with children");
	}
	public void trainability()
	{
		System.out.println("Eager to please");
	}
	public void shed()
	{
		this.sheddingbehaviour.shed();
	}
	public void groom()
	{
		this.groomingbehaviour.groom();
	}
	public void setshedbehaviour(Shedding sheddingbehaviour)
	{
		this.sheddingbehaviour=sheddingbehaviour;
	}
	public void setgroombehaviour(Grooming groomingbehaviour)
	{
		this.groomingbehaviour=groomingbehaviour;;
	}
	public abstract void display();
}

interface Shedding
{
	public void shed();
}
class Regularly implements Shedding
{
	public void shed()
	{
		System.out.println("Sheds Regularly");
	}
}
class Occasional implements Shedding
{
	public void shed()
	{
		System.out.println("Sheds Ocassionally");
	}
}
interface Grooming
{
	public void groom();
}
class weekly implements Grooming
{
	public void groom()
	{
		System.out.println("Weekly brushing");
	}
}
class daily implements Grooming
{
	public void groom()
	{
		System.out.println("Daily Brushing");
	}
}
class Spaniel extends Dog{
	public Spaniel(Shedding sheddingbehaviour,Grooming groomingbehaviour)
	{
		super(sheddingbehaviour,groomingbehaviour);
	}
	public void display()
	{
		System.out.println("Hey! I am a cocker woof spaniel!");
	}
}
class GermanShephard extends Dog
{
	public GermanShephard(Shedding sheddingbehaviour,Grooming groomingbehaviour)
	{
		super(sheddingbehaviour,groomingbehaviour);
	}
	public void display()
	{
		System.out.println("Hey! I am a german woof shephard");
	}
}
class Dogs
{
	public static void main(String args[])
	{
		Grooming grom=new weekly();
		Shedding shedd=new Regularly();
		GermanShephard gs=new GermanShephard(shedd,grom);
		gs.characteristics();
		gs.trainability();
		gs.shed();
		gs.groom();
		gs.display();
		grom=new daily();
		shedd=new Occasional();
		Spaniel sp=new Spaniel(shedd,grom);
		sp.characteristics();
		sp.trainability();
		sp.shed();
		sp.groom();
		sp.display();
	}
}