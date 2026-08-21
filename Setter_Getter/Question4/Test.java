
public class Test {
    public static void main(String[] args) {
        School s = new School();
        s.setSname("Samir");
        s.setSid(15);
        s.setSadd("Nashik");
        s.setSmono(986532147);

        String name = s.getSname();
        int id = s.getSid();
        String add = s.getSadd();
        long Mono = s.getSmono();

        System.out.println("Student name :- "+ name);
        System.out.println("Student id :- "+ id);
        System.out.println("Student Address :- "+ add);
        System.out.println("Student Mono :- "+ Mono);
        

        
    }
    
}
