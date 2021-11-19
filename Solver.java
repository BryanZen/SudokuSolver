import java.util.Arrays;
import java.util.Scanner;

public class Solver {
	
	public static int[][][] board = {
			{{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}},
			{{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}},
			{{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}},
			{{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}},
			{{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}},
			{{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}},
			{{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}},
			{{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}},
			{{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}}
			
	};
	public static int [][][] matrix1 = {
			{board[0][0], board[0][1], board [0][2]},
			{board[1][0], board[1][1], board [1][2]},
			{board[2][0], board[2][1], board [2][2]}
	};
	public static int [][][] matrix2 = {
			{board[0][3], board[0][4], board [0][5]},
			{board[1][3], board[1][4], board [1][5]},
			{board[2][3], board[2][4], board [2][5]}
	};
	public static int [][][] matrix3 = {
			{board[0][6], board[0][7], board [0][8]},
			{board[1][6], board[1][7], board [1][8]},
			{board[2][6], board[2][7], board [2][8]}
	};
	public static int [][][] matrix4 = {
			{board[3][0], board[3][1], board [3][2]},
			{board[4][0], board[4][1], board [4][2]},
			{board[5][0], board[5][1], board [5][2]}
	};
	public static int [][][] matrix5 = {
			{board[3][3], board[3][4], board [3][5]},
			{board[4][3], board[4][4], board [4][5]},
			{board[5][3], board[5][4], board [5][5]}
	};
	public static int [][][] matrix6 = {
			{board[3][6], board[3][7], board [3][8]},
			{board[4][6], board[4][7], board [4][8]},
			{board[5][6], board[5][7], board [4][8]}
	};
	public static int [][][] matrix7 = {
			{board[6][0], board[6][1], board [6][2]},
			{board[7][0], board[7][1], board [7][2]},
			{board[8][0], board[8][1], board [8][2]}
	};
	public static int [][][] matrix8 = {
			{board[6][3], board[6][4], board [6][5]},
			{board[7][3], board[7][4], board [7][5]},
			{board[8][3], board[8][4], board [8][5]}
	};
	public static int [][][] matrix9 = {
			{board[6][6], board[6][7], board [6][8]},
			{board[7][6], board[7][7], board [7][8]},
			{board[8][6], board[8][7], board [8][8]}
	};
	public static int [][][] matrix11 = {
			{board[0][0], board[0][1], board [0][2], board[1][0], board[1][1], board [1][2], board[2][0], board[2][1], board [2][2]}
	};
	public static int [][][] matrix12 = {
			{board[0][3], board[0][4], board [0][5], board[1][3], board[1][4], board [1][5], board[2][3], board[2][4], board [2][5]}
	};
	public static int [][][] matrix13 = {
			{board[0][6], board[0][7], board [0][8], board[1][6], board[1][7], board [1][8], board[2][6], board[2][7], board [2][8]}
	};
	public static int [][][] matrix14 = {
			{board[3][0], board[3][1], board [3][2], board[4][0], board[4][1], board [4][2], board[5][0], board[5][1], board [5][2]}
	};
	public static int [][][] matrix15 = {
			{board[3][3], board[3][4], board [3][5], board[4][3], board[4][4], board [4][5], board[5][3], board[5][4], board [5][5]}
	};
	public static int [][][] matrix16 = {
			{board[3][6], board[3][7], board [3][8], board[4][6], board[4][7], board [4][8], board[5][6], board[5][7], board [4][8]}
	};
	public static int [][][] matrix17 = {
			{board[6][0], board[6][1], board [6][2], board[7][0], board[7][1], board [7][2], board[8][0], board[8][1], board [8][2]}
	};
	public static int [][][] matrix18 = {
			{board[6][3], board[6][4], board [6][5], board[7][3], board[7][4], board [7][5], board[8][3], board[8][4], board [8][5]}
	};
	public static int [][][] matrix19 = {
			{board[6][6], board[6][7], board [6][8], board[7][6], board[7][7], board [7][8], board[8][6], board[8][7], board [8][8]}
	};
	public static int [][][] row1 = {
			{board[0][0], board[0][1], board[0][2], board[0][3], board[0][4], board[0][5], board[0][6], board[0][7], board[0][8]}
	};
	public static int [][][] row2 = {
			{board[1][0], board[1][1], board[1][2], board[1][3], board[1][4], board[1][5], board[1][6], board[1][7], board[1][8]}
	};
	public static int [][][] row3 = {
			{board[2][0], board[2][1], board[2][2], board[2][3], board[2][4], board[2][5], board[2][6], board[2][7], board[2][8]}
	};
	public static int [][][] row4 = {
			{board[3][0], board[3][1], board[3][2], board[3][3], board[3][4], board[3][5], board[3][6], board[3][7], board[3][8]}
	};
	public static int [][][] row5 = {
			{board[4][0], board[4][1], board[4][2], board[4][3], board[4][4], board[4][5], board[4][6], board[4][7], board[4][8]}
	};
	public static int [][][] row6 = {
			{board[5][0], board[5][1], board[5][2], board[5][3], board[5][4], board[5][5], board[5][6], board[5][7], board[5][8]}
	};
	public static int [][][] row7 = {
			{board[6][0], board[6][1], board[6][2], board[6][3], board[6][4], board[6][5], board[6][6], board[6][7], board[6][8]}
	};
	public static int [][][] row8 = {
			{board[7][0], board[7][1], board[7][2], board[7][3], board[7][4], board[7][5], board[7][6], board[7][7], board[7][8]}
	};
	public static int [][][] row9 = {
			{board[8][0], board[8][1], board[8][2], board[8][3], board[8][4], board[8][5], board[8][6], board[8][7], board[8][8]}
	};
	public static int [][][] column1 = {
			{board[0][0], board[1][0], board[2][0], board[3][0], board[4][0], board[5][0], board[6][0], board[7][0], board[8][0]}
	};
	public static int [][][] column2 = {
			{board[0][1], board[1][1], board[2][1], board[3][1], board[4][1], board[5][1], board[6][1], board[7][1], board[8][1]}
	};
	public static int [][][] column3 = {
			{board[0][2], board[1][2], board[2][2], board[3][2], board[4][2], board[5][2], board[6][2], board[7][2], board[8][2]}
	};
	public static int [][][] column4 = {
			{board[0][3], board[1][3], board[2][3], board[3][3], board[4][3], board[5][3], board[6][3], board[7][3], board[8][3]}
	};
	public static int [][][] column5 = {
			{board[0][4], board[1][4], board[2][4], board[3][4], board[4][4], board[5][4], board[6][4], board[7][4], board[8][4]}
	};
	public static int [][][] column6 = {
			{board[0][5], board[1][5], board[2][5], board[3][5], board[4][5], board[5][5], board[6][5], board[7][5], board[8][5]}
	};
	public static int [][][] column7 = {
			{board[0][6], board[1][6], board[2][6], board[3][6], board[4][6], board[5][6], board[6][6], board[7][6], board[8][6]}
	};
	public static int [][][] column8 = {
			{board[0][7], board[1][7], board[2][7], board[3][7], board[4][7], board[5][7], board[6][7], board[7][7], board[8][7]}
	};
	public static int [][][] column9 = {
			{board[0][8], board[1][8], board[2][8], board[3][8], board[4][8], board[5][8], board[6][8], board[7][8], board[8][8]}
	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value 81 values: ");
		String in = sc.nextLine();
		int length = in.length();
		char[] valueChar = new char[length];
		for (int i = 0; i < length; i++) {
			int j = i + 1;
			valueChar[i] = in.charAt(i);
			int value = (Integer.valueOf(valueChar[i])) - 48;
			if (value == 1 || value == 2 || value == 3 || value == 4 || value == 5 || value == 6 || value == 7 || value == 8 || value == 9) {
				if (j > 0 && j < 10)
					setValue(1, j, value);
				if (j > 9 && j < 19)
					setValue(2, j - 9, value);
				if (j > 18 && j < 28)
					setValue(3, j - 18, value);
				if (j > 27 && j < 37)
					setValue(4, j - 27, value);
				if (j > 36 && j < 46)
					setValue(5, j - 36, value);
				if (j > 45 && j < 55)
					setValue(6, j - 45, value);
				if (j > 54 && j < 64)
					setValue(7, j - 54, value);
				if (j > 63 && j < 73)
					setValue(8, j - 63, value);
				if (j > 72 && j < 82)
					setValue(9, j - 72, value);
			}//913007000087005302000600100002008704000000005000760009005000920726000800000200400
		}
		//complete() == false || 
		int n = 0;
		while (n < 5) {
			rowChecker();
			columnChecker();
			matrixChecker();
			printBoard();
			n++;
		}
		printBoard();
		finalBoard();
		sc.close();
	}
	public static void printBoard() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j]!= null && j != 8)
					System.out.print(Arrays.toString(board[i][j]) + " ");
				else if (board[i][j] != null && j == 8)
					System.out.print(Arrays.toString(board[i][j]) + "\n");
				else if (board[i][j] == null)
					System.out.print("Error");
			}
		}
	}
	public static void setValue(int a, int b, int c) {
		board[a - 1][b - 1][0] = c;
		for (int i = 1; i < 9; i++) {
			board[a - 1][b - 1][i] = -1;
		}
		crossOut();
			
	}
	public static void single() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int zero = 0;
				for (int k = 0; k < 9; k++) {
					if (board[i][j][k] == 0) {
						zero++;
					}
				}
				if (zero == 8) {
					for (int l = 0; l < 9; l++) {
						if (board[i][j][l] != 0 && board[i][j][l] != -1) {
							int x = board[i][j][l];
							board[i][j][0] = x;
							for (int m = 1; m < 9; m++) {
								board[i][j][m] = -1;
							}
						}
					}	
				}
			}
		}
	}
	public static void crossOut() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j][1] == -1) {
					int x = board[i][j][0];
					for (int k = 0; k < 9; k++) {
						if (board[i][k][1] != -1 && board[i][k][x - 1] != 0)
							board[i][k][x - 1] = 0;
					}
					for (int l = 0; l < 9; l++) {
						if (board[l][j][1] != -1 && board[l][j][x - 1] != 0)
							board[l][j][x - 1] = 0;
					}
					if (i % 3 == 0 && j % 3 == 0) {
						if (board[i + 1][j + 1][1] != -1 && board[i + 1][j + 1][x - 1] != 0)
							board[i + 1][j + 1][x - 1] = 0;
						if (board[i + 1][j + 2][1] != -1 && board[i + 1][j + 2][x - 1] != 0)
							board[i + 1][j + 2][x - 1] = 0;
						if (board[i + 2][j + 1][1] != -1 && board[i + 2][j + 1][x - 1] != 0)
							board[i + 2][j + 1][x - 1] = 0;
						if (board[i + 2][j + 2][1] != -1 && board[i + 2][j + 2][x - 1] != 0)
							board[i + 2][j + 2][x - 1] = 0;
					}
					if (i % 3 == 0 && j % 3 == 1) {
						if (board[i + 1][j - 1][1] != -1 && board[i + 1][j - 1][x - 1] != 0)
							board[i + 1][j - 1][x - 1] = 0;
						if (board[i + 2][j - 1][1] != -1 && board[i + 2][j - 1][x - 1] != 0)
							board[i + 2][j - 1][x - 1] = 0;
						if (board[i + 1][j + 1][1] != -1 && board[i + 1][j + 1][x - 1] != 0)
							board[i + 1][j + 1][x - 1] = 0;
						if (board[i + 2][j + 1][1] != -1 && board[i + 2][j + 1][x - 1] != 0)
							board[i + 2][j + 1][x - 1] = 0;
					}
					if (i % 3 == 0 && j % 3 == 2) {
						if (board[i + 1][j - 2][1] != -1 && board[i + 1][j - 2][x - 1] != 0)
							board[i + 1][j - 2][x - 1] = 0;
						if (board[i + 1][j - 1][1] != -1 && board[i + 1][j - 1][x - 1] != 0)
							board[i + 1][j - 1][x - 1] = 0;
						if (board[i + 2][j - 2][1] != -1 && board[i + 2][j - 2][x - 1] != 0)
							board[i + 2][j - 2][x - 1] = 0;
						if (board[i + 2][j - 1][1] != -1 && board[i + 2][j - 1][x - 1] != 0)
							board[i + 2][j - 1][x - 1] = 0;
					}
					if (i % 3 == 1 && j % 3 == 0) {
						if (board[i - 1][j + 1][1] != -1 && board[i - 1][j + 1][x - 1] != 0)
							board[i - 1][j + 1][x - 1] = 0;
						if (board[i - 1][j + 2][1] != -1 && board[i - 1][j + 2][x - 1] != 0)
							board[i - 1][j + 2][x - 1] = 0;
						if (board[i + 1][j + 1][1] != -1 && board[i + 1][j + 1][x - 1] != 0)
							board[i + 1][j + 1][x - 1] = 0;
						if (board[i + 1][j + 2][1] != -1 && board[i + 1][j + 2][x - 1] != 0)
							board[i + 1][j + 2][x - 1] = 0;
					}
					if (i % 3 == 1 && j % 3 == 1) {
						if (board[i - 1][j - 1][1] != -1 && board[i - 1][j - 1][x - 1] != 0)
							board[i - 1][j - 1][x - 1] = 0;
						if (board[i - 1][j + 1][1] != -1 && board[i - 1][j + 1][x - 1] != 0)
							board[i - 1][j + 1][x - 1] = 0;
						if (board[i + 1][j - 1][1] != -1 && board[i + 1][j - 1][x - 1] != 0)
							board[i + 1][j - 1][x - 1] = 0;
						if (board[i + 1][j + 1][1] != -1 && board[i + 1][j + 1][x - 1] != 0)
							board[i + 1][j + 1][x - 1] = 0;
					}
					if (i % 3 == 1 && j % 3 == 2) {
						if (board[i - 1][j - 2][1] != -1 && board[i - 1][j - 2][x - 1] != 0)
							board[i - 1][j - 2][x - 1] = 0;
						if (board[i - 1][j - 1][1] != -1 && board[i - 1][j - 1][x - 1] != 0)
							board[i - 1][j - 1][x - 1] = 0;
						if (board[i + 1][j - 2][1] != -1 && board[i + 1][j - 2][x - 1] != 0)
							board[i + 1][j - 2][x - 1] = 0;
						if (board[i + 1][j - 1][1] != -1 && board[i + 1][j - 1][x - 1] != 0)
							board[i + 1][j - 1][x - 1] = 0;
					}
					if (i % 3 == 2 && j % 3 == 0) {
						if (board[i - 2][j + 1][1] != -1 && board[i - 2][j + 1][x - 1] != 0)
							board[i - 2][j + 1][x - 1] = 0;
						if (board[i - 2][j + 2][1] != -1 && board[i - 2][j + 2][x - 1] != 0)
							board[i - 2][j + 2][x - 1] = 0;
						if (board[i - 1][j + 1][1] != -1 && board[i - 1][j + 1][x - 1] != 0)
							board[i - 1][j + 1][x - 1] = 0;
						if (board[i - 1][j + 2][1] != -1 && board[i - 1][j + 2][x - 1] != 0)
							board[i - 1][j + 2][x - 1] = 0;
					}
					if (i % 3 == 2 && j % 3 == 1) {
						if (board[i - 2][j - 1][1] != -1 && board[i - 2][j - 1][x - 1] != 0)
							board[i - 2][j - 1][x - 1] = 0;
						if (board[i - 1][j - 1][1] != -1 && board[i - 1][j - 1][x - 1] != 0)
							board[i - 1][j - 1][x - 1] = 0;
						if (board[i - 2][j + 1][1] != -1 && board[i - 2][j + 1][x - 1] != 0)
							board[i - 2][j + 1][x - 1] = 0;
						if (board[i - 1][j + 1][1] != -1 && board[i - 1][j + 1][x - 1] != 0)
							board[i - 1][j + 1][x - 1] = 0;
					}
					if (i % 3 == 2 && j % 3 == 2) {
						if (board[i - 2][j - 2][1] != -1 && board[i - 2][j - 2][x - 1] != 0)
							board[i - 2][j - 2][x - 1] = 0;
						if (board[i - 2][j - 1][1] != -1 && board[i - 2][j - 1][x - 1] != 0)
							board[i - 2][j - 1][x - 1] = 0;
						if (board[i - 1][j - 2][1] != -1 && board[i - 1][j - 2][x - 1] != 0)
							board[i - 1][j - 2][x - 1] = 0;
						if (board[i - 1][j - 1][1] != -1 && board[i - 1][j - 1][x - 1] != 0)
							board[i - 1][j - 1][x - 1] = 0;
					}
				}
			}
		}
		single();
	}
	public static void finalBoard() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j][1] == -1) {
					if (j != 8)
						System.out.print((board[i][j][0]) + " ");
					if (j == 8)
						System.out.print((board[i][j][0]) + "\n");
				} else {
					if (j != 8) {
						System.out.print(0 + " ");
					}
					if (j == 8)
						System.out.print(0 + "\n");
				}
			}
		}
	}
	public static boolean complete() {
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0, countFilled = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < 1; k++) {
					if (board[i][j][1] == -1) {
						countFilled++;
						if (board[i][j][0] == 1) {
							count1++;
							if (countFilled == 81) {
								if (count1 > 9 || count1 < 9) {
									return false;
								}
							}
						}
						if (board[i][j][0] == 2) {
							count2++;
							if (countFilled == 81) {
								if (count2 > 9 || count2 < 9) {
									return false;
								}
							}
						}
						if (board[i][j][0] == 3) {
							count3++;
							if (countFilled == 81) {
								if (count3 > 9 || count3 < 9) {
									return false;
								}
							}
						}
						if (board[i][j][0] == 4) {
							count4++;
							if (countFilled == 81) {
								if (count4 > 9 || count4 < 9) {
									return false;
								}
							}
						}
						if (board[i][j][0] == 5) {
							count5++;
							if (countFilled == 81) {
								if (count5 > 9 || count5 < 9) {
									return false;
								}
							}
						}
						if (board[i][j][0] == 6) {
							count6++;
							if (countFilled == 81) {
								if (count6 > 9 || count6 < 9) {
									return false;
								}
							}
						}
						if (board[i][j][0] == 7) {
							count7++;
							if (countFilled == 81) {
								if (count7 > 9 || count7 < 9) {
									return false;
								}
							}
						}
						if (board[i][j][0] == 8) {
							count8++;
							if (countFilled == 81) {
								if (count8 > 9 || count8 < 9) {
									return false;
								}
							}
						}
						if (board[i][j][0] == 9) {
							count9++;
							if (countFilled == 81) {
								if (count9 > 9 || count9 < 9) {
									return false;
								}
							}
						}
						if (count1 == 9 && count2 == 9 && count3 == 9 
								&& count4 == 9 && count5 == 9 && count6 == 9 
								&& count7 == 9 && count8 == 9 && count9 == 9 && countFilled == 81) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	public static void rowChecker() {
		crossOut();
		int count11 = 0, count12 = 0, count13 = 0, 
				count14 = 0, count15 = 0, count16 = 0, 
				count17 = 0, count18 = 0, count19 = 0,
				count21 = 0, count22 = 0, count23 = 0, 
				count24 = 0, count25 = 0, count26 = 0, 
				count27 = 0, count28 = 0, count29 = 0,
				count31 = 0, count32 = 0, count33 = 0, 
				count34 = 0, count35 = 0, count36 = 0, 
				count37 = 0, count38 = 0, count39 = 0,
				count41 = 0, count42 = 0, count43 = 0, 
				count44 = 0, count45 = 0, count46 = 0, 
				count47 = 0, count48 = 0, count49 = 0,
				count51 = 0, count52 = 0, count53 = 0, 
				count54 = 0, count55 = 0, count56 = 0, 
				count57 = 0, count58 = 0, count59 = 0,
				count61 = 0, count62 = 0, count63 = 0, 
				count64 = 0, count65 = 0, count66 = 0, 
				count67 = 0, count68 = 0, count69 = 0,
				count71 = 0, count72 = 0, count73 = 0, 
				count74 = 0, count75 = 0, count76 = 0, 
				count77 = 0, count78 = 0, count79 = 0,
				count81 = 0, count82 = 0, count83 = 0, 
				count84 = 0, count85 = 0, count86 = 0, 
				count87 = 0, count88 = 0, count89 = 0,
				count91 = 0, count92 = 0, count93 = 0, 
				count94 = 0, count95 = 0, count96 = 0, 
				count97 = 0, count98 = 0, count99 = 0;
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (row1[0][j][k] == 1 && row1[0][j][1] != -1) {
					count11++;
				} else if (row1[0][j][1] == -1) {
					count11 = 2;
				}
				if (row1[0][j][k] == 2 && row1[0][j][1] != -1) {
					count12++;
				} else if (row1[0][j][1] == -1) {
					count12 = 2;
				}
				if (row1[0][j][k] == 3 && row1[0][j][1] != -1) {
					count13++;
				} else if (row1[0][j][1] == -1) {
					count13 = 2;
				}
				if (row1[0][j][k] == 4 && row1[0][j][1] != -1) { 
					count14++;
				} else if (row1[0][j][1] == -1) {
					count14 = 2;
				}
				if (row1[0][j][k] == 5 && row1[0][j][1] != -1) {
					count15++;
				} else if (row1[0][j][1] == -1) {
					count15 = 2;
				}
				if (row1[0][j][k] == 6 && row1[0][j][1] != -1) {
					count16++;
				} else if (row1[0][j][1] == -1) {
					count16 = 2;
				}
				if (row1[0][j][k] == 7 && row1[0][j][1] != -1) {
					count17++;
				} else if (row1[0][j][1] == -1) {
					count17 = 2;
				}
				if (row1[0][j][k] == 8 && row1[0][j][1] != -1) {
					count18++;
				} else if (row1[0][j][1] == -1) {
					count18 = 2;
				}
				if (row1[0][j][k] == 9 && row1[0][j][1] != -1) {
					count19++;
				} else if (row1[0][j][1] == -1) {
					count19 = 2;
				}
			}
		}
		if (count11 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row1[0][j][0] == 1 && row1[0][j][1] != -1) {
					row1[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						row1[0][j][o] = -1;
					}
				}
			}
		}
		if (count12 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row1[0][j][1] == 2 && row1[0][j][1] != -1) {
					row1[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						row1[0][j][o] = -1;
					}
				}
			}
		}
		if (count13 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row1[0][j][2] == 3 && row1[0][j][1] != -1) {
					row1[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						row1[0][j][o] = -1;
					}
				}
			}
		}
		if (count14 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row1[0][j][3] == 4 && row1[0][j][1] != -1) {
					row1[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						row1[0][j][o] = -1;
					}
				}
			}
		}
		if (count15 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row1[0][j][4] == 5 && row1[0][j][1] != -1) {
					row1[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						row1[0][j][o] = -1;
					}
				}
			}
		}
		if (count16 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row1[0][j][5] == 6 && row1[0][j][1] != -1) {
					row1[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						row1[0][j][o] = -1;
					}
				}
			}
		}
		if (count17 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row1[0][j][6] == 7 && row1[0][j][1] != -1) {
					row1[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						row1[0][j][o] = -1;
					}
				}
			}
		}
		if (count18 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row1[0][j][7] == 8 && row1[0][j][1] != -1) {
					row1[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						row1[0][j][o] = -1;
					}
				}
			}
		}
		if (count19 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row1[0][j][8] == 9 && row1[0][j][1] != -1) {
					row1[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						row1[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (row2[0][j][k] == 1 && row2[0][j][1] != -1) {
					count21++;
				} else if (row2[0][j][1] == -1) {
					count21 = 2;
				}
				if (row2[0][j][k] == 2 && row2[0][j][1] != -1) {
					count22++;
				} else if (row2[0][j][1] == -1) {
					count22 = 2;
				}
				if (row2[0][j][k] == 3 && row2[0][j][1] != -1) {
					count23++;
				} else if (row2[0][j][1] == -1) {
					count23 = 2;
				}
				if (row2[0][j][k] == 4 && row2[0][j][1] != -1) { 
					count24++;
				} else if (row2[0][j][1] == -1) {
					count24 = 2;
				}
				if (row2[0][j][k] == 5 && row2[0][j][1] != -1) {
					count25++;
				} else if (row2[0][j][1] == -1) {
					count25 = 2;
				}
				if (row2[0][j][k] == 6 && row2[0][j][1] != -1) {
					count26++;
				} else if (row2[0][j][1] == -1) {
					count26 = 2;
				}
				if (row2[0][j][k] == 7 && row2[0][j][1] != -1) {
					count27++;
				} else if (row2[0][j][1] == -1) {
					count27 = 2;
				}
				if (row2[0][j][k] == 8 && row2[0][j][1] != -1) {
					count28++;
				} else if (row2[0][j][1] == -1) {
					count28 = 2;
				}
				if (row2[0][j][k] == 9 && row2[0][j][1] != -1) {
					count29++;
				} else if (row2[0][j][1] == -1) {
					count29 = 2;
				}
			}
		}
		if (count21 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row2[0][j][0] == 1 && row2[0][j][1] != -1) {
					row2[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						row2[0][j][o] = -1;
					}
				}
			}
		}
		if (count22 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row2[0][j][1] == 2 && row2[0][j][1] != -1) {
					row2[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						row2[0][j][o] = -1;
					}
				}
			}
		}
		if (count23 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row2[0][j][2] == 3 && row2[0][j][1] != -1) {
					row2[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						row2[0][j][o] = -1;
					}
				}
			}
		}
		if (count24 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row2[0][j][3] == 4 && row2[0][j][1] != -1) {
					row2[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						row2[0][j][o] = -1;
					}
				}
			}
		}
		if (count25 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row2[0][j][4] == 5 && row2[0][j][1] != -1) {
					row2[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						row2[0][j][o] = -1;
					}
				}
			}
		}
		if (count26 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row2[0][j][5] == 6 && row2[0][j][1] != -1) {
					row2[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						row2[0][j][o] = -1;
					}
				}
			}
		}
		if (count27 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row2[0][j][6] == 7 && row2[0][j][1] != -1) {
					row2[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						row2[0][j][o] = -1;
					}
				}
			}
		}
		if (count28 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row2[0][j][7] == 8 && row2[0][j][1] != -1) {
					row2[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						row2[0][j][o] = -1;
					}
				}
			}
		}
		if (count29 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row2[0][j][8] == 9 && row2[0][j][1] != -1) {
					row2[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						row2[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (row3[0][j][k] == 1 && row3[0][j][1] != -1) {
					count31++;
				} else if (row3[0][j][1] == -1) {
					count31 = 2;
				}
				if (row3[0][j][k] == 2 && row3[0][j][1] != -1) {
					count32++;
				} else if (row3[0][j][1] == -1) {
					count32 = 2;
				}
				if (row3[0][j][k] == 3 && row3[0][j][1] != -1) {
					count33++;
				} else if (row3[0][j][1] == -1) {
					count33 = 2;
				}
				if (row3[0][j][k] == 4 && row3[0][j][1] != -1) { 
					count34++;
				} else if (row3[0][j][1] == -1) {
					count34 = 2;
				}
				if (row3[0][j][k] == 5 && row3[0][j][1] != -1) {
					count35++;
				} else if (row3[0][j][1] == -1) {
					count35 = 2;
				}
				if (row3[0][j][k] == 6 && row3[0][j][1] != -1) {
					count36++;
				} else if (row3[0][j][1] == -1) {
					count36 = 2;
				}
				if (row3[0][j][k] == 7 && row3[0][j][1] != -1) {
					count37++;
				} else if (row3[0][j][1] == -1) {
					count37 = 2;
				}
				if (row3[0][j][k] == 8 && row3[0][j][1] != -1) {
					count38++;
				} else if (row3[0][j][1] == -1) {
					count38 = 2;
				}
				if (row3[0][j][k] == 9 && row3[0][j][1] != -1) {
					count39++;
				} else if (row3[0][j][1] == -1) {
					count39 = 2;
				}
			}
		}
		if (count31 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row3[0][j][0] == 1 && row3[0][j][1] != -1) {
					row3[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						row3[0][j][o] = -1;
					}
				}
			}
		}
		if (count32 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row3[0][j][1] == 2 && row3[0][j][1] != -1) {
					row3[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						row3[0][j][o] = -1;
					}
				}
			}
		}
		if (count33 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row3[0][j][2] == 3 && row3[0][j][1] != -1) {
					row3[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						row3[0][j][o] = -1;
					}
				}
			}
		}
		if (count34 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row3[0][j][3] == 4 && row3[0][j][1] != -1) {
					row3[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						row3[0][j][o] = -1;
					}
				}
			}
		}
		if (count35 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row3[0][j][4] == 5 && row3[0][j][1] != -1) {
					row3[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						row3[0][j][o] = -1;
					}
				}
			}
		}
		if (count36 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row3[0][j][5] == 6 && row3[0][j][1] != -1) {
					row3[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						row3[0][j][o] = -1;
					}
				}
			}
		}
		if (count37 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row3[0][j][6] == 7 && row3[0][j][1] != -1) {
					row3[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						row3[0][j][o] = -1;
					}
				}
			}
		}
		if (count38 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row3[0][j][7] == 8 && row3[0][j][1] != -1) {
					row3[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						row3[0][j][o] = -1;
					}
				}
			}
		}
		if (count39 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row3[0][j][8] == 9 && row3[0][j][1] != -1) {
					row3[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						row3[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (row4[0][j][k] == 1 && row4[0][j][1] != -1) {
					count41++;
				} else if (row4[0][j][1] == -1) {
					count41 = 2;
				}
				if (row4[0][j][k] == 2 && row4[0][j][1] != -1) {
					count42++;
				} else if (row4[0][j][1] == -1) {
					count42 = 2;
				}
				if (row4[0][j][k] == 3 && row4[0][j][1] != -1) {
					count43++;
				} else if (row4[0][j][1] == -1) {
					count43 = 2;
				}
				if (row4[0][j][k] == 4 && row4[0][j][1] != -1) { 
					count44++;
				} else if (row4[0][j][1] == -1) {
					count44 = 2;
				}
				if (row4[0][j][k] == 5 && row4[0][j][1] != -1) {
					count45++;
				} else if (row4[0][j][1] == -1) {
					count45 = 2;
				}
				if (row4[0][j][k] == 6 && row4[0][j][1] != -1) {
					count46++;
				} else if (row4[0][j][1] == -1) {
					count46 = 2;
				}
				if (row4[0][j][k] == 7 && row4[0][j][1] != -1) {
					count47++;
				} else if (row4[0][j][1] == -1) {
					count47 = 2;
				}
				if (row4[0][j][k] == 8 && row4[0][j][1] != -1) {
					count48++;
				} else if (row4[0][j][1] == -1) {
					count48 = 2;
				}
				if (row4[0][j][k] == 9 && row4[0][j][1] != -1) {
					count49++;
				} else if (row4[0][j][1] == -1) {
					count49 = 2;
				}
			}
		}
		if (count41 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row4[0][j][0] == 1 && row4[0][j][1] != -1) {
					row4[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						row4[0][j][o] = -1;
					}
				}
			}
		}
		if (count42 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row4[0][j][1] == 2 && row4[0][j][1] != -1) {
					row4[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						row4[0][j][o] = -1;
					}
				}
			}
		}
		if (count43 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row4[0][j][2] == 3 && row4[0][j][1] != -1) {
					row4[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						row4[0][j][o] = -1;
					}
				}
			}
		}
		if (count44 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row4[0][j][3] == 4 && row4[0][j][1] != -1) {
					row4[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						row4[0][j][o] = -1;
					}
				}
			}
		}
		if (count45 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row4[0][j][4] == 5 && row4[0][j][1] != -1) {
					row4[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						row4[0][j][o] = -1;
					}
				}
			}
		}
		if (count46 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row4[0][j][5] == 6 && row4[0][j][1] != -1) {
					row4[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						row4[0][j][o] = -1;
					}
				}
			}
		}
		if (count47 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row4[0][j][6] == 7 && row4[0][j][1] != -1) {
					row4[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						row4[0][j][o] = -1;
					}
				}
			}
		}
		if (count48 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row4[0][j][7] == 8 && row4[0][j][1] != -1) {
					row4[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						row4[0][j][o] = -1;
					}
				}
			}
		}
		if (count49 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row4[0][j][8] == 9 && row4[0][j][1] != -1) {
					row4[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						row4[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (row5[0][j][k] == 1 && row5[0][j][1] != -1) {
					count51++;
				} else if (row5[0][j][1] == -1) {
					count51 = 2;
				}
				if (row5[0][j][k] == 2 && row5[0][j][1] != -1) {
					count52++;
				} else if (row5[0][j][1] == -1) {
					count52 = 2;
				}
				if (row5[0][j][k] == 3 && row5[0][j][1] != -1) {
					count53++;
				} else if (row5[0][j][1] == -1) {
					count53 = 2;
				}
				if (row5[0][j][k] == 4 && row5[0][j][1] != -1) { 
					count54++;
				} else if (row5[0][j][1] == -1) {
					count54 = 2;
				}
				if (row5[0][j][k] == 5 && row5[0][j][1] != -1) {
					count55++;
				} else if (row5[0][j][1] == -1) {
					count55 = 2;
				}
				if (row5[0][j][k] == 6 && row5[0][j][1] != -1) {
					count56++;
				} else if (row5[0][j][1] == -1) {
					count56 = 2;
				}
				if (row5[0][j][k] == 7 && row5[0][j][1] != -1) {
					count57++;
				} else if (row5[0][j][1] == -1) {
					count57 = 2;
				}
				if (row5[0][j][k] == 8 && row5[0][j][1] != -1) {
					count58++;
				} else if (row5[0][j][1] == -1) {
					count58 = 2;
				}
				if (row5[0][j][k] == 9 && row5[0][j][1] != -1) {
					count59++;
				} else if (row5[0][j][1] == -1) {
					count59 = 2;
				}
			}
		}
		if (count51 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row5[0][j][0] == 1 && row5[0][j][1] != -1) {
					row5[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						row5[0][j][o] = -1;
					}
				}
			}
		}
		if (count52 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row5[0][j][1] == 2 && row5[0][j][1] != -1) {
					row5[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						row5[0][j][o] = -1;
					}
				}
			}
		}
		if (count53 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row5[0][j][2] == 3 && row5[0][j][1] != -1) {
					row5[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						row5[0][j][o] = -1;
					}
				}
			}
		}
		if (count54 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row5[0][j][3] == 4 && row5[0][j][1] != -1) {
					row5[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						row5[0][j][o] = -1;
					}
				}
			}
		}
		if (count55 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row5[0][j][4] == 5 && row5[0][j][1] != -1) {
					row5[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						row5[0][j][o] = -1;
					}
				}
			}
		}
		if (count56 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row5[0][j][5] == 6 && row5[0][j][1] != -1) {
					row5[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						row5[0][j][o] = -1;
					}
				}
			}
		}
		if (count57 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row5[0][j][6] == 7 && row5[0][j][1] != -1) {
					row5[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						row5[0][j][o] = -1;
					}
				}
			}
		}
		if (count58 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row5[0][j][7] == 8 && row5[0][j][1] != -1) {
					row5[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						row5[0][j][o] = -1;
					}
				}
			}
		}
		if (count59 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row5[0][j][8] == 9 && row5[0][j][1] != -1) {
					row5[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						row5[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (row6[0][j][k] == 1 && row6[0][j][1] != -1) {
					count61++;
				} else if (row6[0][j][1] == -1) {
					count61 = 2;
				}
				if (row6[0][j][k] == 2 && row6[0][j][1] != -1) {
					count62++;
				} else if (row6[0][j][1] == -1) {
					count62 = 2;
				}
				if (row6[0][j][k] == 3 && row6[0][j][1] != -1) {
					count63++;
				} else if (row6[0][j][1] == -1) {
					count63 = 2;
				}
				if (row6[0][j][k] == 4 && row6[0][j][1] != -1) { 
					count64++;
				} else if (row6[0][j][1] == -1) {
					count64 = 2;
				}
				if (row6[0][j][k] == 5 && row6[0][j][1] != -1) {
					count65++;
				} else if (row6[0][j][1] == -1) {
					count65 = 2;
				}
				if (row6[0][j][k] == 6 && row6[0][j][1] != -1) {
					count66++;
				} else if (row6[0][j][1] == -1) {
					count66 = 2;
				}
				if (row6[0][j][k] == 7 && row6[0][j][1] != -1) {
					count67++;
				} else if (row6[0][j][1] == -1) {
					count67 = 2;
				}
				if (row6[0][j][k] == 8 && row6[0][j][1] != -1) {
					count68++;
				} else if (row6[0][j][1] == -1) {
					count68 = 2;
				}
				if (row6[0][j][k] == 9 && row6[0][j][1] != -1) {
					count69++;
				} else if (row6[0][j][1] == -1) {
					count69 = 2;
				}
			}
		}
		if (count61 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row6[0][j][0] == 1 && row6[0][j][1] != -1) {
					row6[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						row6[0][j][o] = -1;
					}
				}
			}
		}
		if (count62 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row6[0][j][1] == 2 && row6[0][j][1] != -1) {
					row6[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						row6[0][j][o] = -1;
					}
				}
			}
		}
		if (count63 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row6[0][j][2] == 3 && row6[0][j][1] != -1) {
					row6[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						row6[0][j][o] = -1;
					}
				}
			}
		}
		if (count64 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row6[0][j][3] == 4 && row6[0][j][1] != -1) {
					row6[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						row6[0][j][o] = -1;
					}
				}
			}
		}
		if (count65 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row6[0][j][4] == 5 && row6[0][j][1] != -1) {
					row6[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						row6[0][j][o] = -1;
					}
				}
			}
		}
		if (count66 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row6[0][j][5] == 6 && row6[0][j][1] != -1) {
					row6[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						row6[0][j][o] = -1;
					}
				}
			}
		}
		if (count67 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row6[0][j][6] == 7 && row6[0][j][1] != -1) {
					row6[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						row6[0][j][o] = -1;
					}
				}
			}
		}
		if (count68 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row6[0][j][7] == 8 && row6[0][j][1] != -1) {
					row6[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						row6[0][j][o] = -1;
					}
				}
			}
		}
		if (count69 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row6[0][j][8] == 9 && row6[0][j][1] != -1) {
					row6[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						row6[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (row7[0][j][k] == 1 && row7[0][j][1] != -1) {
					count71++;
				} else if (row7[0][j][1] == -1) {
					count71 = 2;
				}
				if (row7[0][j][k] == 2 && row7[0][j][1] != -1) {
					count72++;
				} else if (row7[0][j][1] == -1) {
					count72 = 2;
				}
				if (row7[0][j][k] == 3 && row7[0][j][1] != -1) {
					count73++;
				} else if (row7[0][j][1] == -1) {
					count73 = 2;
				}
				if (row7[0][j][k] == 4 && row7[0][j][1] != -1) { 
					count74++;
				} else if (row7[0][j][1] == -1) {
					count74 = 2;
				}
				if (row7[0][j][k] == 5 && row7[0][j][1] != -1) {
					count75++;
				} else if (row7[0][j][1] == -1) {
					count75 = 2;
				}
				if (row7[0][j][k] == 6 && row7[0][j][1] != -1) {
					count76++;
				} else if (row7[0][j][1] == -1) {
					count76 = 2;
				}
				if (row7[0][j][k] == 7 && row7[0][j][1] != -1) {
					count77++;
				} else if (row7[0][j][1] == -1) {
					count77 = 2;
				}
				if (row7[0][j][k] == 8 && row7[0][j][1] != -1) {
					count78++;
				} else if (row7[0][j][1] == -1) {
					count78 = 2;
				}
				if (row7[0][j][k] == 9 && row7[0][j][1] != -1) {
					count79++;
				} else if (row7[0][j][1] == -1) {
					count79 = 2;
				}
			}
		}
		if (count71 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row7[0][j][0] == 1 && row7[0][j][1] != -1) {
					row7[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						row7[0][j][o] = -1;
					}
				}
			}
		}
		if (count72 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row7[0][j][1] == 2 && row7[0][j][1] != -1) {
					row7[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						row7[0][j][o] = -1;
					}
				}
			}
		}
		if (count73 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row7[0][j][2] == 3 && row7[0][j][1] != -1) {
					row7[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						row7[0][j][o] = -1;
					}
				}
			}
		}
		if (count74 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row7[0][j][3] == 4 && row7[0][j][1] != -1) {
					row7[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						row7[0][j][o] = -1;
					}
				}
			}
		}
		if (count75 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row7[0][j][4] == 5 && row7[0][j][1] != -1) {
					row7[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						row7[0][j][o] = -1;
					}
				}
			}
		}
		if (count76 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row7[0][j][5] == 6 && row7[0][j][1] != -1) {
					row7[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						row7[0][j][o] = -1;
					}
				}
			}
		}
		if (count77 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row7[0][j][6] == 7 && row7[0][j][1] != -1) {
					row7[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						row7[0][j][o] = -1;
					}
				}
			}
		}
		if (count78 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row7[0][j][7] == 8 && row7[0][j][1] != -1) {
					row7[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						row7[0][j][o] = -1;
					}
				}
			}
		}
		if (count79 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row7[0][j][8] == 9 && row7[0][j][1] != -1) {
					row7[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						row7[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (row8[0][j][k] == 1 && row8[0][j][1] != -1) {
					count81++;
				} else if (row8[0][j][1] == -1) {
					count81 = 2;
				}
				if (row8[0][j][k] == 2 && row8[0][j][1] != -1) {
					count82++;
				} else if (row8[0][j][1] == -1) {
					count82 = 2;
				}
				if (row8[0][j][k] == 3 && row8[0][j][1] != -1) {
					count83++;
				} else if (row8[0][j][1] == -1) {
					count83 = 2;
				}
				if (row8[0][j][k] == 4 && row8[0][j][1] != -1) { 
					count84++;
				} else if (row8[0][j][1] == -1) {
					count84 = 2;
				}
				if (row8[0][j][k] == 5 && row8[0][j][1] != -1) {
					count85++;
				} else if (row8[0][j][1] == -1) {
					count85 = 2;
				}
				if (row8[0][j][k] == 6 && row8[0][j][1] != -1) {
					count86++;
				} else if (row8[0][j][1] == -1) {
					count86 = 2;
				}
				if (row8[0][j][k] == 7 && row8[0][j][1] != -1) {
					count87++;
				} else if (row8[0][j][1] == -1) {
					count87 = 2;
				}
				if (row8[0][j][k] == 8 && row8[0][j][1] != -1) {
					count88++;
				} else if (row8[0][j][1] == -1) {
					count88 = 2;
				}
				if (row8[0][j][k] == 9 && row8[0][j][1] != -1) {
					count89++;
				} else if (row8[0][j][1] == -1) {
					count89 = 2;
				}
			}
		}
		if (count81 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row8[0][j][0] == 1 && row8[0][j][1] != -1) {
					row8[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						row8[0][j][o] = -1;
					}
				}
			}
		}
		if (count82 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row8[0][j][1] == 2 && row8[0][j][1] != -1) {
					row8[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						row8[0][j][o] = -1;
					}
				}
			}
		}
		if (count83 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row8[0][j][2] == 3 && row8[0][j][1] != -1) {
					row8[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						row8[0][j][o] = -1;
					}
				}
			}
		}
		if (count84 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row8[0][j][3] == 4 && row8[0][j][1] != -1) {
					row8[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						row8[0][j][o] = -1;
					}
				}
			}
		}
		if (count85 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row8[0][j][4] == 5 && row8[0][j][1] != -1) {
					row8[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						row8[0][j][o] = -1;
					}
				}
			}
		}
		if (count86 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row8[0][j][5] == 6 && row8[0][j][1] != -1) {
					row8[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						row8[0][j][o] = -1;
					}
				}
			}
		}
		if (count87 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row8[0][j][6] == 7 && row8[0][j][1] != -1) {
					row8[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						row8[0][j][o] = -1;
					}
				}
			}
		}
		if (count88 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row8[0][j][7] == 8 && row8[0][j][1] != -1) {
					row8[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						row8[0][j][o] = -1;
					}
				}
			}
		}
		if (count89 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row8[0][j][8] == 9 && row8[0][j][1] != -1) {
					row8[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						row8[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (row9[0][j][k] == 1 && row9[0][j][1] != -1) {
					count91++;
				} else if (row9[0][j][1] == -1) {
					count91 = 2;
				}
				if (row9[0][j][k] == 2 && row9[0][j][1] != -1) {
					count92++;
				} else if (row9[0][j][1] == -1) {
					count92 = 2;
				}
				if (row9[0][j][k] == 3 && row9[0][j][1] != -1) {
					count93++;
				} else if (row9[0][j][1] == -1) {
					count93 = 2;
				}
				if (row9[0][j][k] == 4 && row9[0][j][1] != -1) { 
					count94++;
				} else if (row9[0][j][1] == -1) {
					count94 = 2;
				}
				if (row9[0][j][k] == 5 && row9[0][j][1] != -1) {
					count95++;
				} else if (row9[0][j][1] == -1) {
					count95 = 2;
				}
				if (row9[0][j][k] == 6 && row9[0][j][1] != -1) {
					count96++;
				} else if (row9[0][j][1] == -1) {
					count96 = 2;
				}
				if (row9[0][j][k] == 7 && row9[0][j][1] != -1) {
					count97++;
				} else if (row9[0][j][1] == -1) {
					count97 = 2;
				}
				if (row9[0][j][k] == 8 && row9[0][j][1] != -1) {
					count98++;
				} else if (row9[0][j][1] == -1) {
					count98 = 2;
				}
				if (row9[0][j][k] == 9 && row9[0][j][1] != -1) {
					count99++;
				} else if (row9[0][j][1] == -1) {
					count99 = 2;
				}
			}
		}
		if (count91 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row9[0][j][0] == 1 && row9[0][j][1] != -1) {
					row9[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						row9[0][j][o] = -1;
					}
				}
			}
		}
		if (count92 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row9[0][j][1] == 2 && row9[0][j][1] != -1) {
					row9[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						row9[0][j][o] = -1;
					}
				}
			}
		}
		if (count93 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row9[0][j][2] == 3 && row9[0][j][1] != -1) {
					row9[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						row9[0][j][o] = -1;
					}
				}
			}
		}
		if (count94 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row9[0][j][3] == 4 && row9[0][j][1] != -1) {
					row9[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						row9[0][j][o] = -1;
					}
				}
			}
		}
		if (count95 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row9[0][j][4] == 5 && row9[0][j][1] != -1) {
					row9[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						row9[0][j][o] = -1;
					}
				}
			}
		}
		if (count96 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row9[0][j][5] == 6 && row9[0][j][1] != -1) {
					row9[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						row9[0][j][o] = -1;
					}
				}
			}
		}
		if (count97 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row9[0][j][6] == 7 && row9[0][j][1] != -1) {
					row9[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						row9[0][j][o] = -1;
					}
				}
			}
		}
		if (count98 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row9[0][j][7] == 8 && row9[0][j][1] != -1) {
					row9[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						row9[0][j][o] = -1;
					}
				}
			}
		}
		if (count99 == 1) {
			for (int j = 0; j < 9; j++) {
				if (row9[0][j][8] == 9 && row9[0][j][1] != -1) {
					row9[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						row9[0][j][o] = -1;
					}
				}
			}
		}
		crossOut();
	}
	public static void columnChecker() {
		crossOut();
		int count11 = 0, count12 = 0, count13 = 0, 
				count14 = 0, count15 = 0, count16 = 0, 
				count17 = 0, count18 = 0, count19 = 0,
				count21 = 0, count22 = 0, count23 = 0, 
				count24 = 0, count25 = 0, count26 = 0, 
				count27 = 0, count28 = 0, count29 = 0,
				count31 = 0, count32 = 0, count33 = 0, 
				count34 = 0, count35 = 0, count36 = 0, 
				count37 = 0, count38 = 0, count39 = 0,
				count41 = 0, count42 = 0, count43 = 0, 
				count44 = 0, count45 = 0, count46 = 0, 
				count47 = 0, count48 = 0, count49 = 0,
				count51 = 0, count52 = 0, count53 = 0, 
				count54 = 0, count55 = 0, count56 = 0, 
				count57 = 0, count58 = 0, count59 = 0,
				count61 = 0, count62 = 0, count63 = 0, 
				count64 = 0, count65 = 0, count66 = 0, 
				count67 = 0, count68 = 0, count69 = 0,
				count71 = 0, count72 = 0, count73 = 0, 
				count74 = 0, count75 = 0, count76 = 0, 
				count77 = 0, count78 = 0, count79 = 0,
				count81 = 0, count82 = 0, count83 = 0, 
				count84 = 0, count85 = 0, count86 = 0, 
				count87 = 0, count88 = 0, count89 = 0,
				count91 = 0, count92 = 0, count93 = 0, 
				count94 = 0, count95 = 0, count96 = 0, 
				count97 = 0, count98 = 0, count99 = 0;
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (column1[0][j][k] == 1 && column1[0][j][1] != -1) {
					count11++;
				} else if (column1[0][j][1] == -1) {
					count11 = 2;
				}
				if (column1[0][j][k] == 2 && column1[0][j][1] != -1) {
					count12++;
				} else if (column1[0][j][1] == -1) {
					count12 = 2;
				}
				if (column1[0][j][k] == 3 && column1[0][j][1] != -1) {
					count13++;
				} else if (column1[0][j][1] == -1) {
					count13 = 2;
				}
				if (column1[0][j][k] == 4 && column1[0][j][1] != -1) { 
					count14++;
				} else if (column1[0][j][1] == -1) {
					count14 = 2;
				}
				if (column1[0][j][k] == 5 && column1[0][j][1] != -1) {
					count15++;
				} else if (column1[0][j][1] == -1) {
					count15 = 2;
				}
				if (column1[0][j][k] == 6 && column1[0][j][1] != -1) {
					count16++;
				} else if (column1[0][j][1] == -1) {
					count16 = 2;
				}
				if (column1[0][j][k] == 7 && column1[0][j][1] != -1) {
					count17++;
				} else if (column1[0][j][1] == -1) {
					count17 = 2;
				}
				if (column1[0][j][k] == 8 && column1[0][j][1] != -1) {
					count18++;
				} else if (column1[0][j][1] == -1) {
					count18 = 2;
				}
				if (column1[0][j][k] == 9 && column1[0][j][1] != -1) {
					count19++;
				} else if (column1[0][j][1] == -1) {
					count19 = 2;
				}
			}
		}
		if (count11 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column1[0][j][0] == 1 && column1[0][j][1] != -1) {
					column1[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						column1[0][j][o] = -1;
					}
				}
			}
		}
		if (count12 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column1[0][j][1] == 2 && column1[0][j][1] != -1) {
					column1[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						column1[0][j][o] = -1;
					}
				}
			}
		}
		if (count13 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column1[0][j][2] == 3 && column1[0][j][1] != -1) {
					column1[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						column1[0][j][o] = -1;
					}
				}
			}
		}
		if (count14 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column1[0][j][3] == 4 && column1[0][j][1] != -1) {
					column1[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						column1[0][j][o] = -1;
					}
				}
			}
		}
		if (count15 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column1[0][j][4] == 5 && column1[0][j][1] != -1) {
					column1[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						column1[0][j][o] = -1;
					}
				}
			}
		}
		if (count16 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column1[0][j][5] == 6 && column1[0][j][1] != -1) {
					column1[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						column1[0][j][o] = -1;
					}
				}
			}
		}
		if (count17 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column1[0][j][6] == 7 && column1[0][j][1] != -1) {
					column1[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						column1[0][j][o] = -1;
					}
				}
			}
		}
		if (count18 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column1[0][j][7] == 8 && column1[0][j][1] != -1) {
					column1[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						column1[0][j][o] = -1;
					}
				}
			}
		}
		if (count19 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column1[0][j][8] == 9 && column1[0][j][1] != -1) {
					column1[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						column1[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (column2[0][j][k] == 1 && column2[0][j][1] != -1) {
					count21++;
				} else if (column2[0][j][1] == -1) {
					count21 = 2;
				}
				if (column2[0][j][k] == 2 && column2[0][j][1] != -1) {
					count22++;
				} else if (column2[0][j][1] == -1) {
					count22 = 2;
				}
				if (column2[0][j][k] == 3 && column2[0][j][1] != -1) {
					count23++;
				} else if (column2[0][j][1] == -1) {
					count23 = 2;
				}
				if (column2[0][j][k] == 4 && column2[0][j][1] != -1) { 
					count24++;
				} else if (column2[0][j][1] == -1) {
					count24 = 2;
				}
				if (column2[0][j][k] == 5 && column2[0][j][1] != -1) {
					count25++;
				} else if (column2[0][j][1] == -1) {
					count25 = 2;
				}
				if (column2[0][j][k] == 6 && column2[0][j][1] != -1) {
					count26++;
				} else if (column2[0][j][1] == -1) {
					count26 = 2;
				}
				if (column2[0][j][k] == 7 && column2[0][j][1] != -1) {
					count27++;
				} else if (column2[0][j][1] == -1) {
					count27 = 2;
				}
				if (column2[0][j][k] == 8 && column2[0][j][1] != -1) {
					count28++;
				} else if (column2[0][j][1] == -1) {
					count28 = 2;
				}
				if (column2[0][j][k] == 9 && column2[0][j][1] != -1) {
					count29++;
				} else if (column2[0][j][1] == -1) {
					count29 = 2;
				}
			}
		}
		if (count21 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column2[0][j][0] == 1 && column2[0][j][1] != -1) {
					column2[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						column2[0][j][o] = -1;
					}
				}
			}
		}
		if (count22 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column2[0][j][1] == 2 && column2[0][j][1] != -1) {
					column2[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						column2[0][j][o] = -1;
					}
				}
			}
		}
		if (count23 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column2[0][j][2] == 3 && column2[0][j][1] != -1) {
					column2[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						column2[0][j][o] = -1;
					}
				}
			}
		}
		if (count24 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column2[0][j][3] == 4 && column2[0][j][1] != -1) {
					column2[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						column2[0][j][o] = -1;
					}
				}
			}
		}
		if (count25 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column2[0][j][4] == 5 && column2[0][j][1] != -1) {
					column2[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						column2[0][j][o] = -1;
					}
				}
			}
		}
		if (count26 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column2[0][j][5] == 6 && column2[0][j][1] != -1) {
					column2[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						column2[0][j][o] = -1;
					}
				}
			}
		}
		if (count27 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column2[0][j][6] == 7 && column2[0][j][1] != -1) {
					column2[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						column2[0][j][o] = -1;
					}
				}
			}
		}
		if (count28 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column2[0][j][7] == 8 && column2[0][j][1] != -1) {
					column2[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						column2[0][j][o] = -1;
					}
				}
			}
		}
		if (count29 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column2[0][j][8] == 9 && column2[0][j][1] != -1) {
					column2[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						column2[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (column3[0][j][k] == 1 && column3[0][j][1] != -1) {
					count31++;
				} else if (column3[0][j][1] == -1) {
					count31 = 2;
				}
				if (column3[0][j][k] == 2 && column3[0][j][1] != -1) {
					count32++;
				} else if (column3[0][j][1] == -1) {
					count32 = 2;
				}
				if (column3[0][j][k] == 3 && column3[0][j][1] != -1) {
					count33++;
				} else if (column3[0][j][1] == -1) {
					count33 = 2;
				}
				if (column3[0][j][k] == 4 && column3[0][j][1] != -1) { 
					count34++;
				} else if (column3[0][j][1] == -1) {
					count34 = 2;
				}
				if (column3[0][j][k] == 5 && column3[0][j][1] != -1) {
					count35++;
				} else if (column3[0][j][1] == -1) {
					count35 = 2;
				}
				if (column3[0][j][k] == 6 && column3[0][j][1] != -1) {
					count36++;
				} else if (column3[0][j][1] == -1) {
					count36 = 2;
				}
				if (column3[0][j][k] == 7 && column3[0][j][1] != -1) {
					count37++;
				} else if (column3[0][j][1] == -1) {
					count37 = 2;
				}
				if (column3[0][j][k] == 8 && column3[0][j][1] != -1) {
					count38++;
				} else if (column3[0][j][1] == -1) {
					count38 = 2;
				}
				if (column3[0][j][k] == 9 && column3[0][j][1] != -1) {
					count39++;
				} else if (column3[0][j][1] == -1) {
					count39 = 2;
				}
			}
		}
		if (count31 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column3[0][j][0] == 1 && column3[0][j][1] != -1) {
					column3[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						column3[0][j][o] = -1;
					}
				}
			}
		}
		if (count32 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column3[0][j][1] == 2 && column3[0][j][1] != -1) {
					column3[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						column3[0][j][o] = -1;
					}
				}
			}
		}
		if (count33 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column3[0][j][2] == 3 && column3[0][j][1] != -1) {
					column3[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						column3[0][j][o] = -1;
					}
				}
			}
		}
		if (count34 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column3[0][j][3] == 4 && column3[0][j][1] != -1) {
					column3[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						column3[0][j][o] = -1;
					}
				}
			}
		}
		if (count35 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column3[0][j][4] == 5 && column3[0][j][1] != -1) {
					column3[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						column3[0][j][o] = -1;
					}
				}
			}
		}
		if (count36 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column3[0][j][5] == 6 && column3[0][j][1] != -1) {
					column3[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						column3[0][j][o] = -1;
					}
				}
			}
		}
		if (count37 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column3[0][j][6] == 7 && column3[0][j][1] != -1) {
					column3[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						column3[0][j][o] = -1;
					}
				}
			}
		}
		if (count38 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column3[0][j][7] == 8 && column3[0][j][1] != -1) {
					column3[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						column3[0][j][o] = -1;
					}
				}
			}
		}
		if (count39 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column3[0][j][8] == 9 && column3[0][j][1] != -1) {
					column3[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						column3[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (column4[0][j][k] == 1 && column4[0][j][1] != -1) {
					count41++;
				} else if (column4[0][j][1] == -1) {
					count41 = 2;
				}
				if (column4[0][j][k] == 2 && column4[0][j][1] != -1) {
					count42++;
				} else if (column4[0][j][1] == -1) {
					count42 = 2;
				}
				if (column4[0][j][k] == 3 && column4[0][j][1] != -1) {
					count43++;
				} else if (column4[0][j][1] == -1) {
					count43 = 2;
				}
				if (column4[0][j][k] == 4 && column4[0][j][1] != -1) { 
					count44++;
				} else if (column4[0][j][1] == -1) {
					count44 = 2;
				}
				if (column4[0][j][k] == 5 && column4[0][j][1] != -1) {
					count45++;
				} else if (column4[0][j][1] == -1) {
					count45 = 2;
				}
				if (column4[0][j][k] == 6 && column4[0][j][1] != -1) {
					count46++;
				} else if (column4[0][j][1] == -1) {
					count46 = 2;
				}
				if (column4[0][j][k] == 7 && column4[0][j][1] != -1) {
					count47++;
				} else if (column4[0][j][1] == -1) {
					count47 = 2;
				}
				if (column4[0][j][k] == 8 && column4[0][j][1] != -1) {
					count48++;
				} else if (column4[0][j][1] == -1) {
					count48 = 2;
				}
				if (column4[0][j][k] == 9 && column4[0][j][1] != -1) {
					count49++;
				} else if (column4[0][j][1] == -1) {
					count49 = 2;
				}
			}
		}
		if (count41 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column4[0][j][0] == 1 && column4[0][j][1] != -1) {
					column4[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						row4[0][j][o] = -1;
					}
				}
			}
		}
		if (count42 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column4[0][j][1] == 2 && column4[0][j][1] != -1) {
					column4[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						column4[0][j][o] = -1;
					}
				}
			}
		}
		if (count43 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column4[0][j][2] == 3 && column4[0][j][1] != -1) {
					column4[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						column4[0][j][o] = -1;
					}
				}
			}
		}
		if (count44 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column4[0][j][3] == 4 && column4[0][j][1] != -1) {
					column4[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						column4[0][j][o] = -1;
					}
				}
			}
		}
		if (count45 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column4[0][j][4] == 5 && column4[0][j][1] != -1) {
					column4[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						column4[0][j][o] = -1;
					}
				}
			}
		}
		if (count46 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column4[0][j][5] == 6 && column4[0][j][1] != -1) {
					column4[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						column4[0][j][o] = -1;
					}
				}
			}
		}
		if (count47 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column4[0][j][6] == 7 && column4[0][j][1] != -1) {
					column4[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						column4[0][j][o] = -1;
					}
				}
			}
		}
		if (count48 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column4[0][j][7] == 8 && column4[0][j][1] != -1) {
					column4[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						column4[0][j][o] = -1;
					}
				}
			}
		}
		if (count49 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column4[0][j][8] == 9 && column4[0][j][1] != -1) {
					column4[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						column4[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (column5[0][j][k] == 1 && column5[0][j][1] != -1) {
					count51++;
				} else if (column5[0][j][1] == -1) {
					count51 = 2;
				}
				if (column5[0][j][k] == 2 && column5[0][j][1] != -1) {
					count52++;
				} else if (column5[0][j][1] == -1) {
					count52 = 2;
				}
				if (column5[0][j][k] == 3 && column5[0][j][1] != -1) {
					count53++;
				} else if (column5[0][j][1] == -1) {
					count53 = 2;
				}
				if (column5[0][j][k] == 4 && column5[0][j][1] != -1) { 
					count54++;
				} else if (column5[0][j][1] == -1) {
					count54 = 2;
				}
				if (column5[0][j][k] == 5 && column5[0][j][1] != -1) {
					count55++;
				} else if (column5[0][j][1] == -1) {
					count55 = 2;
				}
				if (column5[0][j][k] == 6 && column5[0][j][1] != -1) {
					count56++;
				} else if (column5[0][j][1] == -1) {
					count56 = 2;
				}
				if (column5[0][j][k] == 7 && column5[0][j][1] != -1) {
					count57++;
				} else if (column5[0][j][1] == -1) {
					count57 = 2;
				}
				if (column5[0][j][k] == 8 && column5[0][j][1] != -1) {
					count58++;
				} else if (column5[0][j][1] == -1) {
					count58 = 2;
				}
				if (column5[0][j][k] == 9 && column5[0][j][1] != -1) {
					count59++;
				} else if (column5[0][j][1] == -1) {
					count59 = 2;
				}
			}
		}
		if (count51 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column5[0][j][0] == 1 && column5[0][j][1] != -1) {
					column5[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						column5[0][j][o] = -1;
					}
				}
			}
		}
		if (count52 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column5[0][j][1] == 2 && column5[0][j][1] != -1) {
					column5[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						column5[0][j][o] = -1;
					}
				}
			}
		}
		if (count53 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column5[0][j][2] == 3 && column5[0][j][1] != -1) {
					column5[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						column5[0][j][o] = -1;
					}
				}
			}
		}
		if (count54 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column5[0][j][3] == 4 && column5[0][j][1] != -1) {
					column5[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						column5[0][j][o] = -1;
					}
				}
			}
		}
		if (count55 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column5[0][j][4] == 5 && column5[0][j][1] != -1) {
					column5[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						column5[0][j][o] = -1;
					}
				}
			}
		}
		if (count56 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column5[0][j][5] == 6 && column5[0][j][1] != -1) {
					column5[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						column5[0][j][o] = -1;
					}
				}
			}
		}
		if (count57 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column5[0][j][6] == 7 && column5[0][j][1] != -1) {
					column5[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						column5[0][j][o] = -1;
					}
				}
			}
		}
		if (count58 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column5[0][j][7] == 8 && column5[0][j][1] != -1) {
					column5[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						column5[0][j][o] = -1;
					}
				}
			}
		}
		if (count59 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column5[0][j][8] == 9 && column5[0][j][1] != -1) {
					column5[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						column5[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (column6[0][j][k] == 1 && column6[0][j][1] != -1) {
					count61++;
				} else if (column6[0][j][1] == -1) {
					count61 = 2;
				}
				if (column6[0][j][k] == 2 && column6[0][j][1] != -1) {
					count62++;
				} else if (column6[0][j][1] == -1) {
					count62 = 2;
				}
				if (column6[0][j][k] == 3 && column6[0][j][1] != -1) {
					count63++;
				} else if (column6[0][j][1] == -1) {
					count63 = 2;
				}
				if (column6[0][j][k] == 4 && column6[0][j][1] != -1) { 
					count64++;
				} else if (column6[0][j][1] == -1) {
					count64 = 2;
				}
				if (column6[0][j][k] == 5 && column6[0][j][1] != -1) {
					count65++;
				} else if (column6[0][j][1] == -1) {
					count65 = 2;
				}
				if (column6[0][j][k] == 6 && column6[0][j][1] != -1) {
					count66++;
				} else if (column6[0][j][1] == -1) {
					count66 = 2;
				}
				if (column6[0][j][k] == 7 && column6[0][j][1] != -1) {
					count67++;
				} else if (column6[0][j][1] == -1) {
					count67 = 2;
				}
				if (column6[0][j][k] == 8 && column6[0][j][1] != -1) {
					count68++;
				} else if (column6[0][j][1] == -1) {
					count68 = 2;
				}
				if (column6[0][j][k] == 9 && column6[0][j][1] != -1) {
					count69++;
				} else if (column6[0][j][1] == -1) {
					count69 = 2;
				}
			}
		}
		if (count61 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column6[0][j][0] == 1 && column6[0][j][1] != -1) {
					column6[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						column6[0][j][o] = -1;
					}
				}
			}
		}
		if (count62 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column6[0][j][1] == 2 && column6[0][j][1] != -1) {
					column6[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						column6[0][j][o] = -1;
					}
				}
			}
		}
		if (count63 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column6[0][j][2] == 3 && column6[0][j][1] != -1) {
					column6[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						column6[0][j][o] = -1;
					}
				}
			}
		}
		if (count64 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column6[0][j][3] == 4 && column6[0][j][1] != -1) {
					column6[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						column6[0][j][o] = -1;
					}
				}
			}
		}
		if (count65 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column6[0][j][4] == 5 && column6[0][j][1] != -1) {
					column6[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						column6[0][j][o] = -1;
					}
				}
			}
		}
		if (count66 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column6[0][j][5] == 6 && column6[0][j][1] != -1) {
					column6[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						column6[0][j][o] = -1;
					}
				}
			}
		}
		if (count67 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column6[0][j][6] == 7 && column6[0][j][1] != -1) {
					column6[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						column6[0][j][o] = -1;
					}
				}
			}
		}
		if (count68 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column6[0][j][7] == 8 && column6[0][j][1] != -1) {
					column6[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						column6[0][j][o] = -1;
					}
				}
			}
		}
		if (count69 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column6[0][j][8] == 9 && column6[0][j][1] != -1) {
					column6[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						column6[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (column7[0][j][k] == 1 && column7[0][j][1] != -1) {
					count71++;
				} else if (column7[0][j][1] == -1) {
					count71 = 2;
				}
				if (column7[0][j][k] == 2 && column7[0][j][1] != -1) {
					count72++;
				} else if (column7[0][j][1] == -1) {
					count72 = 2;
				}
				if (column7[0][j][k] == 3 && column7[0][j][1] != -1) {
					count73++;
				} else if (column7[0][j][1] == -1) {
					count73 = 2;
				}
				if (column7[0][j][k] == 4 && column7[0][j][1] != -1) { 
					count74++;
				} else if (column7[0][j][1] == -1) {
					count74 = 2;
				}
				if (column7[0][j][k] == 5 && column7[0][j][1] != -1) {
					count75++;
				} else if (column7[0][j][1] == -1) {
					count75 = 2;
				}
				if (column7[0][j][k] == 6 && column7[0][j][1] != -1) {
					count76++;
				} else if (column7[0][j][1] == -1) {
					count76 = 2;
				}
				if (column7[0][j][k] == 7 && column7[0][j][1] != -1) {
					count77++;
				} else if (column7[0][j][1] == -1) {
					count77 = 2;
				}
				if (column7[0][j][k] == 8 && column7[0][j][1] != -1) {
					count78++;
				} else if (column7[0][j][1] == -1) {
					count78 = 2;
				}
				if (column7[0][j][k] == 9 && column7[0][j][1] != -1) {
					count79++;
				} else if (column7[0][j][1] == -1) {
					count79 = 2;
				}
			}
		}
		if (count71 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column7[0][j][0] == 1 && column7[0][j][1] != -1) {
					column7[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						column7[0][j][o] = -1;
					}
				}
			}
		}
		if (count72 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column7[0][j][1] == 2 && column7[0][j][1] != -1) {
					column7[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						column7[0][j][o] = -1;
					}
				}
			}
		}
		if (count73 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column7[0][j][2] == 3 && column7[0][j][1] != -1) {
					column7[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						column7[0][j][o] = -1;
					}
				}
			}
		}
		if (count74 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column7[0][j][3] == 4 && column7[0][j][1] != -1) {
					column7[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						column7[0][j][o] = -1;
					}
				}
			}
		}
		if (count75 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column7[0][j][4] == 5 && column7[0][j][1] != -1) {
					column7[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						column7[0][j][o] = -1;
					}
				}
			}
		}
		if (count76 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column7[0][j][5] == 6 && column7[0][j][1] != -1) {
					column7[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						column7[0][j][o] = -1;
					}
				}
			}
		}
		if (count77 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column7[0][j][6] == 7 && column7[0][j][1] != -1) {
					column7[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						column7[0][j][o] = -1;
					}
				}
			}
		}
		if (count78 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column7[0][j][7] == 8 && column7[0][j][1] != -1) {
					column7[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						column7[0][j][o] = -1;
					}
				}
			}
		}
		if (count79 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column7[0][j][8] == 9 && column7[0][j][1] != -1) {
					column7[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						column7[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (column8[0][j][k] == 1 && column8[0][j][1] != -1) {
					count81++;
				} else if (column8[0][j][1] == -1) {
					count81 = 2;
				}
				if (column8[0][j][k] == 2 && column8[0][j][1] != -1) {
					count82++;
				} else if (column8[0][j][1] == -1) {
					count82 = 2;
				}
				if (column8[0][j][k] == 3 && column8[0][j][1] != -1) {
					count83++;
				} else if (column8[0][j][1] == -1) {
					count83 = 2;
				}
				if (column8[0][j][k] == 4 && column8[0][j][1] != -1) { 
					count84++;
				} else if (column8[0][j][1] == -1) {
					count84 = 2;
				}
				if (column8[0][j][k] == 5 && column8[0][j][1] != -1) {
					count85++;
				} else if (column8[0][j][1] == -1) {
					count85 = 2;
				}
				if (column8[0][j][k] == 6 && column8[0][j][1] != -1) {
					count86++;
				} else if (column8[0][j][1] == -1) {
					count86 = 2;
				}
				if (column8[0][j][k] == 7 && column8[0][j][1] != -1) {
					count87++;
				} else if (column8[0][j][1] == -1) {
					count87 = 2;
				}
				if (column8[0][j][k] == 8 && column8[0][j][1] != -1) {
					count88++;
				} else if (column8[0][j][1] == -1) {
					count88 = 2;
				}
				if (column8[0][j][k] == 9 && column8[0][j][1] != -1) {
					count89++;
				} else if (column8[0][j][1] == -1) {
					count89 = 2;
				}
			}
		}
		if (count81 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column8[0][j][0] == 1 && column8[0][j][1] != -1) {
					column8[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						column8[0][j][o] = -1;
					}
				}
			}
		}
		if (count82 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column8[0][j][1] == 2 && column8[0][j][1] != -1) {
					column8[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						column8[0][j][o] = -1;
					}
				}
			}
		}
		if (count83 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column8[0][j][2] == 3 && column8[0][j][1] != -1) {
					column8[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						column8[0][j][o] = -1;
					}
				}
			}
		}
		if (count84 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column8[0][j][3] == 4 && column8[0][j][1] != -1) {
					column8[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						column8[0][j][o] = -1;
					}
				}
			}
		}
		if (count85 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column8[0][j][4] == 5 && column8[0][j][1] != -1) {
					column8[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						column8[0][j][o] = -1;
					}
				}
			}
		}
		if (count86 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column8[0][j][5] == 6 && column8[0][j][1] != -1) {
					column8[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						column8[0][j][o] = -1;
					}
				}
			}
		}
		if (count87 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column8[0][j][6] == 7 && column8[0][j][1] != -1) {
					column8[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						column8[0][j][o] = -1;
					}
				}
			}
		}
		if (count88 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column8[0][j][7] == 8 && column8[0][j][1] != -1) {
					column8[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						column8[0][j][o] = -1;
					}
				}
			}
		}
		if (count89 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column8[0][j][8] == 9 && column8[0][j][1] != -1) {
					column8[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						column8[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (column9[0][j][k] == 1 && column9[0][j][1] != -1) {
					count91++;
				} else if (column9[0][j][1] == -1) {
					count91 = 2;
				}
				if (column9[0][j][k] == 2 && column9[0][j][1] != -1) {
					count92++;
				} else if (column9[0][j][1] == -1) {
					count92 = 2;
				}
				if (column9[0][j][k] == 3 && column9[0][j][1] != -1) {
					count93++;
				} else if (column9[0][j][1] == -1) {
					count93 = 2;
				}
				if (column9[0][j][k] == 4 && column9[0][j][1] != -1) { 
					count94++;
				} else if (column9[0][j][1] == -1) {
					count94 = 2;
				}
				if (column9[0][j][k] == 5 && column9[0][j][1] != -1) {
					count95++;
				} else if (column9[0][j][1] == -1) {
					count95 = 2;
				}
				if (column9[0][j][k] == 6 && column9[0][j][1] != -1) {
					count96++;
				} else if (column9[0][j][1] == -1) {
					count96 = 2;
				}
				if (column9[0][j][k] == 7 && column9[0][j][1] != -1) {
					count97++;
				} else if (column9[0][j][1] == -1) {
					count97 = 2;
				}
				if (column9[0][j][k] == 8 && column9[0][j][1] != -1) {
					count98++;
				} else if (column9[0][j][1] == -1) {
					count98 = 2;
				}
				if (column9[0][j][k] == 9 && column9[0][j][1] != -1) {
					count99++;
				} else if (column9[0][j][1] == -1) {
					count99 = 2;
				}
			}
		}
		if (count91 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column9[0][j][0] == 1 && column9[0][j][1] != -1) {
					column9[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						column9[0][j][o] = -1;
					}
				}
			}
		}
		if (count92 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column9[0][j][1] == 2 && column9[0][j][1] != -1) {
					column9[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						column9[0][j][o] = -1;
					}
				}
			}
		}
		if (count93 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column9[0][j][2] == 3 && column9[0][j][1] != -1) {
					column9[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						column9[0][j][o] = -1;
					}
				}
			}
		}
		if (count94 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column9[0][j][3] == 4 && column9[0][j][1] != -1) {
					column9[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						column9[0][j][o] = -1;
					}
				}
			}
		}
		if (count95 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column9[0][j][4] == 5 && column9[0][j][1] != -1) {
					column9[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						column9[0][j][o] = -1;
					}
				}
			}
		}
		if (count96 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column9[0][j][5] == 6 && column9[0][j][1] != -1) {
					column9[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						column9[0][j][o] = -1;
					}
				}
			}
		}
		if (count97 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column9[0][j][6] == 7 && column9[0][j][1] != -1) {
					column9[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						column9[0][j][o] = -1;
					}
				}
			}
		}
		if (count98 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column9[0][j][7] == 8 && column9[0][j][1] != -1) {
					column9[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						column9[0][j][o] = -1;
					}
				}
			}
		}
		if (count99 == 1) {
			for (int j = 0; j < 9; j++) {
				if (column9[0][j][8] == 9 && column9[0][j][1] != -1) {
					column9[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						column9[0][j][o] = -1;
					}
				}
			}
		}
		crossOut();
	}
	public static void matrixChecker() {
		crossOut();
		int count11 = 0, count12 = 0, count13 = 0, 
				count14 = 0, count15 = 0, count16 = 0, 
				count17 = 0, count18 = 0, count19 = 0,
				count21 = 0, count22 = 0, count23 = 0, 
				count24 = 0, count25 = 0, count26 = 0, 
				count27 = 0, count28 = 0, count29 = 0,
				count31 = 0, count32 = 0, count33 = 0, 
				count34 = 0, count35 = 0, count36 = 0, 
				count37 = 0, count38 = 0, count39 = 0,
				count41 = 0, count42 = 0, count43 = 0, 
				count44 = 0, count45 = 0, count46 = 0, 
				count47 = 0, count48 = 0, count49 = 0,
				count51 = 0, count52 = 0, count53 = 0, 
				count54 = 0, count55 = 0, count56 = 0, 
				count57 = 0, count58 = 0, count59 = 0,
				count61 = 0, count62 = 0, count63 = 0, 
				count64 = 0, count65 = 0, count66 = 0, 
				count67 = 0, count68 = 0, count69 = 0,
				count71 = 0, count72 = 0, count73 = 0, 
				count74 = 0, count75 = 0, count76 = 0, 
				count77 = 0, count78 = 0, count79 = 0,
				count81 = 0, count82 = 0, count83 = 0, 
				count84 = 0, count85 = 0, count86 = 0, 
				count87 = 0, count88 = 0, count89 = 0,
				count91 = 0, count92 = 0, count93 = 0, 
				count94 = 0, count95 = 0, count96 = 0, 
				count97 = 0, count98 = 0, count99 = 0;
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (matrix11[0][j][k] == 1 && matrix11[0][j][1] != -1) {
					count11++;
				} else if (matrix11[0][j][1] == -1) {
					count11 = 2;
				}
				if (matrix11[0][j][k] == 2 && matrix11[0][j][1] != -1) {
					count12++;
				} else if (matrix11[0][j][1] == -1) {
					count12 = 2;
				}
				if (matrix11[0][j][k] == 3 && matrix11[0][j][1] != -1) {
					count13++;
				} else if (matrix11[0][j][1] == -1) {
					count13 = 2;
				}
				if (matrix11[0][j][k] == 4 && matrix11[0][j][1] != -1) { 
					count14++;
				} else if (matrix11[0][j][1] == -1) {
					count14 = 2;
				}
				if (matrix11[0][j][k] == 5 && matrix11[0][j][1] != -1) {
					count15++;
				} else if (matrix11[0][j][1] == -1) {
					count15 = 2;
				}
				if (matrix11[0][j][k] == 6 && matrix11[0][j][1] != -1) {
					count16++;
				} else if (matrix11[0][j][1] == -1) {
					count16 = 2;
				}
				if (matrix11[0][j][k] == 7 && matrix11[0][j][1] != -1) {
					count17++;
				} else if (matrix11[0][j][1] == -1) {
					count17 = 2;
				}
				if (matrix11[0][j][k] == 8 && matrix11[0][j][1] != -1) {
					count18++;
				} else if (matrix11[0][j][1] == -1) {
					count18 = 2;
				}
				if (matrix11[0][j][k] == 9 && matrix11[0][j][1] != -1) {
					count19++;
				} else if (matrix11[0][j][1] == -1) {
					count19 = 2;
				}
			}
		}
		if (count11 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix11[0][j][0] == 1 && matrix11[0][j][1] != -1) {
					matrix11[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						matrix11[0][j][o] = -1;
					}
				}
			}
		}
		if (count12 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix11[0][j][1] == 2 && matrix11[0][j][1] != -1) {
					matrix11[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						matrix11[0][j][o] = -1;
					}
				}
			}
		}
		if (count13 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix11[0][j][2] == 3 && matrix11[0][j][1] != -1) {
					matrix11[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						matrix11[0][j][o] = -1;
					}
				}
			}
		}
		if (count14 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix11[0][j][3] == 4 && matrix11[0][j][1] != -1) {
					matrix11[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						matrix11[0][j][o] = -1;
					}
				}
			}
		}
		if (count15 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix11[0][j][4] == 5 && matrix11[0][j][1] != -1) {
					matrix11[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						matrix11[0][j][o] = -1;
					}
				}
			}
		}
		if (count16 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix11[0][j][5] == 6 && matrix11[0][j][1] != -1) {
					matrix11[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						matrix11[0][j][o] = -1;
					}
				}
			}
		}
		if (count17 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix11[0][j][6] == 7 && matrix11[0][j][1] != -1) {
					matrix11[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						matrix11[0][j][o] = -1;
					}
				}
			}
		}
		if (count18 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix11[0][j][7] == 8 && matrix11[0][j][1] != -1) {
					matrix11[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						matrix11[0][j][o] = -1;
					}
				}
			}
		}
		if (count19 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix11[0][j][8] == 9 && matrix11[0][j][1] != -1) {
					matrix11[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						matrix11[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (matrix12[0][j][k] == 1 && matrix12[0][j][1] != -1) {
					count21++;
				} else if (matrix12[0][j][1] == -1) {
					count21 = 2;
				}
				if (matrix12[0][j][k] == 2 && matrix12[0][j][1] != -1) {
					count22++;
				} else if (matrix12[0][j][1] == -1) {
					count22 = 2;
				}
				if (matrix12[0][j][k] == 3 && matrix12[0][j][1] != -1) {
					count23++;
				} else if (matrix12[0][j][1] == -1) {
					count23 = 2;
				}
				if (matrix12[0][j][k] == 4 && matrix12[0][j][1] != -1) { 
					count24++;
				} else if (matrix12[0][j][1] == -1) {
					count24 = 2;
				}
				if (matrix12[0][j][k] == 5 && matrix12[0][j][1] != -1) {
					count25++;
				} else if (matrix12[0][j][1] == -1) {
					count25 = 2;
				}
				if (matrix12[0][j][k] == 6 && matrix12[0][j][1] != -1) {
					count26++;
				} else if (matrix12[0][j][1] == -1) {
					count26 = 2;
				}
				if (matrix12[0][j][k] == 7 && matrix12[0][j][1] != -1) {
					count27++;
				} else if (matrix12[0][j][1] == -1) {
					count27 = 2;
				}
				if (matrix12[0][j][k] == 8 && matrix12[0][j][1] != -1) {
					count28++;
				} else if (matrix12[0][j][1] == -1) {
					count28 = 2;
				}
				if (matrix12[0][j][k] == 9 && matrix12[0][j][1] != -1) {
					count29++;
				} else if (matrix12[0][j][1] == -1) {
					count29 = 2;
				}
			}
		}
		if (count21 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix12[0][j][0] == 1 && matrix12[0][j][1] != -1) {
					matrix12[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						matrix12[0][j][o] = -1;
					}
				}
			}
		}
		if (count22 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix12[0][j][1] == 2 && matrix12[0][j][1] != -1) {
					matrix12[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						matrix12[0][j][o] = -1;
					}
				}
			}
		}
		if (count23 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix12[0][j][2] == 3 && matrix12[0][j][1] != -1) {
					matrix12[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						matrix12[0][j][o] = -1;
					}
				}
			}
		}
		if (count24 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix12[0][j][3] == 4 && matrix12[0][j][1] != -1) {
					matrix12[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						matrix12[0][j][o] = -1;
					}
				}
			}
		}
		if (count25 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix12[0][j][4] == 5 && matrix12[0][j][1] != -1) {
					matrix12[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						matrix12[0][j][o] = -1;
					}
				}
			}
		}
		if (count26 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix12[0][j][5] == 6 && matrix12[0][j][1] != -1) {
					matrix12[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						matrix12[0][j][o] = -1;
					}
				}
			}
		}
		if (count27 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix12[0][j][6] == 7 && matrix12[0][j][1] != -1) {
					matrix12[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						matrix12[0][j][o] = -1;
					}
				}
			}
		}
		if (count28 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix12[0][j][7] == 8 && matrix12[0][j][1] != -1) {
					matrix12[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						matrix12[0][j][o] = -1;
					}
				}
			}
		}
		if (count29 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix12[0][j][8] == 9 && matrix12[0][j][1] != -1) {
					matrix12[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						matrix12[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (matrix13[0][j][k] == 1 && matrix13[0][j][1] != -1) {
					count31++;
				} else if (matrix13[0][j][1] == -1) {
					count31 = 2;
				}
				if (matrix13[0][j][k] == 2 && matrix13[0][j][1] != -1) {
					count32++;
				} else if (matrix13[0][j][1] == -1) {
					count32 = 2;
				}
				if (matrix13[0][j][k] == 3 && matrix13[0][j][1] != -1) {
					count33++;
				} else if (matrix13[0][j][1] == -1) {
					count33 = 2;
				}
				if (matrix13[0][j][k] == 4 && matrix13[0][j][1] != -1) { 
					count34++;
				} else if (matrix13[0][j][1] == -1) {
					count34 = 2;
				}
				if (matrix13[0][j][k] == 5 && matrix13[0][j][1] != -1) {
					count35++;
				} else if (matrix13[0][j][1] == -1) {
					count35 = 2;
				}
				if (matrix13[0][j][k] == 6 && matrix13[0][j][1] != -1) {
					count36++;
				} else if (matrix13[0][j][1] == -1) {
					count36 = 2;
				}
				if (matrix13[0][j][k] == 7 && matrix13[0][j][1] != -1) {
					count37++;
				} else if (matrix13[0][j][1] == -1) {
					count37 = 2;
				}
				if (matrix13[0][j][k] == 8 && matrix13[0][j][1] != -1) {
					count38++;
				} else if (matrix13[0][j][1] == -1) {
					count38 = 2;
				}
				if (matrix13[0][j][k] == 9 && matrix13[0][j][1] != -1) {
					count39++;
				} else if (matrix13[0][j][1] == -1) {
					count39 = 2;
				}
			}
		}
		if (count31 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix13[0][j][0] == 1 && matrix13[0][j][1] != -1) {
					matrix13[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						matrix13[0][j][o] = -1;
					}
				}
			}
		}
		if (count32 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix13[0][j][1] == 2 && matrix13[0][j][1] != -1) {
					matrix13[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						matrix13[0][j][o] = -1;
					}
				}
			}
		}
		if (count33 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix13[0][j][2] == 3 && matrix13[0][j][1] != -1) {
					matrix13[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						matrix13[0][j][o] = -1;
					}
				}
			}
		}
		if (count34 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix13[0][j][3] == 4 && matrix13[0][j][1] != -1) {
					matrix13[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						matrix13[0][j][o] = -1;
					}
				}
			}
		}
		if (count35 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix13[0][j][4] == 5 && matrix13[0][j][1] != -1) {
					matrix13[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						matrix13[0][j][o] = -1;
					}
				}
			}
		}
		if (count36 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix13[0][j][5] == 6 && matrix13[0][j][1] != -1) {
					matrix13[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						matrix13[0][j][o] = -1;
					}
				}
			}
		}
		if (count37 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix13[0][j][6] == 7 && matrix13[0][j][1] != -1) {
					matrix13[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						matrix13[0][j][o] = -1;
					}
				}
			}
		}
		if (count38 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix13[0][j][7] == 8 && matrix13[0][j][1] != -1) {
					matrix13[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						matrix13[0][j][o] = -1;
					}
				}
			}
		}
		if (count39 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix13[0][j][8] == 9 && matrix13[0][j][1] != -1) {
					matrix13[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						matrix13[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (matrix14[0][j][k] == 1 && matrix14[0][j][1] != -1) {
					count41++;
				} else if (matrix14[0][j][1] == -1) {
					count41 = 2;
				}
				if (matrix14[0][j][k] == 2 && matrix14[0][j][1] != -1) {
					count42++;
				} else if (matrix14[0][j][1] == -1) {
					count42 = 2;
				}
				if (matrix14[0][j][k] == 3 && matrix14[0][j][1] != -1) {
					count43++;
				} else if (matrix14[0][j][1] == -1) {
					count43 = 2;
				}
				if (matrix14[0][j][k] == 4 && matrix14[0][j][1] != -1) { 
					count44++;
				} else if (matrix14[0][j][1] == -1) {
					count44 = 2;
				}
				if (matrix14[0][j][k] == 5 && matrix14[0][j][1] != -1) {
					count45++;
				} else if (matrix14[0][j][1] == -1) {
					count45 = 2;
				}
				if (matrix14[0][j][k] == 6 && matrix14[0][j][1] != -1) {
					count46++;
				} else if (matrix14[0][j][1] == -1) {
					count46 = 2;
				}
				if (matrix14[0][j][k] == 7 && matrix14[0][j][1] != -1) {
					count47++;
				} else if (matrix14[0][j][1] == -1) {
					count47 = 2;
				}
				if (matrix14[0][j][k] == 8 && matrix14[0][j][1] != -1) {
					count48++;
				} else if (matrix14[0][j][1] == -1) {
					count48 = 2;
				}
				if (matrix14[0][j][k] == 9 && matrix14[0][j][1] != -1) {
					count49++;
				} else if (matrix14[0][j][1] == -1) {
					count49 = 2;
				}
			}
		}
		if (count41 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix14[0][j][0] == 1 && matrix14[0][j][1] != -1) {
					matrix14[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						matrix14[0][j][o] = -1;
					}
				}
			}
		}
		if (count42 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix14[0][j][1] == 2 && matrix14[0][j][1] != -1) {
					matrix14[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						matrix14[0][j][o] = -1;
					}
				}
			}
		}
		if (count43 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix14[0][j][2] == 3 && matrix14[0][j][1] != -1) {
					matrix14[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						matrix14[0][j][o] = -1;
					}
				}
			}
		}
		if (count44 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix14[0][j][3] == 4 && matrix14[0][j][1] != -1) {
					matrix14[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						matrix14[0][j][o] = -1;
					}
				}
			}
		}
		if (count45 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix14[0][j][4] == 5 && matrix14[0][j][1] != -1) {
					matrix14[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						matrix14[0][j][o] = -1;
					}
				}
			}
		}
		if (count46 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix14[0][j][5] == 6 && matrix14[0][j][1] != -1) {
					matrix14[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						matrix14[0][j][o] = -1;
					}
				}
			}
		}
		if (count47 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix14[0][j][6] == 7 && matrix14[0][j][1] != -1) {
					matrix14[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						matrix14[0][j][o] = -1;
					}
				}
			}
		}
		if (count48 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix14[0][j][7] == 8 && matrix14[0][j][1] != -1) {
					matrix14[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						matrix14[0][j][o] = -1;
					}
				}
			}
		}
		if (count49 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix14[0][j][8] == 9 && matrix14[0][j][1] != -1) {
					matrix14[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						matrix14[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (matrix15[0][j][k] == 1 && matrix15[0][j][1] != -1) {
					count51++;
				} else if (matrix15[0][j][1] == -1) {
					count51 = 2;
				}
				if (matrix15[0][j][k] == 2 && matrix15[0][j][1] != -1) {
					count52++;
				} else if (matrix15[0][j][1] == -1) {
					count52 = 2;
				}
				if (matrix15[0][j][k] == 3 && matrix15[0][j][1] != -1) {
					count53++;
				} else if (matrix15[0][j][1] == -1) {
					count53 = 2;
				}
				if (matrix15[0][j][k] == 4 && matrix15[0][j][1] != -1) { 
					count54++;
				} else if (matrix15[0][j][1] == -1) {
					count54 = 2;
				}
				if (matrix15[0][j][k] == 5 && matrix15[0][j][1] != -1) {
					count55++;
				} else if (matrix15[0][j][1] == -1) {
					count55 = 2;
				}
				if (matrix15[0][j][k] == 6 && matrix15[0][j][1] != -1) {
					count56++;
				} else if (matrix15[0][j][1] == -1) {
					count56 = 2;
				}
				if (matrix15[0][j][k] == 7 && matrix15[0][j][1] != -1) {
					count57++;
				} else if (matrix15[0][j][1] == -1) {
					count57 = 2;
				}
				if (matrix15[0][j][k] == 8 && matrix15[0][j][1] != -1) {
					count58++;
				} else if (matrix15[0][j][1] == -1) {
					count58 = 2;
				}
				if (matrix15[0][j][k] == 9 && matrix15[0][j][1] != -1) {
					count59++;
				} else if (matrix15[0][j][1] == -1) {
					count59 = 2;
				}
			}
		}
		if (count51 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix15[0][j][0] == 1 && matrix15[0][j][1] != -1) {
					matrix15[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						matrix15[0][j][o] = -1;
					}
				}
			}
		}
		if (count52 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix15[0][j][1] == 2 && matrix15[0][j][1] != -1) {
					matrix15[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						matrix15[0][j][o] = -1;
					}
				}
			}
		}
		if (count53 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix15[0][j][2] == 3 && matrix15[0][j][1] != -1) {
					matrix15[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						matrix15[0][j][o] = -1;
					}
				}
			}
		}
		if (count54 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix15[0][j][3] == 4 && matrix15[0][j][1] != -1) {
					matrix15[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						matrix15[0][j][o] = -1;
					}
				}
			}
		}
		if (count55 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix15[0][j][4] == 5 && matrix15[0][j][1] != -1) {
					matrix15[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						matrix15[0][j][o] = -1;
					}
				}
			}
		}
		if (count56 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix15[0][j][5] == 6 && matrix15[0][j][1] != -1) {
					matrix15[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						matrix15[0][j][o] = -1;
					}
				}
			}
		}
		if (count57 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix15[0][j][6] == 7 && matrix15[0][j][1] != -1) {
					matrix15[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						matrix15[0][j][o] = -1;
					}
				}
			}
		}
		if (count58 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix15[0][j][7] == 8 && matrix15[0][j][1] != -1) {
					matrix15[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						matrix15[0][j][o] = -1;
					}
				}
			}
		}
		if (count59 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix15[0][j][8] == 9 && matrix15[0][j][1] != -1) {
					matrix15[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						matrix15[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (matrix16[0][j][k] == 1 && matrix16[0][j][1] != -1) {
					count61++;
				} else if (matrix16[0][j][1] == -1) {
					count61 = 2;
				}
				if (matrix16[0][j][k] == 2 && matrix16[0][j][1] != -1) {
					count62++;
				} else if (matrix16[0][j][1] == -1) {
					count62 = 2;
				}
				if (matrix16[0][j][k] == 3 && matrix16[0][j][1] != -1) {
					count63++;
				} else if (matrix16[0][j][1] == -1) {
					count63 = 2;
				}
				if (matrix16[0][j][k] == 4 && matrix16[0][j][1] != -1) { 
					count64++;
				} else if (matrix16[0][j][1] == -1) {
					count64 = 2;
				}
				if (matrix16[0][j][k] == 5 && matrix16[0][j][1] != -1) {
					count65++;
				} else if (matrix16[0][j][1] == -1) {
					count65 = 2;
				}
				if (matrix16[0][j][k] == 6 && matrix16[0][j][1] != -1) {
					count66++;
				} else if (matrix16[0][j][1] == -1) {
					count66 = 2;
				}
				if (matrix16[0][j][k] == 7 && matrix16[0][j][1] != -1) {
					count67++;
				} else if (matrix16[0][j][1] == -1) {
					count67 = 2;
				}
				if (matrix16[0][j][k] == 8 && matrix16[0][j][1] != -1) {
					count68++;
				} else if (matrix16[0][j][1] == -1) {
					count68 = 2;
				}
				if (matrix16[0][j][k] == 9 && matrix16[0][j][1] != -1) {
					count69++;
				} else if (matrix16[0][j][1] == -1) {
					count69 = 2;
				}
			}
		}
		if (count61 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix16[0][j][0] == 1 && matrix16[0][j][1] != -1) {
					matrix16[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						matrix16[0][j][o] = -1;
					}
				}
			}
		}
		if (count62 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix16[0][j][1] == 2 && matrix16[0][j][1] != -1) {
					matrix16[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						matrix16[0][j][o] = -1;
					}
				}
			}
		}
		if (count63 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix16[0][j][2] == 3 && matrix16[0][j][1] != -1) {
					matrix16[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						matrix16[0][j][o] = -1;
					}
				}
			}
		}
		if (count64 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix16[0][j][3] == 4 && matrix16[0][j][1] != -1) {
					matrix16[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						matrix16[0][j][o] = -1;
					}
				}
			}
		}
		if (count65 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix16[0][j][4] == 5 && matrix16[0][j][1] != -1) {
					matrix16[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						matrix16[0][j][o] = -1;
					}
				}
			}
		}
		if (count66 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix16[0][j][5] == 6 && matrix16[0][j][1] != -1) {
					matrix16[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						matrix16[0][j][o] = -1;
					}
				}
			}
		}
		if (count67 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix16[0][j][6] == 7 && matrix16[0][j][1] != -1) {
					matrix16[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						matrix16[0][j][o] = -1;
					}
				}
			}
		}
		if (count68 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix16[0][j][7] == 8 && matrix16[0][j][1] != -1) {
					matrix16[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						matrix16[0][j][o] = -1;
					}
				}
			}
		}
		if (count69 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix16[0][j][8] == 9 && matrix16[0][j][1] != -1) {
					matrix16[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						matrix16[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (matrix17[0][j][k] == 1 && matrix17[0][j][1] != -1) {
					count71++;
				} else if (matrix17[0][j][1] == -1) {
					count71 = 2;
				}
				if (matrix17[0][j][k] == 2 && matrix17[0][j][1] != -1) {
					count72++;
				} else if (matrix17[0][j][1] == -1) {
					count72 = 2;
				}
				if (matrix17[0][j][k] == 3 && matrix17[0][j][1] != -1) {
					count73++;
				} else if (matrix17[0][j][1] == -1) {
					count73 = 2;
				}
				if (matrix17[0][j][k] == 4 && matrix17[0][j][1] != -1) { 
					count74++;
				} else if (matrix17[0][j][1] == -1) {
					count74 = 2;
				}
				if (matrix17[0][j][k] == 5 && matrix17[0][j][1] != -1) {
					count75++;
				} else if (matrix17[0][j][1] == -1) {
					count75 = 2;
				}
				if (matrix17[0][j][k] == 6 && matrix17[0][j][1] != -1) {
					count76++;
				} else if (matrix17[0][j][1] == -1) {
					count76 = 2;
				}
				if (matrix17[0][j][k] == 7 && matrix17[0][j][1] != -1) {
					count77++;
				} else if (matrix17[0][j][1] == -1) {
					count77 = 2;
				}
				if (matrix17[0][j][k] == 8 && matrix17[0][j][1] != -1) {
					count78++;
				} else if (matrix17[0][j][1] == -1) {
					count78 = 2;
				}
				if (matrix17[0][j][k] == 9 && matrix17[0][j][1] != -1) {
					count79++;
				} else if (matrix17[0][j][1] == -1) {
					count79 = 2;
				}
			}
		}
		if (count71 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix17[0][j][0] == 1 && matrix17[0][j][1] != -1) {
					matrix17[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						matrix17[0][j][o] = -1;
					}
				}
			}
		}
		if (count72 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix17[0][j][1] == 2 && matrix17[0][j][1] != -1) {
					matrix17[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						matrix17[0][j][o] = -1;
					}
				}
			}
		}
		if (count73 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix17[0][j][2] == 3 && matrix17[0][j][1] != -1) {
					matrix17[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						matrix17[0][j][o] = -1;
					}
				}
			}
		}
		if (count74 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix17[0][j][3] == 4 && matrix17[0][j][1] != -1) {
					matrix17[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						matrix17[0][j][o] = -1;
					}
				}
			}
		}
		if (count75 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix17[0][j][4] == 5 && matrix17[0][j][1] != -1) {
					matrix17[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						matrix17[0][j][o] = -1;
					}
				}
			}
		}
		if (count76 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix17[0][j][5] == 6 && matrix17[0][j][1] != -1) {
					matrix17[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						matrix17[0][j][o] = -1;
					}
				}
			}
		}
		if (count77 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix17[0][j][6] == 7 && matrix17[0][j][1] != -1) {
					matrix17[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						matrix17[0][j][o] = -1;
					}
				}
			}
		}
		if (count78 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix17[0][j][7] == 8 && matrix17[0][j][1] != -1) {
					matrix17[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						matrix17[0][j][o] = -1;
					}
				}
			}
		}
		if (count79 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix17[0][j][8] == 9 && matrix17[0][j][1] != -1) {
					matrix17[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						matrix17[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (matrix18[0][j][k] == 1 && matrix18[0][j][1] != -1) {
					count81++;
				} else if (matrix18[0][j][1] == -1) {
					count81 = 2;
				}
				if (matrix18[0][j][k] == 2 && matrix18[0][j][1] != -1) {
					count82++;
				} else if (matrix18[0][j][1] == -1) {
					count82 = 2;
				}
				if (matrix18[0][j][k] == 3 && matrix18[0][j][1] != -1) {
					count83++;
				} else if (matrix18[0][j][1] == -1) {
					count83 = 2;
				}
				if (matrix18[0][j][k] == 4 && matrix18[0][j][1] != -1) { 
					count84++;
				} else if (matrix18[0][j][1] == -1) {
					count84 = 2;
				}
				if (matrix18[0][j][k] == 5 && matrix18[0][j][1] != -1) {
					count85++;
				} else if (matrix18[0][j][1] == -1) {
					count85 = 2;
				}
				if (matrix18[0][j][k] == 6 && matrix18[0][j][1] != -1) {
					count86++;
				} else if (matrix18[0][j][1] == -1) {
					count86 = 2;
				}
				if (matrix18[0][j][k] == 7 && matrix18[0][j][1] != -1) {
					count87++;
				} else if (matrix18[0][j][1] == -1) {
					count87 = 2;
				}
				if (matrix18[0][j][k] == 8 && matrix18[0][j][1] != -1) {
					count88++;
				} else if (matrix18[0][j][1] == -1) {
					count88 = 2;
				}
				if (matrix18[0][j][k] == 9 && matrix18[0][j][1] != -1) {
					count89++;
				} else if (matrix18[0][j][1] == -1) {
					count89 = 2;
				}
			}
		}
		if (count81 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix18[0][j][0] == 1 && matrix18[0][j][1] != -1) {
					matrix18[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						matrix18[0][j][o] = -1;
					}
				}
			}
		}
		if (count82 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix18[0][j][1] == 2 && matrix18[0][j][1] != -1) {
					matrix18[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						matrix18[0][j][o] = -1;
					}
				}
			}
		}
		if (count83 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix18[0][j][2] == 3 && matrix18[0][j][1] != -1) {
					matrix18[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						matrix18[0][j][o] = -1;
					}
				}
			}
		}
		if (count84 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix18[0][j][3] == 4 && matrix18[0][j][1] != -1) {
					matrix18[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						matrix18[0][j][o] = -1;
					}
				}
			}
		}
		if (count85 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix18[0][j][4] == 5 && matrix18[0][j][1] != -1) {
					matrix18[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						matrix18[0][j][o] = -1;
					}
				}
			}
		}
		if (count86 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix18[0][j][5] == 6 && matrix18[0][j][1] != -1) {
					matrix18[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						matrix18[0][j][o] = -1;
					}
				}
			}
		}
		if (count87 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix18[0][j][6] == 7 && matrix18[0][j][1] != -1) {
					matrix18[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						matrix18[0][j][o] = -1;
					}
				}
			}
		}
		if (count88 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix18[0][j][7] == 8 && matrix18[0][j][1] != -1) {
					matrix18[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						matrix18[0][j][o] = -1;
					}
				}
			}
		}
		if (count89 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix18[0][j][8] == 9 && matrix18[0][j][1] != -1) {
					matrix18[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						matrix18[0][j][o] = -1;
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {
				if (matrix19[0][j][k] == 1 && matrix19[0][j][1] != -1) {
					count91++;
				} else if (matrix19[0][j][1] == -1) {
					count91 = 2;
				}
				if (matrix19[0][j][k] == 2 && matrix19[0][j][1] != -1) {
					count92++;
				} else if (matrix19[0][j][1] == -1) {
					count92 = 2;
				}
				if (matrix19[0][j][k] == 3 && matrix19[0][j][1] != -1) {
					count93++;
				} else if (matrix19[0][j][1] == -1) {
					count93 = 2;
				}
				if (matrix19[0][j][k] == 4 && matrix19[0][j][1] != -1) { 
					count94++;
				} else if (matrix19[0][j][1] == -1) {
					count94 = 2;
				}
				if (matrix19[0][j][k] == 5 && matrix19[0][j][1] != -1) {
					count95++;
				} else if (matrix19[0][j][1] == -1) {
					count95 = 2;
				}
				if (matrix19[0][j][k] == 6 && matrix19[0][j][1] != -1) {
					count96++;
				} else if (matrix19[0][j][1] == -1) {
					count96 = 2;
				}
				if (matrix19[0][j][k] == 7 && matrix19[0][j][1] != -1) {
					count97++;
				} else if (matrix19[0][j][1] == -1) {
					count97 = 2;
				}
				if (matrix19[0][j][k] == 8 && matrix19[0][j][1] != -1) {
					count98++;
				} else if (matrix19[0][j][1] == -1) {
					count98 = 2;
				}
				if (matrix19[0][j][k] == 9 && matrix19[0][j][1] != -1) {
					count99++;
				} else if (matrix19[0][j][1] == -1) {
					count99 = 2;
				}
			}
		}
		if (count91 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix19[0][j][0] == 1 && matrix19[0][j][1] != -1) {
					matrix19[0][j][0] = 1;
					for (int o = 1; o < 9; o++) {
						matrix19[0][j][o] = -1;
					}
				}
			}
		}
		if (count92 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix19[0][j][1] == 2 && matrix19[0][j][1] != -1) {
					matrix19[0][j][0] = 2;
					for (int o = 1; o < 9; o++) {
						matrix19[0][j][o] = -1;
					}
				}
			}
		}
		if (count93 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix19[0][j][2] == 3 && matrix19[0][j][1] != -1) {
					matrix19[0][j][0] = 3;
					for (int o = 1; o < 9; o++) {
						matrix19[0][j][o] = -1;
					}
				}
			}
		}
		if (count94 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix19[0][j][3] == 4 && matrix19[0][j][1] != -1) {
					matrix19[0][j][0] = 4;
					for (int o = 1; o < 9; o++) {
						matrix19[0][j][o] = -1;
					}
				}
			}
		}
		if (count95 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix19[0][j][4] == 5 && matrix19[0][j][1] != -1) {
					matrix19[0][j][0] = 5;
					for (int o = 1; o < 9; o++) {
						matrix19[0][j][o] = -1;
					}
				}
			}
		}
		if (count96 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix19[0][j][5] == 6 && matrix19[0][j][1] != -1) {
					matrix19[0][j][0] = 6;
					for (int o = 1; o < 9; o++) {
						matrix19[0][j][o] = -1;
					}
				}
			}
		}
		if (count97 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix19[0][j][6] == 7 && matrix19[0][j][1] != -1) {
					matrix19[0][j][0] = 7;
					for (int o = 1; o < 9; o++) {
						matrix19[0][j][o] = -1;
					}
				}
			}
		}
		if (count98 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix19[0][j][7] == 8 && matrix19[0][j][1] != -1) {
					matrix19[0][j][0] = 8;
					for (int o = 1; o < 9; o++) {
						matrix19[0][j][o] = -1;
					}
				}
			}
		}
		if (count99 == 1) {
			for (int j = 0; j < 9; j++) {
				if (matrix19[0][j][8] == 9 && matrix19[0][j][1] != -1) {
					matrix19[0][j][0] = 9;
					for (int o = 1; o < 9; o++) {
						matrix19[0][j][o] = -1;
					}
				}
			}
		}
		crossOut();
	}
}