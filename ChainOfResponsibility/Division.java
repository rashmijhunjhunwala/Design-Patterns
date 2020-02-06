
public class Division implements Chain{
	Chain nextInchain;

	@Override
	public void setChain(Chain next) {
		nextInchain=next;
		
	}

	@Override
	public void calculate(Numbers number) {
		if(number.getOperation()=="div")
		{
			System.out.println("Dividing numbers");
			System.out.println(number.getNumber1()/number.getNumber2());
		}
		else
		{
			System.out.println("Only Addition,subtraction, multiplication and division supported");
		}
		
	}
}
