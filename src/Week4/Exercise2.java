package Week4;

import java.util.*;

public class Exercise2  {

	private String[] sayings = null;

	public void setSayings(String[] a) {
		this.sayings = a;
	}

	public void speak() {
		Random rand = new Random();
		int max = this.sayings.length;
		int num = rand.nextInt(max);
		System.out.println(this.sayings[num]);
	}

	public static void main(String[] args) {
		Exercise2 r1 = new Exercise2();
		String[] u1 = { "Exterminate, Exterminate!", "I obey!", "You cannot escape.", "Robots do not feel fear.",
				"The Robots must survive!" };
		r1.setSayings(u1);
		System.out.println("\nRobot r1 says: ");
		for (int i = 0; i < 10; i++) {
			r1.speak();
		}

		
		Exercise2 r2 = new Exercise2();
		String[] u2 = { "I obey!" };
		r2.setSayings(u2);
		System.out.println("\nRobot r2 says: ");
		for (int i = 0; i < 10; i++) {
			r2.speak();
		}
	}

}
