

import java.util.LinkedList;
import java.util.Collections;
import java.util.Arrays;
public class Singleton {
	private static Singleton obj=null;
	private Singleton()
	{
		
	}
	 String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a","b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e","e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
			             "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l","l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
			             "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
			             "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
			             "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",}; 
			      
	private LinkedList<String> letterList = new LinkedList<String> (Arrays.asList(scrabbleLetters));
	static boolean firstThread=true;
	public static Singleton getInstance()
	{
		if(obj==null)
		{
			if(firstThread)
			{
				firstThread=false;
				try
				{
					Thread.currentThread();
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
			synchronized(Singleton.class)
			{
				if(obj==null)
				{
					obj=new Singleton();
					Collections.shuffle(obj.letterList);

				}
			}
		}
		return obj;
	}
	
	public LinkedList<String> getList()
	{
		return obj.letterList;
	}
	public LinkedList<String> getTiles(int number)
	{
		LinkedList<String> tilestoSend=new LinkedList<String>();
		for(int i=0;i<number;i++)
		{
			tilestoSend.add(obj.letterList.remove(0));
		}
		return tilestoSend;
	}
			     

		
}
