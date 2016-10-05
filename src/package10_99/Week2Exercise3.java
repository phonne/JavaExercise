package package10_99;

public class Week2Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int[20];
		int x = 1;
		for (x=1; x<21; x++) {
			numbers[0] = 1;
			System.out.println("the array is: " + numbers[x-1] + "\n");
			numbers[x] = 2 * numbers[x - 1];
		
		}
		
		System.out.println(numbers[0]);
		int mean[] = new int [21];
		int j = 1;
		for (j = 1; j<20; j++){
			mean [j] = (numbers[j-1] + numbers[j])/2;
			System.out.println("the array is " + mean[j]);
		}
		System.out.println(numbers[19]);

	}

}
