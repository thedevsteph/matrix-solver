package matrices.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import matrices.Matrix;

class scalarMultiplicationTest {

	 private Matrix matrix; 
		
	 @BeforeEach
	 public void newMatrix() {
		 matrix = new Matrix();
	 }

	 @Test
	 public void multiplyMatrixByTwo(){
		 int[][] chosenMatrix = {{1,2}, {3,4}};
		 int scalarValue = 3;
		 int[][] result = {{3,6}, {9,12}};
		 assertArrayEquals(matrix.scalarMultiplication(chosenMatrix, scalarValue), result);
	 }
	 
	 @Test
	 public void multiplyMatrixByNegativeNumber(){
		 int[][] chosenMatrix = {{1,2}, {3,4}};
		 int scalarValue = -3;
		 int[][] result = {{-3,-6}, {-9,-12}};
		 assertArrayEquals(matrix.scalarMultiplication(chosenMatrix, scalarValue), result);
	 }
	 
	 @Test
	 public void multiplyMatrixByZero() {
		 int[][] chosenMatrix = {{32, 12}, {-3,42}, {-2, -43}};
		 int scalarValue = 0;
		 int[][] result =  {{0, 0}, {0,0}, {0, 0}};
		 assertArrayEquals(matrix.scalarMultiplication(chosenMatrix, scalarValue), result);	 
	 }
	 
	 @Test
	 public void throwsErrorIfMatrixIsIncorrectlyFormatted() throws Exception{
		 int[][] chosenMatrix = {{32, 12}, {-3,42}, {-2}};
		 int scalarValue =  -2;
		 matrix.scalarMultiplication(chosenMatrix, scalarValue);
	 }
	 
	 
	 

	 
	 
	 
}
