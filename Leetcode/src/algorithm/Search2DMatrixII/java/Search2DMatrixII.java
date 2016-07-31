package algorithm.Search2DMatrixII.java;

public class Search2DMatrixII {
	public boolean searchMatrix(int[][] matrix, int target) {
		// matrix[n][m]
		int m = matrix[0].length - 1;
		int n = 0;

		while (m >= 0 && n <= matrix.length - 1) {
			if (target == matrix[n][m]) {
				return true;
			} else if (target < matrix[n][m]) {
				m--;
			} else if (target > matrix[n][m]) {
				n++;
			}
		}
		return false;
	}
}
