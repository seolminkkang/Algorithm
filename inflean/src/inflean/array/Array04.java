package inflean.array;


import java.util.Scanner;

public class Array04 {

	int[] solution(int num) {
		
		int[] ans = new int[num];
		ans[0] = 1;
		ans[1] = 1;
		for (int i = 2; i < num; i++) {
			ans[i] = ans[i-2]+ans[i-1];
		}

		return ans;
	}

	public static void main(String[] args) {
		Array04 t = new Array04();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		for(int n : t.solution(num)) System.out.print(n + " ");

	}

}
