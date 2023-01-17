
public abstract class State {
	MainWindow mw;
	State(MainWindow mainwindow){
		mw=mainwindow;
	
	}
	public void addBalance(int balance) {
	       mw.addBalance(balance);
	 }	//다른 클래스에서의 변수를 사용하기 위해서 사용
	    
	public void setBalance(int balance) {
	        mw.setBalance(balance);
	 }
	    
	public int getBalance() {
	        return mw.getBalance();
	 }
	
	public void setState500() {
	       mw.setState(mw.getState500());
	    }

	public void setState0() {	//각자의 클래스에서 State변환할때, 사용하기위해
	    	 mw.setState(mw.getState0());
	    }
	    
	public void setStateLess500() {		//각자의 클래스에서 State변환할때, 사용하기위해
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
    }		//음료는 뽑지않고, 현재의 balance를 보여주기 위함

	
	public void returnChange() {
		setState0();
		System.out.println("거스름돈은 "+ getBalance()+"원입니다.");
		setBalance(0);
		setBalanceText();
	}
	public abstract void selectBeverage(); 
	public abstract void addFiveHundred();
	public abstract void  addHundred();
	public abstract void addThousand();

}
