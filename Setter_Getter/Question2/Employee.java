public class Employee{


	private String name;
	private int id; 
	private double salary;

	private long mobno;
	private String addr;


public void setName (String nam){
		this.name=nam;
	}
public String getName(){
		return name;
	}

public void setId (int Id){
		this.id=Id;
	}
public int getId(){
		return id;
	}

public void setSalary (double slry){
		this.salary=slry;
	}
public double getSalary(){
		return salary;
	}

public void setMobno (long mono){
		this.mobno=mono;
	}
public long getMobno(){
		return mobno;
	}

public void setAddr (String add){
		this.addr=add;
	}
public String getAddr(){
		return addr;
	}

}