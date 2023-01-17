import java.util.List;

public interface Builder {
    /*
       createProject()�� ���ο� ������Ʈ_�̸��� �����ϱ� ���� ����
       build() �Լ��� �� ���� ������ ����. build() �Լ��� ���� SourceCode �迭(SourceCode[]) �Ǵ� 
       SourceCode ����Ʈ(List<SourceCode>)�� �Է� �ް� Preprocessor, Compiler, Linker�� �������̽��� Ȱ���ؼ�
       preprocessing, compiling, linking�� ������� ������ �� Executable ��ü�� ������.
       �� �� Executable�� ���� ���� �̸��� createProject()�� ���޵� "������Ʈ_�̸�.exe"�� ��
       ��: createProject()�� "new"��� ���ڿ��� ���޵Ǹ�, build()���� �����ϴ� Executable�� ���� ���� �̸��� "new.exe"�� ��
       createProject(), build() �Լ� 2���� �ش�Ǵ� �Լ� ����� �Ʒ��� �ۼ��ϰ�, �̸� �����ϴ� IDE Ŭ������ ���� ��
     */
     
   String createProject(String str);
   Executable build(SourceCode[] scrcodes);
   Executable build(List<SourceCode> srccodes);
   
}
