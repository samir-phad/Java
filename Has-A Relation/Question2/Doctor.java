class Doctor{
    private int did;
    private String name;
    private Specialization specialization;

    public void setDid(int id){
        this.did = id;
    }
    public int getDid(){
        return did;
    }

    public void setName(String nm){
        this.name = nm;
    }
    public String getName(){
        return name;
    }

    public void setSpe(Specialization sp){
        this.specialization = sp;
    }
    public Specialization getSpe(){
        return specialization;
    }
}