
public class stateLess500 extends State{
	
	public stateLess500(MainWindow window) {
		super(window);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void selectBeverage() {
		// TODO Auto-generated method stub
		System.out.println("돈을 넣어주세요.");
	}

	@Override
	public void addFiveHundred() {
		// TODO Auto-generated method stub
		addBalance(500);
		setStateLess1000();
		 showBalanceAndEmptyMsg();
	}
	@Override
	public void addHundred() {
		// TODO Auto-generated method stub
		addBalance(100);
		if(getBalance()==500) {
			setState500();
		}
		 showBalanceAndEmptyMsg();
	}

	@Override
	public void addThousand() {
		// TODO Auto-generated method stub
		setStateEqualOrMore1000();
		addBalance(1000);
		 showBalanceAndEmptyMsg();
	}

}
