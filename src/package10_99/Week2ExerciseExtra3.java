package package10_99;

import java.util.*;

public class Week2ExerciseExtra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myInts = new ArrayList<Integer>(25);
		System.out.println("Size of myInts = " + myInts.size());
		for (int k = 0; k < 10; k++) {
			myInts.add(3 * k);
		}
		myInts.set(6, 45);
		myInts.add(8, 57);
		myInts.remove(new Integer(99));
		System.out.println("Size of myInts is: " + myInts.size());
		for (int k = 0; k < myInts.size(); k++) {
			System.out.print(myInts.get(k) + ",");
		}
		if (myInts.contains(57)) {
			System.out.println("\n57 found at index" + myInts.indexOf(57));
		}
		System.out.println("44 found at index" + myInts.indexOf(45));

	}
}
