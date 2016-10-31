package Week4;

import java.util.*;

public class Exercise3 {
	Calendar now = Calendar.getInstance();
	private int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;
	private String ccNumber;

	// make a constructor;
	public Exercise3(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ccNumber = ccNumber;
	}

	// INSTANCE METHODS
	// formats expiryDate
	public String formatExpiryDate() {
		String formDate = Integer.toString(expiryMonth) + "/" + Integer.toString(expiryYear).substring(2, 4);
		return formDate;
	}

	public String formatFullName() {
		String fullName = Character.toString(firstName.charAt(0)).toUpperCase() + firstName.substring(1) + " "
				+ Character.toString(lastName.charAt(0)).toUpperCase() + lastName.substring(1);
		return fullName;
	}

	public String formatccNumber() {
		StringBuilder sb = new StringBuilder();
		sb.append(ccNumber);
		int offset = 4;
		while (offset <= sb.length()) {
			sb.insert(offset, " ");
			offset += 5;
		}
		return sb.toString();
	}

	public boolean isValid() {
		int curMonth = now.get(Calendar.MONTH);
		int curYear = now.get(Calendar.YEAR);
		boolean valid = false;

		if (curYear <= this.expiryYear && curMonth < this.expiryMonth) {
			valid = true;
		}
		return valid;
	}

	// prints out account details
	public String toString() {
		return "Number: " + formatccNumber() + "Expiry Date: " + formatExpiryDate() + " Account holder: "
				+ formatFullName() + "  Is valid: " + isValid();
	}

}
