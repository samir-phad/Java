public class School{

    private  String sName;
    private  int sId;
    private  String sAddr;
    private  long sMobno;

    public void setSname(String nm){
        this.sName = nm;
    }

    public void setSid(int id){
        this.sId = id;
    }
    
    public void setSadd(String addr){
        this.sAddr = addr;
    }

    public void setSmono(long no){
        this.sMobno = no;
    }

        public String getSname(){
        return  sName;
    }

    public int getSid(){
        return  sId;
    }
    
    public String getSadd(){
        return  sAddr;
    }

    public long getSmono(){
        return  sMobno;
    }


}