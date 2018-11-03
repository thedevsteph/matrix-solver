package matrices.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matrices.Matrix;

class subtractTwoMatricesTest {

	 private Matrix matrix; 
		
	 @BeforeEach
	 public void newMatrix() {
		 matrix = new Matrix();
	 }
	 

	@Test
	public void throwsErrorIfMatricesHaveDifferentDimensions() throws Exception{
		int[][] firstMatrix = {{1, 3, 6}, {3,4, 6}, {7,2,11}};
		int[][] secondMatrix = {{1,2, 2}, {3,2, 4}};
		matrix.subtractMatrices(firstMatrix, secondMatrix);	
	}
		
	@Test
	public void subtractingMatricesThreeByTwo(){
		int[][] firstMatrix = {{1, 3, 6}, {3, 4, 6}};
		int[][] secondMatrix = {{1,2, 2}, {3, 2, 4}};
		int[][] result =  {{2, 5, 8}, {6, 6, 10}};
		matrix.subtractMatrices(firstMatrix, secondMatrix);
		assertArrayEquals(matrix.subtractMatrices(firstMatrix, secondMatrix), result);	
	}
	
	@Test
	public void subtractingMatricesAThreeByThree(){
		int[][] firstMatrix = {{1, 3, 6}, {3,4, 6}, {7,2,11}};
		int[][] secondMatrix = {{1,2, 2}, {3,2, 4}, {2,3,4}};
		int[][] result =  {{2 ,5, 8}, {6,6, 10}, {9,5,15}};
		matrix.subtractMatrices(firstMatrix, secondMatrix);
		assertArrayEquals(matrix.subtractMatrices(firstMatrix, secondMatrix), result);	
	}
	
	
	

}
