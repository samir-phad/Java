public class TestM{

public static void main (String [] args){

	Production p = new Production();
	p.setPid(1);
	p.setCname("MovieHub");

	Director d = new Director();
	d.setDid(55);
	d.setDname("Raju");
	d.setProduction(p);
	
	Movie m = new Movie();
	m.setMid(25);
	m.setTitle("Pushpa");
	m.setDirector(d);

	int Mid = m.getMid();
	String Title = m.getTitle();

	Director dt = m.getDirector();
	int did = dt.getDid();
	String dname = dt.getDname();

	Production pt = dt.getProduction();
	int pid = pt.getPid();
	String Pname = pt.getCname();

	System.out.println("Movie id :- " + Mid);
	System.out.println("Movie Title :- " + Title);
	System.out.println();

	System.out.println("Director id :- " + did);
	System.out.println("Director name :- " + dname);
	System.out.println();

	System.out.println("Production id :- "+pid);
	System.out.println("Production name :- "+ Pname);

}

}