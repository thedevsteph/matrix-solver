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
		 int[][] firstMatrix = {{3,8}, {4, 6}};
		 assertEquals(matrix.getDeterminant(firstMatrix), -14);
	 }
	 
}
