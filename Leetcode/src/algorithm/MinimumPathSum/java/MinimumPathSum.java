package algorithm.MinimumPathSum.java;

public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
		int row = grid.length;
		int column = grid[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 && j != 0) {
					grid[i][j] = grid[i][j] + grid[i][j - 1];
				} else if (i != 0 && j == 0) {
					grid[i][j] = grid[i][j] + grid[i - 1][j];
				} else if (i != 0 && j != 0) {
					grid[i][j] = Math.min(grid[i][j] + grid[i - 1][j], grid[i][j] + grid[i][j - 1]);
				}

			}
		}
		return grid[row - 1][column - 1];
	}
}
