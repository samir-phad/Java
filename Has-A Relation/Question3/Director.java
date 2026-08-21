public class Director{


	private int did;
	private String name;
	private Production production;

public void setDid(int id){
	this.did = id;
}
public int getDid(){
	return did;
}

public void setDname(String nm){
	this.name = nm;
}
public String getDname(){
	return name;
}
public void setProduction(Production pdt){
	this.production = pdt;
}
public Production getProduction(){
	return production;
}

}