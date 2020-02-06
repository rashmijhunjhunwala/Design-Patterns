
import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
	ArrayList songComponent =new ArrayList();
	String groupName;
	String groupDescription;
	
	public SongGroup(String groupName,String groupDescription)
	{
		this.groupName=groupName;
		this.groupDescription=groupDescription;
	}
	
	public void add(SongComponent newSongComponent)
	{
		songComponent.add(newSongComponent);
	}
	
	public String getGroupName()
	{
		return this.groupName;
	}
	public void remove(SongComponent newSongComponent)
	{
		songComponent.remove(newSongComponent);
	}
	public String getGroupDescription()
	{
		return this.groupDescription;
	}
	
	public SongComponent getSongComponent(int index)
	{
		return (SongComponent)songComponent.get(index);
	}
	public void displaySongInfo()
	{
		System.out.println(getGroupName()+" "+getGroupDescription()+"\n");
		Iterator songIterator=songComponent.iterator();
		while(songIterator.hasNext())
		{
			SongComponent songInfo=(SongComponent) songIterator.next();
			songInfo.displaySongInfo();
		}
	}
}
