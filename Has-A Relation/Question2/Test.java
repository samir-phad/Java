public class Test{
        public static void main(String[] args) {
            Specialization s = new Specialization();
            s.setSid(12);
            s.setField("Eye's Department");

            Doctor d = new Doctor();
            d.setDid(441);
            d.setName("Vikas");
            d.setSpe(s);

            Hospital h =new Hospital();
            h.setHid(312);
            h.setHname("Vedant eye Hostpital");
            h.setDoctor(d);

            System.out.println("Hospital id :- " +h.getHid());
            System.out.println("Hospital name :- " + h.getHname());
            System.out.println();

            Doctor dr = h.getDoctor();
            System.out.println("Doctor id :- "+ dr.getDid());
            System.out.println("Doctor name :- "+ dr.getName());
            System.out.println();

            Specialization sp = d.getSpe();
            System.out.println("Specialization id :- "+sp.getSid());
            System.out.println("Specialization field :- "+sp.getField());
        }

}