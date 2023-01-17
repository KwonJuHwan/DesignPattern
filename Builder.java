import java.util.List;

public interface Builder {
    /*
       createProject()는 새로운 프로젝트_이름을 지정하기 위해 사용됨
       build() 함수는 두 가지 버전이 있음. build() 함수는 각각 SourceCode 배열(SourceCode[]) 또는 
       SourceCode 리스트(List<SourceCode>)를 입력 받고 Preprocessor, Compiler, Linker의 인터페이스를 활용해서
       preprocessing, compiling, linking을 순서대로 실행한 후 Executable 객체를 생성함.
       이 때 Executable의 실행 파일 이름은 createProject()에 전달된 "프로젝트_이름.exe"가 됨
       예: createProject()에 "new"라는 문자열이 전달되면, build()에서 생성하는 Executable의 실행 파일 이름은 "new.exe"가 됨
       createProject(), build() 함수 2개에 해당되는 함수 헤더를 아래에 작성하고, 이를 구현하는 IDE 클래스를 만들 것
     */
     
   String createProject(String str);
   Executable build(SourceCode[] scrcodes);
   Executable build(List<SourceCode> srccodes);
   
}
