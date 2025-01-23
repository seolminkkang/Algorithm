package ssafy.oop.ws.step4;

public class RestaurantTest {
	public static void main(String[] args) {
		Restaurant r1 = new Restaurant();
		r1.resId = 10; 
		r1.name = "을밀대";
		r1.address = "서울";
		r1.signatureMenu = "냉명";
		r1.rate = 4;
		
		Restaurant r2 = new Restaurant(401, "도마29", "대구", "연어초밥", 3);
		
		System.out.println("**********************맛집목록*********************");
		System.out.println(r1);
		System.out.println(r2);
		
		
		Review re1= new Review();
		re1.reviewId =10;
		re1.resId =1;
		re1.writer="김싸피";
		re1.content = "너무 맛있네요";
		
		Review re2 = new Review(2,401,"나싸피","연어초밥은 여기가 최고!");
		
		
		System.out.println("**********************리뷰목록*********************");
		System.out.println(re1);
		System.out.println(re2);
		
		
	}
}
