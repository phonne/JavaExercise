package package10_99;

import java.util.*;

public class Week1Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Please in put the count");
	Scanner consolo = new Scanner(System.in);
	int count =  consolo.nextInt();
	int i = 0;
	while(i<count){
		System.out.println("Hello world! with while loop");
		i++;
	}
	
	int j = 0;
	do{
		System.out.println("Hello world! with do while loop");
		j++;
	}while (j<count);
	
	for (int k = 0; k<count;k++){
		System.out.println("Hello world! with for loop");
	}
	
	}

}