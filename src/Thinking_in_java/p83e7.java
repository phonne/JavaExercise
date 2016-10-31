package Thinking_in_java;

public class p83e7 {
public static void main(String args[]) {try{
int data=25/0;
System.out.println(data);
}
catch(ArithmeticException e){System.out.println(e);} 
	finally{
			System.out.println("finally block is alwaysexecuted");}
System.out.println("rest of the code...");
	}
}