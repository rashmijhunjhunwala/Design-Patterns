import java.util.Iterator;

public class Implementation {
	SongIterator RockSongs;
	SongIterator BluesSongs;
	SongIterator Jazzy;
	public Implementation(SongIterator rockSongs,SongIterator Blues,SongIterator JazzSongs)
	{
		RockSongs=rockSongs;
		BluesSongs=Blues;
		Jazzy=JazzSongs;
	}
	public void printSongs()
	{
		Iterator it1;
		System.out.println("Rock Songs");
		it1=RockSongs.getIterator();
		getSongs(it1);
		System.out.println("Blues Songs");
		it1=BluesSongs.getIterator();
		getSongs(it1);
		System.out.println("Jazz Songs");
		it1=Jazzy.getIterator();
		getSongs(it1);
		
	}
	
	public void getSongs(Iterator iterator)
	{
		while(iterator.hasNext())
		{
			SongInfo songInfo = (SongInfo) iterator.next();
			System.out.println(songInfo.getSongName()+" By "+songInfo.getBandName());
			
		}
	}
}
