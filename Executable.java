public class Executable {
    private String exeFileName;
    private String objFileNames;

    /* 실행 파일 이름과 한 줄의 문자열로 구성된 오브젝트 파일 이름들을 인자로 전달 받음
    오브젝트 파일 이름들은 Linker 인터페이스의 link() 함수에서 만들어진 것이 인자로 전달됨
  */
    public Executable(String exeFileName, String objFileNames) {
        this.exeFileName = exeFileName;
        this.objFileNames = objFileNames;
    }

    /* 실행 파일 이름과 오브젝트 파일 이름들을 화면에 출력 */
    public void execute() {
        System.out.println("Exe file name: " + exeFileName);
        System.out.println("Linked files: " + objFileNames);
    }
}
