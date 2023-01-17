import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String EXE_FILE_NAME = "main.exe";
        
        // �������μ���, �����Ϸ�, ��Ŀ ��ü ����
        /*
        
        �Ʒ� �ڵ� ����
        
        */
        Preprocessor preprocessor = new MyPreprocessor();
        Compiler compiler = new MyCompiler();
        Linker linker = new MyLinker();
        
      // �������μ���, �����Ϸ�, ��Ŀ�� ���� ���� ����ؼ� exe���� �����ϰ� ����
        String[] fileNames = { "a.c", "b.c", "c.c" };
        // SourceCode ��ü ����
        System.out.println("\n�ҽ� �ڵ� ����");
        SourceCode[] code = new SourceCode[fileNames.length];
        for (int i = 0; i < fileNames.length; i++) {
            code[i] = new SourceCode(fileNames[i]);
        }

        // preprocess �ҽ� �ڵ�
        System.out.println("\n�������μ��� ���");
        SourceCode[] preprocessedCode = new SourceCode[fileNames.length];
        for (int i = 0; i < fileNames.length; i++) {
            preprocessedCode[i] = preprocessor.preprocess(code[i]);
        }
     // compile reprocessed
      System.out.println("\n�����Ϸ� ���");
        ObjectCode[] objs = new ObjectCode[fileNames.length];
        for (int i = 0; i < fileNames.length; i++) {
            objs[i] = compiler.compile(preprocessedCode[i]);
        }
        // link ������Ʈ ����
        System.out.println("\n��Ŀ ���");
        Executable exe = linker.link(EXE_FILE_NAME, objs);
        System.out.println("\n����");
        exe.execute();

        System.out.println("\nIDE ���");

        // �ۻ�� ������ �̿��ؼ� ������ IDE ��ü�� ������ �� exe������ �����ϰ� ����
        // IDE�� ����� ���� �迭�� ����Ʈ ���� �� ���� ���� �Լ��� ���� ����ؼ�
        // ArrayProject.exe�� ListProject.exe�� �����ϴ� �ڵ带 �߰��� ��
        // �迭�� ����Ʈ�� ��ȯ�ϴ� ���� Arrays.asList() �Լ� ��� ����
 
        IDE ide= new IDE();
        ide.createProject(EXE_FILE_NAME);
        ide.build(code);
        List<SourceCode> listcode = Arrays.asList(code);
        ide.build(listcode);    }
}
