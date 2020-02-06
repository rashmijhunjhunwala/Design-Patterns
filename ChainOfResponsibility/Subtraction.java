
public class Subtraction implements Chain{
	Chain nextInchain;

	@Override
	public void setChain(Chain next) {
		nextInchain=next;
		
	}

	@Override
	public void calculate(Numbers number) {
		if(number.getOperation()=="sub")
		{
			System.out.println("Subtracting numbers");
			System.out.println(number.getNumber1()-number.getNumber2());
		}
		else
		{
			nextInchain.calculate(number);
		}
		
	}
}
