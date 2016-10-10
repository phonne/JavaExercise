package package10_99;

import java.util.*;

public class Week2Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int[20];
		int x = 1;
		numbers[0] = 1;
		System.out.println("the array is: " + numbers[0]);
		for (x = 1; x < 20; x++) {
			numbers[x] = 2 * numbers[x - 1];
			System.out.println("the array is: " + numbers[x]);

		}

		System.out.print(numbers[0] + ",  ");
		ArrayList<Double> list = new ArrayList<Double>(17);

		for (int j = 1; j < 20; j++) {
			list.add((numbers[j] + numbers[j - 1]) / 2.0);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",  ");
		}
		System.out.println(numbers[19]);

	}

}
