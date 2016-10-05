package package10_99;
import java.util.*;
public class Week1Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input the name: ");
		Scanner consolo = new Scanner(System.in);
		String name = consolo.nextLine();
		switch(name){
		case "bill":
			System.out.println("the name" + name + "is in the list");
			break;
		default:
			System.out.println("the name" + name + "is not in the list");
			
			
		}
		
	}

}
