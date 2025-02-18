package ssafy.oopArray.ws;

import java.util.Arrays;
import java.util.Scanner;

public class MovieTest {
	
	public static void main(String[] args) {
		
		Movie m = new Movie();
		m.setId(1);
		m.setTitle("어벤져스");
		m.setDirector("홍길동");
		m.setGenre("히어로");
		m.setRunnigTime(2);
		
		Movie m2 = new Movie(2, "파묘", "김길동", "오컬트", 3);
		
		MovieManager mm = new MovieManager();
		mm.add(m);
		mm.add(m2);
		

		//System.out.println(mm.getList());
		
		// toString 을 통해 등록된 사용자 리스트 출력
		System.out.println(Arrays.deepToString(mm.getList()));
		
	
		System.out.println(mm.searchByTitle("파묘"));
		
		// 등록된 사용자 수 출력 ( size 는 private 이므로 출력 x )
		System.out.println(mm.getList().length);
		
		
	}
	
}
