package Week3_study;

import java.util.*;

public class Exercise1 {

	public static boolean isEven(int number) {
		boolean isEven = (number % 2 == 0) ? true : false;
		return isEven;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consolo = new Scanner(System.in);
		System.out.println("Input the number");
		int Even = consolo.nextInt();
		if (isEven(Even)) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}