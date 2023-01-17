
public class state500 extends State{
	
	public state500(MainWindow window) {
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
		setStateEqualOrMore1000();
		addBalance(500);
		 showBalanceAndEmptyMsg();
	}

	@Override
	public void addHundred() {
		setStateLess1000();
		addBalance(100);
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
