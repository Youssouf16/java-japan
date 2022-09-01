package question1;
//Import the LinkedList class
public class Squares {
	static void myMethod(int a, int[] finale1) {
	
		for(int i=0;i<a;i++) {
			int a1, b;
			a1 = finale1[i]*finale1[i];
			b= a1;
			finale1[i]= b;
		
		}
	  }
	public static void main(String[] args) {
		int range = 20;
		
		int[] initial = new int[20];
		int a=1;
		for(int i=0;i<range;i++) {
			
			initial[i]=a;
			a++;
		}
		System.out.println("initial is:");
		for(int i=0;i<20;i++){
			System.out.print(initial[i] + " ");
		}

		
		myMethod(20,initial);

		System.out.println("final is:");
		for(int i=0;i<20;i++){
			System.out.print(initial[i] + " ");
		}
		
		
		
		
		
		
		
	}

}
