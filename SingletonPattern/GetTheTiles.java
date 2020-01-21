import java.util.LinkedList;
public class GetTheTiles implements Runnable {
	public void run()
	{
		Singleton obj=Singleton.getInstance();
		System.out.println("Instance ID: " + System.identityHashCode(obj));
		System.out.println(obj.getList());
		LinkedList<String> playerOne=obj.getTiles(7);
		System.out.println("PlayerOne"+playerOne);
		System.out.println("Got Tiles");
	}
}
