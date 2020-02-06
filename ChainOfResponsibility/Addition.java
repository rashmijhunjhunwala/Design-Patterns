
public class Addition implements Chain{
	Chain nextInchain;

	@Override
	public void setChain(Chain next) {
		nextInchain=next;
		
	}

	@Override
	public void calculate(Numbers number) {
		if(number.getOperation()=="add")
		{
			System.out.println("Adding numbers");
			System.out.println(number.getNumber1()+number.getNumber2());
		}
		else
		{
			nextInchain.calculate(number);
		}
		
	}
}
