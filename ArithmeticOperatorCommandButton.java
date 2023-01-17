public class ArithmeticOperatorCommandButton extends CommandButton {
    public ArithmeticOperatorCommandButton(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        if (getCalculator().isOperand1Set()) {  // 첫 번째 피연산자 값이 지정되어야만 연산자 처리 가능
            getCalculator().setOperator(getText().charAt(0));
            getCalculator().setOperatorSet(true);
        }
    }
}
