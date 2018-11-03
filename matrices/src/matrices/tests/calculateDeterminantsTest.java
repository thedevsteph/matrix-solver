package matrices.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matrices.DeterminantSolver;
import matrices.Matrix;

class calculateDeterminantsTest {

	 private DeterminantSolver determinant; 
		
	 @BeforeEach
	 public void newMatrix() {
		 determinant = new DeterminantSolver();
	 }
	 
	 @Test
	 public void getDeterminantOfTwoByTwoMatrix() {
		 int[][] chosenMatrix = {{3,8}, {4, 6}};
		 assertEquals(determinant.twoByTwoSolver(chosenMatrix), -14);
	 }
	 
	 @Test
	 public void getDeterminantOfThreeByThreeMatrix() {
		 int[][] chosenMatrix = {{6,1,1}, {4,-2,5}, {2,8,7}};
		 assertEquals(determinant.solve(chosenMatrix), -306);
	 }
	 
	 
	 @Test
	 public void throwsExceptionIfMatrixIsNotSquare() throws Exception{
		 int[][] chosenMatrix = {{1,1}, {2,2,2}};
		 determinant.solve(chosenMatrix);
		 
	 }

	 
	 
	 
}
