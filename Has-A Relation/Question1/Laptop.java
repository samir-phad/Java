public class Laptop{

	private int lid;
	private String modelName;
	private Processor processor;

public void setLid(int id){
	this.lid = id;
}
public int getLid(){
	return lid;
}

public void setMname(String nm){
	this.modelName = nm;
}
public String getMname(){
	return modelName;
}

public void setProc(Processor pc){
	this.processor = pc;
}
public Processor getProc(){
	return processor;
}

}