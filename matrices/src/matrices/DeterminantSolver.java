package matrices;

public class DeterminantSolver {
	
	public int twoByTwoSolver(int [][] matrix) {
		int result = (matrix[0][0] * matrix [1][1]) - (matrix[1][0] * matrix [0][1]);
		return result;
	}
	
	
	


}
