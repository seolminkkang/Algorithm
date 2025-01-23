package ssafy.array.ws;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class AppleTree2 {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		

		int n = sc.nextInt();
		sc.nextLine();

		int[][] directions = {{0,-1},{0,1},{1,0},{-1,0}};
		//  좌 우 하 상


		int[][] ground = new int[n][n]; 
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n ;i++) {
			
			String[] str = sc.nextLine().split(" ");
			int[] intArr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
			ground[i] = intArr;
			
		}
		
		for(int i= 0 ; i< n; i++) {
			for(int j=0; j<n;j++) {
				
				final int row = i;
				final int col = j;
				
				AtomicInteger sum = new AtomicInteger(ground[row][col]);
				
				Arrays.stream(directions).forEach(dir ->{
					
					int newRow = row + dir[0];
					int newCol = col + dir[1];
					
					if(newRow >= 0 && newRow < n && newCol >= 0 && newCol <n) { // �ε��� ����� ���� X
						sum.addAndGet(ground[newRow][newCol]);
						
					}
					
					
				});
			
				arr[i][j] = sum.get();
			}
		}
		
		AtomicInteger result = new AtomicInteger();
		Arrays.stream(arr).forEach(row ->{
			Arrays.stream(row).forEach(col ->{
				result.updateAndGet(current -> Math.max(col, current));
			});
		});
		
		System.out.println(result);
	}
}
