public class Account {

	private int accNo;
	private String type;
	private Customer customer;

	public void setAccNo(int no){
		this.accNo = no;
	}
	public int getAccNo(){
		return accNo;
	}

	public void setType(String typ){
		this.type = typ;
	}
	public String getType(){
		return type;
	}

	public void setCus(Customer ct){
		this.customer = ct;
	}
	public Customer getCus(){
		return customer;
	}

}