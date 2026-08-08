public class Data {

public Employee setData(){

	Employee e = new Employee();
	e.setName("Samir");
	e.setId(15);
	e.setSalary(45692);
	e.setMobno(98561455);
	e.setAddr("Nashik");

	return e;

}

public void getData(){
	Employee e = setData();
	String name = e.getName();
	int id = e.getId();
	double salary = e.getSalary();
	long mobno = e.getMobno();
	String addr = e.getAddr();


System.out.println("Employee name is :- "+ name);
System.out.println("Employee id is :- "+ id);
System.out.println("Employee salary is :- "+ salary);
System.out.println("Employee mobno is :- "+ mobno);
System.out.println("Employee Addr is :- "+ addr);

}



public static void main (String [] args){


	Data d = new Data();
	d.getData();

}


}