package ssafy.oopArray.ws;

public class Movie {
	private int id;
	private String title;
	private String director;
	private String genre;
	private int runnigTime;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(int id, String title, String director, String genre, int runnigTime) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runnigTime = runnigTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRunnigTime() {
		return runnigTime;
	}

	public void setRunnigTime(int runnigTime) {
		this.runnigTime = runnigTime;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director=" + director + ", genre=" + genre + ", runnigTime="
				+ runnigTime + "]";
	}
	
	
}
