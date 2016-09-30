import java.util.*;
public class Week1Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input word1");
		Scanner consolo = new Scanner(System.in);
		String word1 = consolo.nextLine();
		System.out.println("Please input word2");
		String word2 = consolo.nextLine();
		System.out.println("string compare word1 to word2 is: " + word1.compareTo(word2));
	}

}
