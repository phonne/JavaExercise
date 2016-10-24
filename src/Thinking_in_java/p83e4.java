package Thinking_in_java;

public class p83e4 {
	public p83e4(){
	System.out.println("lalalala");	
	}
	public p83e4(String s){
		System.out.println("received:" + s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p83e4();
		new p83e4("Jiajiajiajia");
	}

}

/****************** Exercise 4 *****************
* Add an overloaded constructor to Exercise 3 that
* takes a String argument and prints it along with
* your message.
***********************************************
package initialization;
public class E04_OverloadedConstructor {
E04_OverloadedConstructor() {
System.out.println("Default constructor");
}
E04_OverloadedConstructor(String s) {
System.out.println("String arg constructor");
System.out.println(s);
}
public static void main(String args[]) {
// Call default version:
new E04_OverloadedConstructor();
// Call overloaded version:
new E04_OverloadedConstructor("Overloaded");
}
} /* Output:
Default constructor
String arg constructor
Overloaded
*///:~