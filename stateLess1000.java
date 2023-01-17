
public class stateLess1000 extends State{
	
	public stateLess1000(MainWindow window) {
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
		setStateEqualOrMore1000();
		 showBalanceAndEmptyMsg();
		
	}

	@Override
	public void addHundred() {
		// TODO Auto-generated method stub
		addBalance(100);
		if(getBalance()==1000) {
			setStateEqualOrMore1000();
		}
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
