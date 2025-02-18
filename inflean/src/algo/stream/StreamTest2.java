package algo.stream;

import java.util.Arrays;
import java.util.Comparator;

public class StreamTest2 {
	public static void main(String[] args) {
		
		// 배열에서 짝수만 뽑아 중복을 제거한 후에 역순으로 정렬하는 프로그램
		int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
		
		int[] result = Arrays.stream(data) // IntStream 생성
				.boxed() // IntStream -> Stream<Integer>로 변경
				.filter(n -> n % 2 ==0) // 짝수만
				.distinct() // 중복제거
				.sorted(Comparator.reverseOrder()) // 역순으로 정렬
				.mapToInt(Integer::intValue) // Stream<Integer>를 IntStream으로 변경
				.toArray(); // int[] 배열로 반환
		
		
		int[] result2 = Arrays.stream(data).filter(n -> n%2==0).distinct().sorted().toArray();
		
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));
		
		
	}
}
