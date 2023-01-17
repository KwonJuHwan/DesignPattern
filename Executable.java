public class Executable {
    private String exeFileName;
    private String objFileNames;

    /* ���� ���� �̸��� �� ���� ���ڿ��� ������ ������Ʈ ���� �̸����� ���ڷ� ���� ����
    ������Ʈ ���� �̸����� Linker �������̽��� link() �Լ����� ������� ���� ���ڷ� ���޵�
  */
    public Executable(String exeFileName, String objFileNames) {
        this.exeFileName = exeFileName;
        this.objFileNames = objFileNames;
    }

    /* ���� ���� �̸��� ������Ʈ ���� �̸����� ȭ�鿡 ��� */
    public void execute() {
        System.out.println("Exe file name: " + exeFileName);
        System.out.println("Linked files: " + objFileNames);
    }
}
