import java.util.List;

public interface Linker {
	  /*
    link() �Լ��� ���޵Ǵ� ������Ʈ ���ϵ��� �̸��� �� ���� �������� �����ؼ� ���̵�, ���� �̸� ���� ���� ���๮��(\n)�� ����.
    �̷��� ������ �� ���� ������ Executable ��ü�� ������ �� ���� ������ �̸��� �Բ� ���ڷ� ���޵�
    link()�� ����Ǹ� "Linking\n������Ʈ_����_�̸�1\n������Ʈ_����_�̸�2..."�� ȭ�鿡 ��µ�

    ��: objFiles�� �ִ� ObjectCode ��ü���� a.obj�� b.obj��� �̸��� ������ �ִٸ� link()�� ����Ǹ� "\na.obj\nb.obj"���
       ���ڿ��� �����ǰ�, �� ���ڿ��� Executable ��ü�� ������ �� �� ��° ���ڷ� ���޵�. ���� ��� link() �Լ��� ����Ǹ� ȭ�鿡��
       Linking
       a.obj
       b.obj
       �� ��µǰ�, ���ο� Executable ��ü�� �����Ǿ ��ȯ��
   */
    Executable link(String exeFileName, ObjectCode[] objFiles);
    Executable link(String exeFileName, List<ObjectCode> objFiles);
}
