package algo.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest3 {
	public static void main(String[] args) {
			String num_str = "123456789";
			
			int[] answer = Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).toArray();
			
			int sum = IntStream.of(answer).sum();
			
			System.out.println(sum);
			
			
	}
}
