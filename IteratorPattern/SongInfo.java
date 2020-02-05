
public class SongInfo {
	String songName;
	String bandName;
	
	public SongInfo(String songname,String bandname)
	{
		this.songName=songname;
		this.bandName=bandname;
	}
	public String getSongName()
	{
		return this.songName;
	}
	public String getBandName()
	{
		return this.bandName;
	}
}
