package Week3_study;

public class Exercise2 {
	public static void main(String[] args) {
		String[] arr = { "The ", "quick ", "brown ", "fox ", "jumps ", "over ", "the ", "lazy ", "dog." };
		String[] out = remElement(arr, 7);
		for (int n = 0; n < out.length; n++) {
			System.out.print(out[n]);
		}
	}
	// Removes an element from an array.
	public static String[] remElement(String[] array, int i) {
		String[] arr2 = new String[array.length - 1];
		int j = 0;
		for (int n = 0; n < arr2.length; n++) {
			if (n < i) {
				arr2[n] = array[n];
			} else {
				arr2[n] = array[n + 1];
			}
		}
		return arr2;
	}
}