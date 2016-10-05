package package10_99;

public class Week2Exercise4_method {
	public static double toB (double value){
		double result = value;
		return result;
	}
	public static double toKB (double value){
		double result = value/1024;
		return result;
	}
	public static double toMB (double value){
		double result = (value/1024)/1024;
		return result;
	}
	public static double toGB (double value){
		double result = ((value/1024)/1024)/1024;
		return result;
		
	}
	    
}
