
public class Calculator {
	public static void main(String args[])
	{
		CalculatorView view=new CalculatorView();
		CalculatorModel model=new CalculatorModel();
		Controller controller=new Controller(view,model);
		view.setVisible(true);
	}
}
