

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
		if (cal.isOperand1Set() && cal.isOperatorSet()) { // ù ��° �ǿ����ڿ� �����ڰ� �����Ǿ��ٸ� �� ��° �ǿ����� ������ ���
            int num2 = Integer.parseInt(getText());
            cal.setOperand2(num2);
            display.showText("" + num2);
            cal.setOperand2Set(true);
        }
        else {  // ù ��° �ǿ����� �� ����
            int num1 = Integer.parseInt(getText());
            display.showText("" + num1);
            cal.setOperand1(num1);
            cal.setOperand1Set(true);
        }
		
	}

}
