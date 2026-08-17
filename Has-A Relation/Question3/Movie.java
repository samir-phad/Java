public class Movie{

	private int mid;
	private String title;
	private Director director;

public void setMid(int id){
	this.mid = id;
}
public int getMid(){
	return mid;
}

public void setTitle(String tl){
	this.title = tl;
}
public String getTitle(){
	return title;
}

public void setDirector(Director dt){
	this.director = dt;
}
public Director getDirector(){
	return director;
}

}