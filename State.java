
public abstract class State {
	MainWindow mw;
	State(MainWindow mainwindow){
		mw=mainwindow;
	
	}
	public void addBalance(int balance) {
	       mw.addBalance(balance);
	 }	//�ٸ� Ŭ���������� ������ ����ϱ� ���ؼ� ���
	    
	public void setBalance(int balance) {
	        mw.setBalance(balance);
	 }
	    
	public int getBalance() {
	        return mw.getBalance();
	 }
	
	public void setState500() {
	       mw.setState(mw.getState500());
	    }

	public void setState0() {	//������ Ŭ�������� State��ȯ�Ҷ�, ����ϱ�����
	    	 mw.setState(mw.getState0());
	    }
	    
	public void setStateLess500() {		//������ Ŭ�������� State��ȯ�Ҷ�, ����ϱ�����
	    	 mw.setState(mw.getStateLess500());
	    }
	public void setStateLess1000() {
	    	 mw.setState(mw.getStateLess1000());
	    }
	public void setStateEqualOrMore1000() {
	        mw.setState(mw.getStateStateEqualOrMore1000());
	    }
	public void setBalanceText() {
        mw.setBalanceText();
    }

    public void setMsgText(String msg) {
        mw.setMsgText(msg);
    }
    public void showBalanceAndEmptyMsg() {
        setBalanceText();
        setMsgText("");
    }		//����� �����ʰ�, ������ balance�� �����ֱ� ����

	
	public void returnChange() {
		setState0();
		System.out.println("�Ž������� "+ getBalance()+"���Դϴ�.");
		setBalance(0);
		setBalanceText();
	}
	public abstract void selectBeverage(); 
	public abstract void addFiveHundred();
	public abstract void  addHundred();
	public abstract void addThousand();

}
