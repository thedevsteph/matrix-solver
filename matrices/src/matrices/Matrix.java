package matrices;

public class Matrix {
	
	
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
		}catch(Throwable error) {
			System.out.println("The dimensions of your matrices must be the same");
		}
	
	    return thirdMatrix;
	};
	
	
	
	
}




