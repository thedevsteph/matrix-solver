package matrices.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matrices.Matrix;

class MultiplyTwoMatricesTest {

	 private Matrix matrix; 
		
	 @BeforeEach
	 public void newMatrix() {
		 matrix = new Matrix();
	 }

	 @Test
	 public void multiplyTwoMatrices(){
		 int[][] firstMatrix = {{1,2,3},{4,5,6}};
		 int[][] secondMatrix = {{7,8}, {9,10}, {11, 12}};
		 int[][] result = {{58,64},{139, 154}};
		 assertArrayEquals(matrix.multiplyMatrices(firstMatrix, secondMatrix), result); 
	 }
	 
	 @Test
	 public void multiplyAnotherSetOfMatrices(){
		 int[][] firstMatrix = {{3,4,2}};
		 int[][] secondMatrix = {{13,9,7,15}, {8,7,4,6}, {6,4,0,3}};
		 int[][] result = {{83,63,37,75}};
		 assertArrayEquals(matrix.multiplyMatrices(firstMatrix, secondMatrix), result); 
	 }
	 
	 @Test
	 public void multiplyATwoByTwo() {
		 int[][] firstMatrix = {{1,2}, {3,4}};
		 int[][] secondMatrix =  {{2,0}, {1,2}};
		 int[][] result = {{4,4}, {10,8}};
		 assertArrayEquals(matrix.multiplyMatrices(firstMatrix, secondMatrix), result); 
	 }
	 
	 
	 @Test
	 public void throwsErrorIfMatrixAreWrongSize() throws Exception{
		 int[][] firstMatrix = {{1,2}, {3,4}};
		 int[][] secondMatrix =  {{233,0},{12,1},{12,33} };
		 matrix.multiplyMatrices(firstMatrix, secondMatrix);
	 }
	 
	 @Test
	 public void expectDifferentValues() throws Exception{
		 int[][] firstMatrix = {{1,2}, {3,4}};
		 int[][] secondMatrix =  {{2,0}, {1,2}};
		 int[][] value1 = matrix.multiplyMatrices(firstMatrix, secondMatrix);
		 int[][] value2 =  matrix.multiplyMatrices(secondMatrix, firstMatrix);
		 assertNotEquals(value1,value2);
		 
	 }
	 
	 
}
