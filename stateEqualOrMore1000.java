
public class stateEqualOrMore1000 extends State{
	
	public stateEqualOrMore1000(MainWindow window) {
		super(window);
	}

	@Override
	public void selectBeverage() {
		String msg = "���Ḧ �������ϴ�. ���ⱸ�� Ȯ���ϼ���.";
        setBalance(getBalance() - 1000);
        if (getBalance() > 0) {
            msg = msg + " �Ž����� " + getBalance() + "���� ��ȯ�մϴ�.";
            setBalance(0);
        }
        setBalanceText();
        setMsgText(msg);
        setState0();
    }


	@Override
	public void addFiveHundred() {
		// TODO Auto-generated method stub
		setMsgText("�̹� ����� ���� ���ԵǾ����ϴ�. ���Ḧ �����ϼ���");
		
	}

	@Override
	public void addHundred() {
		// TODO Auto-generated method stub
		setMsgText("�̹� ����� ���� ���ԵǾ����ϴ�. ���Ḧ �����ϼ���");
	}

	@Override
	public void addThousand() {
		// TODO Auto-generated method stub
		setMsgText("�̹� ����� ���� ���ԵǾ����ϴ�. ���Ḧ �����ϼ���");
	}
	
}
