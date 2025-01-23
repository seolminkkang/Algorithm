package inflean.array;

import java.util.Scanner;

public class Array01 {
	
	Scanner sc = new Scanner(System.in);
	
	public int solution(int num) {
		
		int[] arr = new int[num];
		
		for(int i=0;i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		int fNum =0;
		
		for(int i : arr) {
			if(fNum < i)System.out.print(i + " ");
			fNum = i;
		}
		
		return num;
		
	}
	

	public static void main(String[] args) {
		
		Array01 t = new Array01();
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(t.solution(num));
		
		
	}
	
	
}
