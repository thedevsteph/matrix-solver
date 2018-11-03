package matrices;
import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class addTwoMatrices {

	 private Matrix matrix; 
	
	 @BeforeEach
	 public void newMatrix() {
		 matrix = new Matrix();
	 }
	 

	@Test
	public void throwsErrorIfMatricesHaveDifferentDimensions() throws Exception{
		int[][] firstMatrix = {{1, 3, 6}, {3,4, 6}, {7,2,11}};
		int[][] secondMatrix = {{1,2, 2}, {3,2, 4}};
		matrix.addMatrices(firstMatrix, secondMatrix);	
	}
		
	@Test
	public void addingMatricesAThreeByTwo(){
		int[][] firstMatrix = {{1, 3, 6}, {3, 4, 6}};
		int[][] secondMatrix = {{1,2, 2}, {3, 2, 4}};
		int[][] result =  {{2, 5, 8}, {6, 6, 10}};
		matrix.addMatrices(firstMatrix, secondMatrix);
		assertArrayEquals(matrix.addMatrices(firstMatrix, secondMatrix), result);	
	}
	
	@Test
	public void addingMatricesAThreeByThree(){
		int[][] firstMatrix = {{1, 3, 6}, {3,4, 6}, {7,2,11}};
		int[][] secondMatrix = {{1,2, 2}, {3,2, 4}, {2,3,4}};
		int[][] result =  {{2 ,5, 8}, {6,6, 10}, {9,5,15}};
		matrix.addMatrices(firstMatrix, secondMatrix);
		assertArrayEquals(matrix.addMatrices(firstMatrix, secondMatrix), result);	
	}
	
	
	

};
