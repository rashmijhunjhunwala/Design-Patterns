
public class RadioStation {
	public static void main(String args[])
	{
		SongIterator blues=new BluesSongs();
		SongIterator rock=new RockSongs();
		SongIterator jazz=new Jazzy();
		Implementation implementation =new Implementation(rock,blues,jazz);
		implementation.printSongs();
	}
}
