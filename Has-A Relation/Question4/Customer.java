public class Customer{

	private int cid;
	private String name;
	private Address address;

	public void setCid(int id){
		this.cid = id;
	}
	public int getCid(){
		return cid;
	}

	public void setName(String nm){
		this.name = nm;
	}
	public String getName(){
		return name;
	}

	public void setAdd(Address ad){
		this.address = ad;
	}
	public Address getAdd(){
		return address;
	}


}