public class Company  {



	private String cName;
	private int cId;
	private float area;
	private String addr;
	private long mobno;


public void setName(String nm){
	this.cName = nm;
}
public String getName(){
	return cName;
}

public void setCId(int id){
	this.cId = id;
}
public int getCId(){
	return cId;
}

public void setArea(float are){
	this.area = are;
}
public float getArea(){
	return area;
}

public void setAdd(String add){
	this.addr = add;
}
public String getAdd(){
	return addr;
}

public void setMobno(long mono){
	this.mobno = mono;
}
public long getMobno(){
	return mobno;
}

}