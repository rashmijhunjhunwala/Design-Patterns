import java.util.Arrays;
import java.util.Iterator;

public class BluesSongs implements SongIterator{

	SongInfo[] bestSongs;
	int arrayIndex=0;
	public BluesSongs()
	{
		bestSongs=new SongInfo[3];
		addSong("So Excited","B.B King");
		addSong("Texas Flood","Steive Ray Vaughan");
		addSong("Pride and Joy","Steive Ray Vaughan");
	}
	
	public void addSong(String songName,String bandName)
	{
		SongInfo songInfo=new SongInfo(songName,bandName);
		bestSongs[arrayIndex]=songInfo;
		arrayIndex++;
	}
	
	@Override
	public Iterator getIterator() {
		return Arrays.asList(bestSongs).iterator();
	}

}
