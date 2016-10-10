package package10_99;

import java.util.Scanner;

import package10_99.Week3_exercise5_chessnew;

public class control {

	static Scanner user_input = new Scanner(System.in);

	public static void main(String[] args) {
		Week3_exercise5_chessnew myChessboard = new Week3_exercise5_chessnew();

		while (myChessboard.getGameRunning()) {

			myChessboard.printBoard();
			myChessboard.move();

		}
	}

}