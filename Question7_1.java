
package question1;

import java.util.Scanner;

public class Question7_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter x value");		
		x = scanner.nextInt();
		System.out.println("enter y value");
		y = scanner.nextInt();				
		scanner.close();  
		int[][] matrix= new int[x][y];	
		
		for(int i=0;i<x;i++){
				for(int j=0;j<y;j++){
					matrix [i][j] = i*j;
				}				
				
		} 
		System.out.print("[");
		for(int i=0;i<x;i++){
			System.out.print("[");
			for(int j=0;j<y;j++){
				System.out.print(matrix[i][j]);
				if(j !=y-1) {
					System.out.print(",");
					}
			}
			System.out.print("]");
			if(i !=x-1) {
			System.out.print(",");
			}
		}
		System.out.print("]");
				
	}

}
