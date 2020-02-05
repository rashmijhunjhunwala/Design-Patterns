import java.util.ArrayList;
import java.util.Iterator;

public class RockSongs implements SongIterator{
	
	ArrayList<SongInfo> bestSongs;
	public RockSongs()
	{
		bestSongs=new ArrayList<SongInfo>();
		addSongs("Sweet Child O' Mine","Guns N Roses");
		addSongs("Hotel California","Eagles");
		addSongs("November Rain","Guns N Roses");
	}
	
	public void addSongs(String SongName,String bandName)
	{
		SongInfo songInfo=new SongInfo(SongName,bandName);
		bestSongs.add(songInfo);
	}
	
	@Override
	public Iterator getIterator() {
		return bestSongs.iterator();
	}

}
