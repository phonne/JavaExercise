package Week4;

import java.util.*;
import java.util.regex.Pattern;

public class DNAStrand {
	String dna = null;

	public DNAStrand(String dna) {
		this.dna = dna;
	}

	public boolean isVaild() {
		return Pattern.matches("[ATCG]+", dna);
	}

	public String complementWC() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < dna.length(); i++) {
			char a = dna.charAt(i);
			switch (a) {
			case 'A':
				sb.append("T");
				continue;
			case 'T':
				sb.append("A");
				continue;
			case 'C':
				sb.append("G");
				continue;
			case 'G':
				sb.append("C");
				continue;
			}

		}
		return sb.toString();
	}

	public String palindromeWC() {
		StringBuilder sb = new StringBuilder(complementWC());
		return sb.reverse().toString();
	}

	

	public boolean containsSequence(String seq) {
		return Pattern.matches("(.*)" + seq + "(.*)", dna);
	}
	/*
	 * public boolean containsSequence(String seq): Returns true if the DNA
	 * contains the subsequence seq.
	 */

	public String toString() {
		return new String(dna);
	}

}
