import java.util.*;

public class Week1Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please imput name: ");
		Scanner consolo = new Scanner(System.in);
		String name1 = consolo.nextLine();
		
		switch (name1) {
		case "Bill":
			System.out.println("your name is in the list!");
			break;
		case "Mike":
			System.out.println("your name is in the list!");
			break;
		case "Harvey":
			System.out.println("your name is in the list!");
			break;
		case "Yuri":
			System.out.println("your name is in the list!");
		default:
			System.out.println("your name is not in the list!");
		}
	}

}
