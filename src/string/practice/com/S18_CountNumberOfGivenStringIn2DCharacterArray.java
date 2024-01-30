package string.practice.com;

public class S18_CountNumberOfGivenStringIn2DCharacterArray {
	static int ROW, COL;

	static boolean searchWord(char[][] grid, int row, int col, String word) {
		if (grid[row][col] != word.charAt(0)) {
			return false;
		}
		int len = word.length();
		if (col + len <= COL) {
			for (int i = 0; i < len; i++) {
				if (grid[row][col + i] != word.charAt(i)) {
					break;
				}
				if (i == len - 1) {
					return true;
				}
			}
		}
		if (col - len >= -1) {
			for (int i = 0; i < len; i++) {
				if (grid[row][col - i] != word.charAt(i)) {
					break;
				}
				if (i == len - 1) {
					return true;
				}
			}
		}
		if (row + len <= ROW) {
			for (int i = 0; i < len; i++) {
				if (grid[row + i][col] != word.charAt(i)) {
					break;
				}
				if (i == len - 1) {
					return true;
				}
			}
		}
		if (row - len >= -1) {
			for (int i = 0; i < len; i++) {
				if (grid[row - i][col] != word.charAt(i)) {
					break;
				}
				if (i == len - 1) {
					return true;
				}
			}
		}

		return false;
	}

	static int wordSearch(char[][] grid, String word) {
		ROW = grid.length;
		COL = grid[0].length;
		int count = 0;
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (searchWord(grid, i, j, word)) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		char[][] grid1 = { { 'B', 'B', 'M', 'B', 'B', 'B' },
				           { 'C', 'B', 'A', 'B', 'B', 'B' },
				           { 'I', 'B', 'G', 'B', 'B', 'B' }, 
				           { 'G', 'B', 'I', 'B', 'B', 'B' }, 
				           { 'A', 'B', 'C', 'B', 'B', 'B' },
				           { 'M', 'C', 'I', 'G', 'A', 'M' } };
		String word1 = "MAGIC";
		System.out.println("Output for Example 2: " + wordSearch(grid1, word1));

	}
}
