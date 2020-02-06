
public class Main {
	public static void main(String args[])
	{
		Chain chain1=new Addition();
		Chain chain2=new Subtraction();
		Chain chain3=new Multiplication();
		Chain chain4=new Division();
		chain1.setChain(chain2);
		chain2.setChain(chain3);
		chain3.setChain(chain4);
		
		Numbers number=new Numbers(4,2,"div");
		chain1.calculate(number);
	}
}
