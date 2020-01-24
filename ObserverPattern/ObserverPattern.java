import java.util.ArrayList;
import java.util.Iterator;

interface Observable
{
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
class Temperature implements Observable
{
	double temp;
	ArrayList<Observer> observerList;
	public Temperature()
	{
		observerList=new ArrayList<Observer>();
	}
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observerList.add(o);
		
	}
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observerList.remove(observerList.indexOf(o));
		
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		 for (Iterator<Observer> it = 
	              observerList.iterator(); it.hasNext();) 
	        { 
	            Observer o = it.next(); 
	            o.update(this.temp); 
	        } 
	}
	public void setTemperature(double temp)
	{
		this.temp=temp;
		notifyObservers();
	}
	
}
interface Observer
{
	void update(double temp);
}
class PhoneDisplay implements Observer
{
	double temp;
	Observable observabl;
	public void update(double temp)
	{
		this.temp=temp;
	}
	public void display()
	{
		System.out.println("The current temperature on the phone screen is"+this.temp);
	}
}
class LEDdisplay implements Observer
{
	double temp;
	Observable observabl;
	public void update(double temp)
	{
		this.temp=temp;
	}
	public void display()
	{
		System.out.println("The current temperature on the LED is"+this.temp);
	}
}
class ObserverPattern
{
	public static void main(String args[])
	{
		Temperature observabl=new Temperature();
		PhoneDisplay phone=new PhoneDisplay();
		LEDdisplay led=new LEDdisplay();
		observabl.addObserver(phone);
		observabl.addObserver(led);
		observabl.setTemperature(89.7);
		phone.display();
		led.display();
		observabl.setTemperature(56.7);
		phone.display();
		
	}
}