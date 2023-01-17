
public interface Command {
	public void execute();
}

/*
 * MVC패턴을 이용 model=button뿐만이 아니라 이전에 있던 계산들과, 계산 결과들을 저장할 수 있는 데이터를 늘릴 수 있다
 * view= actionperformed controller=calculator MVC패턴을 사용하여, 계산하는 부분과 데이터(button,
 * 다른 계산식)를 저장 할 수 있는 부분을 나누어 두 부분의 유지보수가 쉽게 되며, 추가할때도 서로에게 영향을 주지 않으므로 추가할때
 * 여유로워 진다. 또한, 지금은 button을 눌러 계산 결과식을 보여주는 부분밖에 없지만 model부분에 대한 class를 늘려, 계산기을
 * 저장하는 부분 을 늘리면 사용자는 자신이 전에 이용한 계산의 결과를 열람할 수 있다.
 */