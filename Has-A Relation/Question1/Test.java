public class Test{

public static void main (String [] args){

	Brand b = new Brand ();
	b.setBid(1);
	b.setBname("HP");
	b.setCountry("INDIA");

	Processor p = new Processor();
	p.setPid(101);
	p.setType("RTX3050");
	p.setBrand(b);

	Laptop l = new Laptop();
	l.setLid(151);
	l.setMname("VICTUS");
	l.setProc(p);

	Brand bd = p.getBrand();
	int id = bd.getBid();
	String name = bd.getBname();
	String Country = bd.getCountry();

	System.out.println("Brand id " + id);
	System.out.println("Brand name " + name);
	System.out.println("Brand Country " + Country);

	
	Processor pr = l.getProc();
	int Pid = pr.getPid();
	String type = pr.getType();

	System.out.println("Processor id "+Pid);
	System.out.println("Processor Type "+type);


	int lid = l.getLid();
	String Lmname = l.getMname();
	System.out.println("Laptop id "+lid);
	System.out.println("Laptop name "+Lmname);

}

}