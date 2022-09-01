package question1;

import Jama.Matrix;

public class Main {
    public Main() {
        //Creating  Arrays Representing Equations
        double[][] lhsArray ={ {1, 1}, {2, 4}};
        double[] rhsArray = {35, 94};
        //Creating Matrix Objects with arrays
        Matrix lhs = new Matrix(lhsArray);
        Matrix rhs = new Matrix(rhsArray, 2);
        //Calculate Solved Matrix
        Matrix ans = lhs.solve(rhs);
        //Printing Answers
        System.out.println("x = " + Math.round(ans.get(0, 0)));
        System.out.println("y = " + Math.round(ans.get(1, 0)));
    }
    public static void main(String[] args) {
        new Main();
    }
}