import java.util.Iterator;
import java.util.List;

public class IDE implements Builder{
	MyPreprocessor preprocessor = new MyPreprocessor();
	MyCompiler compiler = new MyCompiler();
	MyLinker linker = new MyLinker();
	String exe= null;
	@Override
	public String createProject(String str) {
		exe= str + ".exe";
		return exe;
	}

	@Override
	public Executable build(SourceCode[] scrcodes) {
		
		int i = scrcodes.length;
		ObjectCode[] objcode = new ObjectCode[i];
		for(int j =0; j<i ; j++) {
			objcode[j] =compiler.compile(preprocessor.preprocess(scrcodes[j]));
		}
		
		Executable exec = linker.link(exe, objcode);
		exec.execute();
		return exec;
	}

	@Override
	 public Executable build(List<SourceCode> code) {
        SourceCode[] processedCode = new SourceCode[code.size()];
        ObjectCode[] objs = new ObjectCode[code.size()];
        for (int i = 0; i < code.size(); i++) {
            processedCode[i] = preprocessor.preprocess(code.get(i));
            objs[i] = compiler.compile(processedCode[i]);
        }
        Executable exec = linker.link(exe, objs);
		exec.execute();
		
        return exec;
    }
	

}
