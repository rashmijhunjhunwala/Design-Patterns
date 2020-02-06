
public class CalculatorModel {
	int calculationResult=0;
	public void addition(int number1,int number2)
	{
		calculationResult=number1+number2;
	}
	public void subtraction(int number1,int number2)
	{
		calculationResult=number1-number2;
	}
	public void multiplication(int number1,int number2)
	{
		calculationResult=number1*number2;
	}
	public void division(int number1,int number2)
	{
		calculationResult=number1/number2;
	}
	public int getResult()
	{
		return calculationResult;
	}

}
