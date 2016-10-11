package package10_99;

import java.util.*;

public class Week2Exercise5_1 {

	static int count = 2;
	static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h" };
	static String[] number = { "8", "7", "6", "5", "4", "3", "2", "1" };
	static List<Chessmen> black = Arrays.asList(Chessmen.BLACK_KING, Chessmen.BLACK_QUEEN, Chessmen.BLACK_ROOK,
			Chessmen.BLACK_BISHOP, Chessmen.BLACK_KNIGHT, Chessmen.BLACK_PAWN);
	static List<Chessmen> white = Arrays.asList(Chessmen.WHITE_KING, Chessmen.WHITE_QUEEN, Chessmen.WHITE_ROOK,
			Chessmen.WHITE_BISHOP, Chessmen.WHITE_KNIGHT, Chessmen.WHITE_PAWN);
	static List<Chessmen> blackp = Arrays.asList(Chessmen.BLACK_KING, Chessmen.BLACK_QUEEN, Chessmen.BLACK_ROOK,
			Chessmen.BLACK_BISHOP, Chessmen.BLACK_KNIGHT, Chessmen.BLACK_PAWN);
	static List<Chessmen> whitep = Arrays.asList(Chessmen.WHITE_KING, Chessmen.WHITE_QUEEN, Chessmen.WHITE_ROOK,
			Chessmen.WHITE_BISHOP, Chessmen.WHITE_KNIGHT, Chessmen.WHITE_PAWN);

	public enum Chessmen {
		WHITE_KING, WHITE_QUEEN, WHITE_ROOK, WHITE_BISHOP, WHITE_KNIGHT, WHITE_PAWN, BLACK_KING, BLACK_QUEEN, BLACK_ROOK, BLACK_BISHOP, BLACK_KNIGHT, BLACK_PAWN, EMPTY
	}

