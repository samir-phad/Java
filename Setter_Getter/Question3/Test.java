public class Test{


public static void main (String [] args){

	Company c = new Company();
	c.setName("TCS");
	String name = c.getName();
	System.out.println("Company name is :- " + name);


	c.setCId(152);
	int cid = c.getCId();
	System.out.println("Company Cid is :- " + cid);


	c.setArea(153.5f);
	float area = c.getArea();
	System.out.println("Company Area is :- " + area);


	c.setAdd("Pune");
	String add = c.getAdd();
	System.out.println("Company Addrs is :- " + add);

	c.setMobno(951892);
	long mono = c.getMobno();
	System.out.println("Company Mobno is :- " + mono);
}

}