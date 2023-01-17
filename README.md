# DesignPattern
Using Java
Using Command Pattern

커맨드 패턴을 이용한 계산기 구현
요청과 실행을 분리
Command: 버튼에 실제 사용 객체를 연결
: JBotton을 이용하여, number, equal, arithmetic button 분리
Invoker: Button Action 후, 기능 실행
: CalcGUIV1의 method getButtonPanel에서 구현.(SetCommand())
Receiver: 실제 명령을 수행(Calculator)
: Calculator 객체에서 계산기 기능 수행
