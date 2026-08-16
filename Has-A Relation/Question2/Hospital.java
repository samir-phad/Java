public class Hospital {
    private int hid;
    private String name;
    private Doctor doctor;

    public void setHid(int id){
        this.hid = id;
    }
    public int getHid(){
        return hid;
    }

    public void setHname(String nm){
        this.name = nm;
    }
    public String getHname(){
        return name;
    }

    public void setDoctor(Doctor dr){
        this.doctor = dr;
    }
    public Doctor getDoctor(){
        return doctor;
    }

}
