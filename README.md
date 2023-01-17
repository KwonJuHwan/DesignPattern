# DesignPattern
Using Java
Using Decorater Pattern

데코레이터 패턴을 이용하여, GUI 제작
Main Window에 Hub Display를 Base로 하고, Speedometer, Time, Weather display들을 하나씩 Wrap한 후, 데코레이터한 구조 

-자세한 설명:
Interface displaydecorator를 이용하여, 각 구현체(Speedometer, Time, Weather display)들의 constuctor를 통해, 전의 display를 받아오고
show 메소드를 이용하여, 전의 display에 text를 decorate하여, 데코레이더 패턴을 이용하여 GUI를 제작함.
