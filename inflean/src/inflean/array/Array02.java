package inflean.array;

import java.util.Scanner;

public class Array02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num;i++) {
			arr[i] = sc.nextInt();
		}
		int max =0;
		int count = 0;
		for(int i=0; i<num;i++) {
			if(max < arr[i]) {
				count++;
				max = arr[i];
			}
		}
		System.out.println(count);
		
	}
	
}
