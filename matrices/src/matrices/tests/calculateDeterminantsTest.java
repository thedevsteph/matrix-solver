package matrices.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matrices.Matrix;

class calculateDeterminantsTest {

	 private Matrix matrix; 
		
	 @BeforeEach
	 public void newMatrix() {
		 matrix = new Matrix();
	 }
	 
	 @Test
	 public void getDeterminantOfTwoByTwoMatrix() {
		 int[][] chosenMatrix = {{3,8}, {4, 6}};
		 assertEquals(matrix.getDeterminant(chosenMatrix), -14);
	 }
	 
	 @Test
	 public void getDeterminantOfThreeByThreeMatrix() {
		 int[][] chosenMatrix = {{6,1,1}, {4,-2,5}, {2,8,7}};
		 assertEquals(matrix.getDeterminant(chosenMatrix), -306);
	 }
	 
	 @Test
	 public void throwsExceptionIfMatrixIsNotSquare() throws Exception{
		 int[][] chosenMatrix = {{1,1}, {2,2,2}};
		 matrix.getDeterminant(chosenMatrix);
		 
	 }
	 
	 
}
