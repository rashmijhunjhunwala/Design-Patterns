
public abstract class EnemyShip {
	private String name;
	private int damage;
	public void setname(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setDamage(int damage)
	{
		this.damage=damage;
	}
	public int getDamage()
	{
		return damage;
	}
	public void enemyshipshoots()
	{
		System.out.println(getName()+" attacks and does damage " + getDamage());
	}
}
