public class GalaxyInformation{


public static void main (String [] args){


	Galaxy g = new Galaxy();
	g.setGname("Jupiter");
	System.out.println("Galaxy Name is :- " + g.getGname());
	
	g.setGarea(6585);
	System.out.println("Galaxy area is :- " + g.getGarea());

	g.setGdistance(9856235);
	System.out.println("Galaxy Distance is :- " + g.getGdistance());

}

}