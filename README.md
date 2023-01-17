# DesignPattern
Using Java
Using Observer Pattern

swing을 이용하여, window 제작 후, 소수생성 프로그램 제작
먼저 소수 생성 부분, 첫번째 window, 두번째 window를 분리
그 후 observer pattern을 적용하여, Observer interface를 만들어 button action을 하면 update가 이루어질 수 있도록 setting
소수 생성에 의존하고 있는 window들이 button이 눌러지면 다른 window에 영향을 주지않고 마지막으로 생성된 소수를 띄우고 멈춤.
목적: window 간의 객체화
