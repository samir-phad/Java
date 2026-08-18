public class Bank{

	private int bid;
	private String bankName;
	private Account account;


	public void setBid(int id){
		this.bid = id;
	}
	public int getBid(){
		return bid;
	}

	public void setBname(String nm){
		this.bankName = nm;
	}
	public String getBname(){
		return bankName;
	}

	public void setAcc(Account ad){
		this.account = ad;
	}
	public Account getAcc(){
		return account;
	}




} 
