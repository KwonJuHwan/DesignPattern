public class EqualCommandButton extends CommandButton {
    CalcGUIV1 display;

    public EqualCommandButton(Calculator calculator, CalcGUIV1 display) {
        super(calculator);
        this.display = display;
    }

    @Override
    public void execute() {
        int result = 0;
        Calculator calculator = getCalculator();
        if (calculator.isOperand1Set() && calculator.isOperand2Set() && calculator.isOperatorSet()) { // 두 개 피 연산자값과 연산자가 지정되었다면
            int operand1 = calculator.getOperand1();
            int operand2 = calculator.getOperand2();
            char op = calculator.getOperator();

            if (op == '+') {
                result = operand1 + operand2;
            }
            else if (op == '-') {
                result = operand1 - operand2;
            }
            else if (op == '*') {
                result = operand1 * operand2;
            }
            else if (op == '/') {
                result = operand1 / operand2;
            }
        }
        display.showText("" + result);
        calculator.clearFlags();
    }
}
