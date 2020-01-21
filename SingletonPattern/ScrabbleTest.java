import java.util.LinkedList;
public class ScrabbleTest {
	public static void main(String args[])
	{
		Singleton obj=Singleton.getInstance();
		System.out.println("1st Instance ID: " + System.identityHashCode(obj));
		System.out.println(obj.getList());
		LinkedList<String> playerOne=obj.getTiles(7);
		System.out.println("PlayerOne"+playerOne);
		System.out.println("NewList"+obj.getList());
		Singleton obj1=Singleton.getInstance();
		System.out.println("1st Instance ID: " + System.identityHashCode(obj1));
		System.out.println(obj1.getList());
		LinkedList<String> playerTwo=obj1.getTiles(7);
		System.out.println("PlayerTwo"+playerTwo);
		System.out.println("NewList"+obj1.getList());
	}

}
