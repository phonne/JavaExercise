import java.util.*;
public class Week1Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int counter = 0; counter < 10; counter++){
			System.out.println("message" + (counter+1));
		}
		for (int counter2 =9; counter2 >= 0; counter2=counter2-1){
			System.out.println("message" + (counter2));
		}
		int counter3 = 0;
		while (counter3 < 10){
			System.out.println("3message" + counter3);
			++counter3;
		}
	}

}