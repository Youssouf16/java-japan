package question1;
import Jama.Matrix;
	

//The answer to this question is a system of equation which can be solve using matrix.
//The equation is	x + y =35 as chicken + rabbits = 35 heads and
//					2x + 4y = 94 as 2legs for each chicken and 4 legs for each rabbits.
public class Equation100{

	public void Main() {
        //Creating  Arrays Representing Equations
        double[][] lhsArray ={ {1, 1}, {2, 4}};
        double[] rhsArray = {35, 94};
        //Creating Matrix Objects with arrays
        Matrix lhs = new Matrix(lhsArray);
        Matrix rhs = new Matrix(rhsArray, 2);
        //Calculate Solved Matrix
        Matrix ans = lhs.solve(rhs);
        //Printing Answers
        System.out.println("chickens = " + Math.round(ans.get(0, 0)));
        System.out.println("rabbits = " + Math.round(ans.get(1, 0)));
    }
    public static void main(String[] args) {
        new Main();
    }
}
