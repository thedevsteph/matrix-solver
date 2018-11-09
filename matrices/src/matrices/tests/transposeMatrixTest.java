package matrices.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matrices.Matrix;

class TransposeMatrixTest {

	 private Matrix matrix; 
		
	 @BeforeEach
	 public void newMatrix() {
		 matrix = new Matrix();
	 }
	 
	 @Test
	 public void transposeAThreeByThreeMatrix() {
		 int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		 int [][] result = {{1,4,7}, {2,5,8}, {3,6,9}};
		 assertArrayEquals(matrix.transposeOf(matrix), result);
	 }
	 
	 @Test
	 public void transposeATwoByTwoMatrix() {
		 int[][] matrix = {{1,2}, {4,5}};
		 int [][] result =  {{1,4}, {2,5}};
		 assertArrayEquals(matrix.transposeOf(matrix), result);
	 }
	 
	 @Test
	 public void transposeMatrixWithNegativeNumbers() {
		 int[][] matrix = {{1,-2}, {4,-5}};
		 int [][] result =  {{1,4}, {-2,-5}};
		 assertArrayEquals(matrix.transposeOf(matrix), result);
	 }
	 
	 @Test
	 public void transposeIdentityMatrix() {
		 int[][] matrix = {{1,0,0}, {0,1,0}, {0,0,1}};
		 int [][] result = matrix;
		 assertArrayEquals(matrix.transposeOf(matrix), result);
	 }
	 
	 
	 
}
