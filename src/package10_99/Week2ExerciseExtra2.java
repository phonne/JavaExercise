package package10_99;
import java.util.*;
public class Week2ExerciseExtra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many students you want register: ");
		Scanner consolo = new Scanner(System.in);
		int numberOfName = consolo.nextInt();
		consolo.nextLine();
		String[] nameList = new String[numberOfName];
		for (int i = 0; i < numberOfName; i++){
			System.out.println("input the name" + (i+1) + ": ");
			nameList[i]=consolo.nextLine();
		}
		System.out.println("the name is:");
		for (String s:nameList){
			System.out.println(s);
		}
	}

}
