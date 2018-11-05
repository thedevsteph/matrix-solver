package matrices;

public class Matrix {
	
	public void errorMessage(){
		System.out.println("There is an error. Please check your inputs");
	}
	
	public int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix){
		int[][] thirdMatrix = new int[firstMatrix.length][firstMatrix[0].length];
		try {	
			for (int x = 0; x < firstMatrix.length; x++) {
		    	for(int y = 0; y < firstMatrix[0].length; y++) {
		    		thirdMatrix[x][y] = firstMatrix[x][y] + secondMatrix[x][y]; 	
		    		System.out.printf("%5d ", thirdMatrix[x][y]);
		    	}   	
		    	System.out.println();
	    	} 
		}
		catch(RuntimeException e) {
			errorMessage();
		}
	
	    return thirdMatrix;
	}
		
	public int[][] subtractMatrices(int[][] firstMatrix, int[][] secondMatrix){
		int[][] thirdMatrix = new int[firstMatrix.length][firstMatrix[0].length];
		try {	
			for (int x = 0; x < firstMatrix.length; x++) {
		    	for(int y = 0; y < firstMatrix[0].length; y++) {
		    		thirdMatrix[x][y] = firstMatrix[x][y] - secondMatrix[x][y]; 	
		    		System.out.printf("%5d ", thirdMatrix[x][y]);
		    	}   	
		    	System.out.println();
	    	} 
		}
		catch(RuntimeException e) {
			errorMessage();
		}
		
	    return thirdMatrix;
	}
	
	public int[][] scalarMultiplication(int[][] matrix, int scalarValue){
		int[][] newMatrix = new int[matrix.length][matrix[0].length];
		try {
			for(int x = 0;  x < matrix.length; x++) {
				for(int y = 0;  y < matrix[0].length; y++) {
					newMatrix[x][y]  = matrix[x][y] * scalarValue;
					System.out.printf("%5d ", newMatrix[x][y]);
				}
				System.out.println();	
			}
		}
		catch(RuntimeException e) {
			errorMessage();
		}
		return newMatrix;
	}
	 
	
	public int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix){
		int[][] newMatrix = new int[firstMatrix.length][secondMatrix[0].length];
		return secondMatrix;
	}	
}




