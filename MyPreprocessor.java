
public  class MyPreprocessor implements Preprocessor{
	public SourceCode preprocess(SourceCode code) {
		String filename=code.getFilename();
		filename="preprocessed_"+filename;
		SourceCode newcode = new SourceCode(filename);
		System.out.println("Generating a new C code: "+newcode.getFilename());
		return newcode;
	}

	
}
