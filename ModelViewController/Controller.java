import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	public CalculatorView view;
	public CalculatorModel model;
	
	Controller(CalculatorView theView,CalculatorModel theModel)
	{
		view=theView;
		model=theModel;
		this.view.additionListener(new AdditionListener());
		this.view.subtractionListener(new SubtractionListener());
		this.view.multiplicationListener(new MultiplicationListener());
		this.view.divisionListener(new DivisionListener());
	}
	class AdditionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
			
				firstNumber = view.getFirstNumber();
				secondNumber = view.getSecondNumber();
				
				model.addition(firstNumber, secondNumber);
				
				view.setCalcSolution(model.getResult());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				view.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
	}
	class SubtractionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
			
				firstNumber = view.getFirstNumber();
				secondNumber = view.getSecondNumber();
				
				model.subtraction(firstNumber, secondNumber);
				
				view.setCalcSolution(model.getResult());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				view.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
	}
	class MultiplicationListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
			
				firstNumber = view.getFirstNumber();
				secondNumber = view.getSecondNumber();
				
				model.multiplication(firstNumber, secondNumber);
				
				view.setCalcSolution(model.getResult());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				view.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
	}
	class DivisionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
			
				firstNumber = view.getFirstNumber();
				secondNumber = view.getSecondNumber();
				
				model.division(firstNumber, secondNumber);
				
				view.setCalcSolution(model.getResult());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				view.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
	}
}
