package ssafy.oop.ws.step2;

public class MovieTest {
	public static void main(String[] args) {
		
		Movie m1 = new Movie(); 
		m1.id = 001;
		m1.title = "검은수녀들";
		m1.director = "홍길동";
		m1.genre = "오컬트";
		m1.runningTime = 120;
		
		System.out.println(m1.title + "의 장르는 " + m1.genre + "입니다.");
		
		
		Movie m2 = new Movie(002, "어벤져스", "?", "히어로물", 150);
		System.out.println(m2.title + "의 장르는 " + m2.genre + "입니다.");
	
	}
}
