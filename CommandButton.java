import javax.swing.*;

public abstract class CommandButton extends JButton implements Command {	//button 역할을 해야되기때문에
	private Calculator calculator;
	
	public CommandButton (Calculator calcul) {
		super();
		calculator=calcul;
	}
	public Calculator getCalculator() {
		return calculator;
	}
	public void setCal(Calculator cal) {
		this.calculator = cal;
	}
	
	@Override
	public abstract void execute();

}
