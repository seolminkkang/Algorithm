package ssafy.oop.ws.step2;

public class Movie {
	int id;
	String title;
	String director;
	String genre;
	int runningTime;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie(int id, String title, String director, String genre, int runningTime) {
		this.id=id;
		this.title =title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
}
