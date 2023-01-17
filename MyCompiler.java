

public class MyCompiler implements Compiler{

	@Override
	public ObjectCode compile(SourceCode srcCode) {
		String filename= srcCode.getFilename();
		String objname =filename.substring(0, filename.lastIndexOf("."));
		objname= objname+".obj";
		System.out.println("Compiling code: "+srcCode.getFilename());
		ObjectCode obj = new ObjectCode(objname);
		System.out.println("Generating object code: "+obj.getFilename());
		return obj;
	}
	
	
}
