
public class Multiplication implements Chain{
	Chain nextInchain;

	@Override
	public void setChain(Chain next) {
		nextInchain=next;
		
	}

	@Override
	public void calculate(Numbers number) {
		if(number.getOperation()=="mul")
		{
			System.out.println("Multiplying numbers");
			System.out.println(number.getNumber1()*number.getNumber2());
		}
		else
		{
			nextInchain.calculate(number);
		}
		
	}
}
