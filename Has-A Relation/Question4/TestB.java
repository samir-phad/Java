public class TestB{

	public static void main(String [] args){

	Address a = new Address();
	a.setAid(12);
	a.setCity("Nashik");
	a.setState("Maharashtra");

	Customer c = new Customer();
	c.setCid(21);
	c.setName("Raju");
	c.setAdd(a);
	
	Account at = new Account();
	at.setAccNo(60282551);
	at.setType("Saving");
	at.setCus(c);

	Bank b = new Bank();
	b.setBid(789);
	b.setBname("BOM");
	b.setAcc(at);
	
	int Bid = b.getBid();
	String Bname = b.getBname();

	Account act = b.getAcc();
	int Aid = act.getAccNo();
	String Type = act.getType();
	
	Customer cus = 	act.getCus();
	int id = cus.getCid();
	String City = cus.getName();

	Address ad = cus.getAdd();
	int aid = ad.getAid();
	String city = ad.getCity();
	String State = ad.getState();

	System.out.println("Bank id :- "+ Bid);
	System.out.println("Bank name :- "+ Bname);

	System.out.println("Account id :- "+ Aid);
	System.out.println("Account type :- "+ Type);

	System.out.println("Customer id :- "+ id);
	System.out.println("Customer city :- "+ City);

	System.out.println("Address id :- "+ aid);
	System.out.println("Address City :- "+ city);
	System.out.println("Address State :- "+ State);
}
}