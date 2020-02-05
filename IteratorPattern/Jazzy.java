import java.util.Iterator;
import java.util.Hashtable;

public class Jazzy implements SongIterator{
	Hashtable<Integer,SongInfo> bestSongs;
	int key=0;
	public Jazzy()
	{
		bestSongs=new Hashtable<Integer,SongInfo>();
		addSongs("Over and Over and Over","Jack White");
		addSongs("Another Way to Die","Jack White");
		addSongs("Would you Fight For My Love","Jack White");
	}
	
	public void addSongs(String SongName,String bandName)
	{
		SongInfo newSongs=new SongInfo(SongName,bandName);
		bestSongs.put(key,newSongs);
		key++;
	}

	

	@Override
	public Iterator getIterator() {
		return bestSongs.values().iterator();
	}}
