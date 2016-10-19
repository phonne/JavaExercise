package package10_99;

import java.util.Scanner;

public class Week2ExerciseCalculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Simple calculator. Please choose an operation:");
			System.out.println("1. Add");
			System.out.println("2. Substract");
			System.out.println("3. Multiply");
			System.out.println("4. Didvide");
			System.out.println("5. Factorial");
			System.out.println("6. Exit");
			Scanner consolo = new Scanner(System.in);
			int method1 = consolo.nextInt();
			if (method1 <5) {
				System.out.println("Input two numbers");
				int a = consolo.nextInt();
				int b = consolo.nextInt();
				switch (method1) {
				case 1:
					
					int answer = Week2Exercise2method.add(a, b);
					System.out.println("the anwser is " + answer);
					break;
				case 2:
					int answer1 = Week2Exercise2method.substract(a, b);
					System.out.println("the anwser is " + answer1);
					break;
				case 3:
					int answer2 = Week2Exercise2method.multiply(a, b);
					System.out.println("the anwser is " + answer2);
					break;
				case 4:
					double answer3 = Week2Exercise2method.divide(a, b);
					System.out.println("the anwser is " + answer3);
					break;
				}
			}
//					change Int to double at here an in method class will
//					make the result accurate
			else
				switch (method1){
				case 5:
					System.out.println("input a number: ");
					int n = consolo.nextInt();
					long answer4 = Week2Exercise2method.factorial(n);
					System.out.println("the answer is " + answer4);
				case 6:
					System.out.println("exit...");
					System.exit(0);
			}
	}

	public static double add(double a, double b) {
		double temp = a + b;
		return temp;
	}

	public static double subtract(double a, double b) {
		double temp = a - b;
		return temp;
	}

	public static double multiply(double a, double b) {
		double temp = a * b;
		return temp;
	}

	public static double divide(double a, double b) {
		double temp = a / b;
		return temp;
	}

	public static long factorial(int a) {
		if (a <= 0 || a == 1) {
			return (1);
		} else {
			long temp = factorial(a - 1) * a;
			return temp;
		}
	}
	
	
}
