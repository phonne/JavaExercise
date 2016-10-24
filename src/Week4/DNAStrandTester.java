package Week4;
import java.util.Scanner;

public class DNAStrandTester {

	public static void summarise(DNAStrand dna) {
		System.out.println("Original DNA Sequence: " + dna);

		if (dna.isVaild()) {
			System.out.println("Is valid");
			System.out.println("Complement: " + dna.complementWC());
			System.out.println("WC Palindrome: " + dna.palindromeWC());
		} else {
			System.out.println("Not Valid DNA");
		}
	}

	public static void main(String[] args){
		// creates Scanner object & asks user for input
		System.out.println("Please input");
		Scanner sc = new Scanner(System.in);
		String dnaInput = sc.nextLine();

		DNAStrand dna = new DNAStrand(dnaInput);
		summarise(dna);
		
		System.out.println("Sequence 'AT' is contained in dna: " + dna.containsSequence("AT"));
		
	}
	
	
	
}