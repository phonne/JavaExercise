package Week4;
public class Exercise3_test {
public static void main(String[] args){
	Exercise3 cc1 = new Exercise3 (10, 2016, "haiwei", "zuo", "447422938286");
	System.out.println(cc1.formatExpiryDate());
	System.out.println(cc1.formatFullName());
	System.out.println(cc1.formatccNumber());
	System.out.println(cc1.isValid());
	System.out.println(cc1.toString());
}
}

