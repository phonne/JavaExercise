package package10_99;

import java.util.*;;

public class Week1Exercise13 {
	// Random exercise
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please imput the number of random integers in range");
		Scanner consolo = new Scanner(System.in);
		int name1 = consolo.nextInt();
		System.out.println("Please imput the range");
		int name2 = consolo.nextInt();
		Random randomgenerator = new Random();
		for (int i = 0; i < name1; i++) {
			int randomint = randomgenerator.nextInt(name2);
			System.out.println("Generated: " + randomint);
		}
		System.out.println("Done");
	}

}
