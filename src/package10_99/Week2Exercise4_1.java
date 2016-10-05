package package10_99;
import java.util.*;
public class Week2Exercise4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner consolo = new Scanner(System.in);
			System.out.println("Convert to: ");
			String toUnit = consolo.nextLine();
			System.out.println("Value: ");
			double value = consolo.nextDouble();
			switch (toUnit){
			case "B":
				double toB_Answer = Week2Exercise4_method.toB(value);
				System.out.println("byte convert to byte is: " + toB_Answer + "byte");
				break;
			case "KB":
				double toKB_Answer = Week2Exercise4_method.toKB(value);
				System.out.println("byte convert to KB is: " + toKB_Answer + "KB");
				break;
			case "MB":
				double toMB_Answer = Week2Exercise4_method.toMB(value);
				System.out.println("byte convert to MB is: " + toMB_Answer + "MB");
				break;
			case "GB":
				double toGB_Answer = Week2Exercise4_method.toGB(value);
				System.out.println("byte convert to GB is: " + toGB_Answer + "GB");
				break;
			}
		}


	}

