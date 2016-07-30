package algorithm.Search2DMatrix.java;

public class Search2DMatrix {
	// Binary Search
	public boolean searchMatrix(int[][] matrix, int target) {
		int n = matrix.length;
		int m = matrix[0].length;
		int l = 0;
		int r = n * m - 1;
		while (l != r) {
			int mid = (l + r - 1) / 2;
			if (matrix[mid / m][mid % m] < target) {
				l = mid + 1;
			} else {
				r = mid;
			}
		}
		return matrix[r / m][r % m] == target;
	}
}
