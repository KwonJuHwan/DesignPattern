import java.util.Iterator;
import java.util.List;

public class MyLinker implements Linker{

	@Override
	public Executable link(String exeFileName, ObjectCode[] objFiles) {
		String objFilenames =null;
		int i = objFiles.length;
		for (int j=0; j< i; j++) {
			objFilenames= objFilenames +"\n"+objFiles[j].getFilename();
		}
		Executable exec = new Executable(exeFileName, objFilenames);
		return exec;
	}

	@Override
	public Executable link(String exeFileName, List<ObjectCode> objFiles) {
	
		String objFilenames = null;
		for (Iterator<ObjectCode> iter = objFiles.iterator(); iter.hasNext(); ) {
			objFilenames = objFilenames +"\n"+ iter.next().getFilename();
			}
		Executable exec = new Executable(exeFileName, objFilenames);
		return exec;
	}
	

}
