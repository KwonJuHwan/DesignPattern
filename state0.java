
public class state0 extends State {
	
	state0(MainWindow mainwindow) {
		super(mainwindow);
	}
	public void returnChanges() {
		setMsgText("");
	}		//¿‹µ∑¿Ã æ¯¿∏π«∑Œ
	@Override
	public void selectBeverage() {
		// TODO Auto-generated method stub
		System.out.println("µ∑¿ª ≥÷æÓ¡÷ººø‰.");
	}

	@Override
	public void addFiveHundred() {
		// TODO Auto-generated method stub
		addBalance(500);
		setState500();
		 showBalanceAndEmptyMsg();
	}

	@Override
	public void addHundred() {
		// TODO Auto-generated method stub
		addBalance(100);
		setStateLess500();
		 showBalanceAndEmptyMsg();
	}

	@Override
	public void addThousand() {
		// TODO Auto-generated method stub
		addBalance(1000);
		setStateEqualOrMore1000();
		 showBalanceAndEmptyMsg();
	}
	


}
