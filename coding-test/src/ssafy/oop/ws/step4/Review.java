package ssafy.oop.ws.step4;

public class Review {
	int reviewId;
	int resId;
	String writer;
	String content;
	
	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(int reviewId, int resId, String writer, String content) {
		super();
		this.reviewId = reviewId;
		this.resId = resId;
		this.writer = writer;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", resId=" + resId + ", writer=" + writer + ", content=" + content
				+ "]";
	}
	
	
	
}
