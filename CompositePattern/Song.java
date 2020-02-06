
public class Song extends SongComponent{
	String SongName;
	String BandName;
	String releasedYear;
	
	public Song(String songName,String bandName,String releasedYear)
	{
		this.SongName=songName;
		this.BandName=bandName;
		this.releasedYear=releasedYear;
	}
	public String getSongName() {
		return this.SongName;
	}
	public String getBandName()
	{
		return this.BandName;
	}
	public String getReleasedYear() {
		return this.releasedYear;
	}
	
	public void displaySongInfo()
	{
		System.out.println(getSongName() + " was recorded by " +getBandName() + " in " + getReleasedYear());
	}
}
