package question1;
import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int UP, DOWN, RIGHT, LEFT;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter UP steps");
		UP = sc.nextInt();
		System.out.println("enter down steps");
		DOWN = sc.nextInt();
		System.out.println("enter right steps");
		RIGHT = sc.nextInt();
		System.out.println("enter left steps");
		LEFT = sc.nextInt();
		sc.close();
		int distance= (int)Math.round(Math.sqrt((UP-DOWN)^(2)+(RIGHT-LEFT)^(2)));
	
		System.out.println(" The distance from the origine point is :"+distance);
		

	}

}
