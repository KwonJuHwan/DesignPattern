

public class numberButton extends CommandButton{
	 CalcGUIV1 display;
	public numberButton(Calculator calcul,CalcGUIV1 dis) {
		super(calcul);
		display=dis;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		Calculator cal= getCalculator();
		if (cal.isOperand1Set() && cal.isOperatorSet()) { // 첫 번째 피연산자와 연산자가 지정되었다면 두 번째 피연산자 값으로 사용
            int num2 = Integer.parseInt(getText());
            cal.setOperand2(num2);
            display.showText("" + num2);
            cal.setOperand2Set(true);
        }
        else {  // 첫 번째 피연산자 값 지정
            int num1 = Integer.parseInt(getText());
            display.showText("" + num1);
            cal.setOperand1(num1);
            cal.setOperand1Set(true);
        }
		
	}

}
