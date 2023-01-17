public class Calculator {
    int operand1;
    int operand2;
    boolean operand1Set; // ù ��° �ǿ�����(operand1) ���� �����Ǿ����� Ȯ��
    boolean operand2Set; // �� ��° �ǿ�����(operand1) ���� �����Ǿ����� Ȯ��
    boolean operatorSet; // �����ڰ� �����Ǿ����� Ȯ��
    char operator; // ������ ����

    Calculator() {
        clearFlags();
    }

    public void clearFlags() {
        operand1Set = false;
        operand2Set = false;
        operatorSet = false;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public boolean isOperand1Set() {
        return operand1Set;
    }

    public void setOperand1Set(boolean operand1Set) {
        this.operand1Set = operand1Set;
    }

    public boolean isOperand2Set() {
        return operand2Set;
    }

    public void setOperand2Set(boolean operand2Set) {
        this.operand2Set = operand2Set;
    }

    public boolean isOperatorSet() {
        return operatorSet;
    }

    public void setOperatorSet(boolean operatorSet) {
        this.operatorSet = operatorSet;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
}
