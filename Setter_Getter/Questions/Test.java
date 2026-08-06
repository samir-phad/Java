public class Test{

public static void main (String [] args){

	Unversity u = new Unversity();
	u.setUname("SPPU");
	u.setUid(54);
	u.setAddr("Pune");

System.out.println("Unversity name is :- " + u.getUname());
System.out.println("Unversity Uid is :- " + u.getUid());
System.out.println("Unversity Address is :- " + u.getAddr());

	Collage c = new Collage ();
	c.setClg("MET");
	c.setClgid(111);
	c.setClgAddr("Nashik");

System.out.println("Collage name is :- " + c.getClg());
System.out.println("Collage Collage id is :- " + c.getClgid());
System.out.println("Collage College id is :- " + c.getClgAddr());

	}
}