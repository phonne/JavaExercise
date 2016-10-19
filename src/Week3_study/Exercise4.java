package Week3_study;

import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner consolo = new Scanner(System.in);
		Vector<Double> myVector = new Vector<Double>(50);

		double input = 0.0;

		do {
			input = consolo.nextDouble();
			if (input == 0) {
				break;
			} else {
				myVector.add(input);
			}

		} while (input != 0);

		System.out.println("Unsorted vector: " + myVector);
		Collections.sort(myVector);
		System.out.println("Sorted vector: " + myVector);

	}
}
