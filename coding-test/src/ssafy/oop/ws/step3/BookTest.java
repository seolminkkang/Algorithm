package ssafy.oop.ws.step3;

/**
 * 도서 객체를 생성하고 정보를 출력하는 클래스
 */
public class BookTest {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.isbn = "21424";
		b1.title = "Java Pro";
		b1.author = "김하나";
		b1.publisher = "jaen.kr";
		b1.desc = "Java 기본 문법";
		
		Book b2 = new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링");
		
		System.out.println("*********************** 도서목록 **********************");
		System.out.println(b1);
		System.out.println(b2);
	}
}
