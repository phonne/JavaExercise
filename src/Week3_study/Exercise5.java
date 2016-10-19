package Week3_study;

import java.util.*;
import package10_99.Week2ExerciseCalculator11;

public class Exercise5 {

	public static void printPascalTriangle(int num) {
		Week2ExerciseCalculator11 m = new Week2ExerciseCalculator11();
		for (int row = 0; row < num; row++) {
			long number = 0;
			System.out.format("%" + (num - row) * 2 + "s", "");
			for (int col = 0; col <= row; col++) {
				number = m.factorial(row) / (m.factorial(col) * m.factorial(row - col));
				System.out.format("%4d", number);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner consolo = new Scanner(System.in);

		System.out.println("Input rows");
		int row = consolo.nextInt();

		printPascalTriangle(row);
	}

}