	public static void chessLayout(Chessmen[][] chessboard) {

		// Use two nested for loops to populate the chessboard with pieces and
		// empty spaces.
		// If��else statements should help to set the pieces where they belong
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i == 0) {
					chessboard[i][0] = Chessmen.BLACK_ROOK;
					chessboard[i][1] = Chessmen.BLACK_KNIGHT;
					chessboard[i][2] = Chessmen.BLACK_BISHOP;
					chessboard[i][3] = Chessmen.BLACK_QUEEN;
					chessboard[i][4] = Chessmen.BLACK_KING;
					chessboard[i][5] = Chessmen.BLACK_BISHOP;
					chessboard[i][6] = Chessmen.BLACK_KNIGHT;
					chessboard[i][7] = Chessmen.BLACK_ROOK;
				} else if (i == 1) {
					chessboard[i][j] = Chessmen.BLACK_PAWN;
				} else if (i >= 2 && i <= 5) {
					chessboard[i][j] = Chessmen.EMPTY;
				} else if (i == 6) {
					chessboard[i][j] = Chessmen.WHITE_PAWN;
				} else if (i == 7) {
					chessboard[i][0] = Chessmen.WHITE_ROOK;
					chessboard[i][1] = Chessmen.WHITE_KNIGHT;
					chessboard[i][2] = Chessmen.WHITE_BISHOP;
					chessboard[i][3] = Chessmen.WHITE_QUEEN;
					chessboard[i][4] = Chessmen.WHITE_KING;
					chessboard[i][5] = Chessmen.WHITE_BISHOP;
					chessboard[i][6] = Chessmen.WHITE_KNIGHT;
					chessboard[i][7] = Chessmen.WHITE_ROOK;
				}
			}
		} // end for loop assigning chess pieces to chess board

	} // end assignChess
	/*
	 * 
	 * for (int i = 0; i < 8; i++) { chessboard[6][i] = Chessmen.WHITE_PAWN;
	 * chessboard[1][i] = Chessmen.BLACK_PAWN; for (int j = 0; j < 8; j++) {
	 * 
	 * if (i == 7) { chessboard[i][0] = Chessmen.WHITE_ROOK; chessboard[i][1] =
	 * Chessmen.WHITE_KNIGHT; chessboard[i][2] = Chessmen.WHITE_BISHOP;
	 * chessboard[i][3] = Chessmen.WHITE_KING; chessboard[i][4] =
	 * Chessmen.WHITE_QUEEN; chessboard[i][5] = Chessmen.WHITE_BISHOP;
	 * chessboard[i][6] = Chessmen.WHITE_KNIGHT; chessboard[i][7] =
	 * Chessmen.WHITE_ROOK; } else if (i == 1) { chessboard[i][0] =
	 * Chessmen.BLACK_ROOK; chessboard[i][1] = Chessmen.BLACK_KNIGHT;
	 * chessboard[i][2] = Chessmen.BLACK_BISHOP; chessboard[i][3] =
	 * Chessmen.BLACK_KING; chessboard[i][4] = Chessmen.BLACK_QUEEN;
	 * chessboard[i][5] = Chessmen.BLACK_BISHOP; chessboard[i][6] =
	 * Chessmen.BLACK_KNIGHT; chessboard[i][7] = Chessmen.BLACK_ROOK;
	 * 
	 * } else chessboard[i][j] = Chessmen.EMPTY; } } // end for loop assigning
	 * chess pieces to chess board
	 * 
	 * }// end assignChess
	 */

	public static void printBoard(Chessmen[][] chessboard) {
		// Use "\t" for placing tabs in strings. This will help you align
		// individual columns in your chessboard.
		// for i rows
		for (int i = 0; i < 8; i++) {
			System.out.print("\t" + alphabet[i]);
		}

		System.out.println();
		for (int i = 0; i < 8; i++) {
			System.out.println();
			System.out.print(number[i] + "." + "\t");

			for (int j = 0; j < 8; j++) {
				switch (chessboard[i][j]) {
				case WHITE_KING:
					System.out.print("\u2654");// white king
					break;
				case WHITE_QUEEN:
					System.out.print("\u2655");// white queen
					break;
				case WHITE_ROOK:
					System.out.print("\u2656");// white rook
					break;
				case WHITE_BISHOP:
					System.out.print("\u2657");// white bishop
					break;
				case WHITE_KNIGHT:
					System.out.print("\u2658");// white knight
					break;
				case WHITE_PAWN:
					System.out.print("\u2659");// white pawn
					break;
				case BLACK_KING:
					System.out.print("\u265A");// black king
					break;
				case BLACK_QUEEN:
					System.out.print("\u265B");// black queen
					break;
				case BLACK_ROOK:
					System.out.print("\u265C");// black rook
					break;
				case BLACK_BISHOP:
					System.out.print("\u265D");// black bishop
					break;
				case BLACK_KNIGHT:
					System.out.print("\u265E");// black knight
					break;
				case BLACK_PAWN:
					System.out.print("\u265F");// black pawn
					break;
				case EMPTY:
					System.out.print("");
					break;
				}
				System.out.print("\t");
			}
			System.out.println();
		} // end for loop
	} // end printboard function

	public static int getIndexOf(char input) {
		if (input == 'a') {
			return 0;
		} else if (input == 'b') {
			return 1;
		} else if (input == 'c') {
			return 2;
		} else if (input == 'd') {
			return 3;
		} else if (input == 'e') {
			return 4;
		} else if (input == 'f') {
			return 5;
		} else if (input == 'g') {
			return 6;
		} else if (input == 'h') {
			return 7;
		} else {
			return -1;
		}
	} // end get index of

	public static int getIndexOfN(char input) {
		if (input == '8') {
			return 0;
		} else if (input == '7') {
			return 1;
		} else if (input == '6') {
			return 2;
		} else if (input == '5') {
			return 3;
		} else if (input == '4') {
			return 4;
		} else if (input == '3') {
			return 5;
		} else if (input == '2') {
			return 6;
		} else if (input == '1') {
			return 7;
		} else {
			return -1;
		}
	} // end get index of N

	public static boolean isValid(Chessmen[][] chessboard, Chessmen atStart, int fromY, int fromX, int toY, int toX,
			int count) {
		if (isEmpty(chessboard, atStart, fromY, fromX, toY, toX)) {
			if (isDifferent(chessboard, fromY, fromX, toY, toX)) {
				if (movecheck(chessboard, fromY, fromX, toY, toX)) {
					// if (rightTurn(chessboard, fromY, fromX, toY, toX,
					// playerColour(count))) {
					// System.out.println("rightturn test");
					// return true;
					// }
					// System.out.println("diff test");
					return true;
				}
			} else {
				System.err.println("Error Message");
			}
		}
		// }
		return false;

	} // end boolean isValid

	/*
	 * public static String playerColour(int count) { String player = null; if
	 * (count % 2 == 1) { return player = "Black";
	 * 
	 * } else if (count % 2 == 0) { return player = "White";
	 * 
	 * } return player = null; }
	 * 
	 * public static boolean rightTurn(Chessmen[][] chessboard, int fromY, int
	 * fromX, int toY, int toX, String player) { if (player == "White" &&
	 * white.contains(chessboard[fromX][fromY])) { System.out.println(player);
	 * return true; } if (player == "black" &&
	 * blackp.contains(chessboard[fromX][fromY])) { System.out.println(player);
	 * return true; } else {
	 * System.out.println("You cannot use other's pieces."); return false; } }
	 */
	public static boolean movecheck(Chessmen[][] chessboard, int fromY, int fromX, int toY, int toX) {

		// For The Black King.
		if (chessboard[fromX][fromY] == Chessmen.BLACK_KING) {
			if ((toX <= fromX + 1 && toX >= Math.abs(fromX - 1)) && (toY <= fromY + 1 && toY >= Math.abs(fromY - 1))) {
				return true;

			}

			else {
				return false;
			}
		}

		// This "else if" is for The White King.
		else if (chessboard[toX][fromY] == Chessmen.WHITE_KING) {
			if ((toX <= fromX + 1 && toX >= Math.abs(fromX - 1)) && (toY <= fromY + 1 && toY >= Math.abs(fromY - 1))) {
				return true;

			}

			else {
				return false;
			}
		}

		// This "else if" is for The Black Knight.
		else if (chessboard[fromX][fromY] == Chessmen.BLACK_KNIGHT) {
			int newRow = Math.abs(toX - fromX);
			int newColumn = Math.abs(toY - fromY);
			if ((newRow == 2 && newColumn == 1) || (newRow == 1 && newColumn == 2)) {
				return true;
			} else {
				return false;
			}
		}

		// This "else if" is for The White Knight.
		else if (chessboard[fromX][fromY] == Chessmen.WHITE_KNIGHT) {
			int newRow = Math.abs(toX - fromX);
			int newColumn = Math.abs(toY - fromY);
			if ((newRow == 2 && newColumn == 1) || (newRow == 1 && newColumn == 2)) {
				return true;
			} else {
				return false;
			}
		}

		// This "else if" is for The Black Rooks
		else if (chessboard[fromX][fromY] == Chessmen.BLACK_ROOK) {
			if (toX != fromX || toY != fromY) {
				return true;
			}

			// This checks whether there are no pieces on the way to the new
			// position.
			else {
				return false;
			}

		}

		// This "else if" is for The White Rook
		else if (chessboard[fromX][fromY] == Chessmen.WHITE_ROOK) {
			if (fromX != toX || toY != fromY) {
				return true;
			}

			// This checks whether there are no pieces on the way to the new
			// position.
			else {
				return false;
			}

		}

		// This "else if" is for The Black Bishop.
		else if (chessboard[fromX][fromY] == Chessmen.BLACK_BISHOP) {
			int newRow = Math.abs(toX - fromX);
			int newColumn = Math.abs(toY - fromY);

			if (newRow != newColumn) {
				return false;
			}

			// This checks whether there are no pieces on the way to the new
			// position.
			else {
				return false;
			}

		}

		// This "else if" is for The White Bishop.
		else if (chessboard[fromX][fromY] == Chessmen.WHITE_BISHOP) {
			int newRow = Math.abs(toX - fromX);
			int newColumn = Math.abs(toY - fromY);

			if (newRow != newColumn) {
				return false;
			}

			// This checks whether there are no pieces on the way to the new
			// position.
			else {
				return false;
			}

		}

		return true;
	}

	public static boolean isEmpty(Chessmen[][] chessboard, Chessmen atStart, int fromY, int fromX, int toY, int toX) {
		if (atStart != Chessmen.EMPTY) {
			return true;
		} else {
			System.out.println("Cannot start from empty.");
			return false;
		}

	}

	public static boolean isDifferent(Chessmen[][] chessboard, int fromY, int fromX, int toY, int toX) {
		if (black.contains(chessboard[fromX][fromY]) && black.contains(chessboard[toX][toY])) {
			System.out.println("Cannot kill your own pieces.");
			return false;
		} else if (white.contains(chessboard[fromX][fromY]) && white.contains(chessboard[toX][toY])) {
			System.out.println("Cannot kill your own pieces.");
			return false;
		} else {

			return true;
		}
	}

	public static int move(Chessmen[][] chessboard, String move, int count) {

		String[] components = move.split(" ");

		System.out.println(Arrays.toString(components));

		int fromY = getIndexOf(components[0].charAt(0));
		int fromX = getIndexOfN(components[0].charAt(1));
		int toY = getIndexOf(components[2].charAt(0));
		int toX = getIndexOfN(components[2].charAt(1));

		System.out.println("atStart=" + chessboard[fromX][fromY]);
		System.out.println("destination=" + chessboard[toX][toY]);

		// use function to return numbers instead of alphabets
		Chessmen atStart = chessboard[fromX][fromY];

		if (isValid(chessboard, atStart, fromY, fromX, toY, toX, count) == true) {
			chessboard[fromX][fromY] = Chessmen.EMPTY;
			chessboard[toX][toY] = atStart;
			System.out.println("count1: " + count);
			return count++;
		} else {
			System.out.println("count0: " + count);
			return count;
		}
	} // end move

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a chess board matrix. It is an array of arrays (hence matrix)
		// of size 8 X 8.
		Chessmen[][] chessboard = new Chessmen[8][8];
		Scanner consolo = new Scanner(System.in);
		chessLayout(chessboard);
		boolean exit = false;
		while (exit == false) {

			printBoard(chessboard);
			System.out.println(
					"Which chess piece to where?" + "\n" + "Please Enter value of column and row (as x0 to x0)");
			System.out.println("Player 1: Type in moves.");
			String input = consolo.nextLine();

			int newCount = move(chessboard, input, count);
			printBoard(chessboard);
			// System.out.println(count);

			System.out.println("Next player's turn.");
			input = consolo.nextLine();
			newCount = move(chessboard, input, count);
			printBoard(chessboard);
			// System.out.println(count);

			System.out.println("Exit or keep playing?");
			input = consolo.nextLine();
			if (input.equals("exit")) {
				exit = true;
				System.exit(0);
			}
		} // end while
	} // end main

}
