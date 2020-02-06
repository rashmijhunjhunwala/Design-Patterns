import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculatorView extends JFrame {
	private JTextField firstNumber=new JTextField(10);
	private JTextField secondNumber=new JTextField(10);
	private JButton additionButton = new JButton("Add");
	private JButton subtractionButton = new JButton("Subtract");
	private JButton multiplyButton = new JButton("Multiply");
	private JButton divisionButton = new JButton("Divide");
	private JTextField calculationResult=new JTextField(10);
	
	CalculatorView()
	{
		JPanel calcPanel=new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		calcPanel.add(firstNumber);
		calcPanel.add(secondNumber);
		calcPanel.add(additionButton);
		calcPanel.add(subtractionButton);
		calcPanel.add(multiplyButton);
		calcPanel.add(divisionButton);
		calcPanel.add(calculationResult);
		
		this.add(calcPanel);
	}
	public int getFirstNumber()
	{
		return Integer.parseInt(firstNumber.getText());
	}
	public int getSecondNumber()
	{
		return Integer.parseInt(secondNumber.getText());
	}
	public int getCalcSolution()
	{
		return Integer.parseInt(calculationResult.getText());
	}
	
	public void setCalcSolution(int solution)
	{
		calculationResult.setText(Integer.toString(solution));
	}
	
	void additionListener(ActionListener listenForAddButton)
	{
		additionButton.addActionListener(listenForAddButton);
	}
	void subtractionListener(ActionListener listenForSubButton)
	{
		subtractionButton.addActionListener(listenForSubButton);
	}
	void multiplicationListener(ActionListener listenForMulButton)
	{
		multiplyButton.addActionListener(listenForMulButton);
	}
	void divisionListener(ActionListener listenForDivButton)
	{
		divisionButton.addActionListener(listenForDivButton);
	}
	
	void displayErrorMessage(String errorMessage)
	{
		JOptionPane.showMessageDialog(this,errorMessage);
	}
}
