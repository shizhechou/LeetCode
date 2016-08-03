package algorithm.RotateImage.java;

public class RotateImage {
	// [1,2,3]		[1,4,7]		[7,4,1]
	// [4,5,6]	=>	[2,5,8]	=>	[8,5,2]
	// [7,8,9] 		[3,6,9]		[9,6,3]
	public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
        	for(int j=i; j<matrix[0].length;j++){
        		int tmp = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = tmp;
        	}
        }
        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix.length/2;j++){
        		int tmp = matrix[i][j];
        		matrix[i][j] = matrix[i][matrix.length-1-j];
        		matrix[i][matrix.length-1-j] = tmp;
        		
        	}
        }
    }
}
