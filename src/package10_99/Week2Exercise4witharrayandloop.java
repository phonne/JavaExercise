package package10_99;

import java.util.ArrayList;
import java.util.Scanner;

public class Week2Exercise4witharrayandloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String [] UNITS = {"B", "KB", "MB", "GB"};
		ArrayList<Double> list = new ArrayList<Double>();
		System.out.println("input the value with byte UNIT: ");
		Scanner consolo = new Scanner(System.in);
		double bvalue = consolo.nextDouble();
		for (int k = 0; k < 4; k++) {
			list.add((bvalue/Math.pow(1024, k)));
		}
		for (int i = 0; i < list.size(); i++){
		System.out.print(list.get(i) + UNITS[i] + ",  ");
//		System.out.println(UNITS);
		}
//	
//            }
		}

}
