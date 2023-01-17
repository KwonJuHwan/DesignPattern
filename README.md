# DesignPattern
Using Java
Using  Template Method Pattern

템플릿메소드패턴을 이용하여 이미지 변환기를 만듬.

템플릿 메소드를 이용하기 위해, abstract class인 ImageConverter를 만들고, 최대한 코드의 반복을 줄임
: Grey, Inverse, Sepial 구현체에서 겹쳐지는 부분을 ImageConverter에서 묶어 구현체의 코드반복을 줄임.
