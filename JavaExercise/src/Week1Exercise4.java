import java.util.*;
public class Week1Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your name: ");
		Scanner consolo = new Scanner (System.in);
		String name = consolo.nextLine();
		if (name.isEmpty()){
			System.out.println("Fine, don't tell your name. Goodbye!");
		}
		else if (name.length() < 2){
			System.out.println("Name is shorter than 2 characters!");
		}
		else
			System.out.println("Hello! I thought your name is: " + name + "!");
	}

}