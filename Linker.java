import java.util.List;

public interface Linker {
	  /*
    link() 함수에 전달되는 오브젝트 파일들의 이름을 한 줄의 문장으로 연결해서 붙이되, 파일 이름 시작 전에 개행문자(\n)를 붙임.
    이렇게 생성된 한 줄의 문장은 Executable 객체를 생성할 때 실행 파일의 이름과 함께 인자로 전달됨
    link()가 실행되면 "Linking\n오브젝트_파일_이름1\n오브젝트_파일_이름2..."가 화면에 출력됨

    예: objFiles에 있는 ObjectCode 객체들이 a.obj와 b.obj라는 이름을 가지고 있다면 link()가 실행되면 "\na.obj\nb.obj"라는
       문자열이 생성되고, 이 문자열은 Executable 객체를 생성할 때 두 번째 인자로 전달됨. 예를 들어 link() 함수가 실행되면 화면에는
       Linking
       a.obj
       b.obj
       가 출력되고, 새로운 Executable 객체가 생성되어서 반환됨
   */
    Executable link(String exeFileName, ObjectCode[] objFiles);
    Executable link(String exeFileName, List<ObjectCode> objFiles);
}
