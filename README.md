# DesignPattern
Using Java
Using MVC Pattern

Model: Image, image에 대한 정보, 각종 메소드(set,get,add,observer)
View: LabelView, 사용자가 보는 데이터를 화면에 보이는 부분을 관리
Controller: MainWindowController,command, 사용자의 입력을 처리하고 Model과 View사이에서 상호 작용을 할 수 있도록 지원
: Command 구현체인 AddImageCommandButton에서의 JfileChooser를 이용하여, Image와 View를 연결시켜줌.
