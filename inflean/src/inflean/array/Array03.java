package inflean.array;

import java.util.Scanner;

public class Array03 {
	

	 int[] solution(int[] aArr, int[] bArr) {
		
		 int[] winner = new int[aArr.length];
		 
		 for(int i=0; i<aArr.length; i++) {
			 
		 }
		 
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array03 t = new Array03();
		
		int n = sc.nextInt();
		int[] aArr = new int[n];
		int[] bArr = new int[n];
		
		for(int i =0; i<n;i++) {
			aArr[i] = sc.nextInt();
			bArr[i] = sc.nextInt();
		}
		
		System.out.println(t.solution(aArr, bArr));
	}


}
