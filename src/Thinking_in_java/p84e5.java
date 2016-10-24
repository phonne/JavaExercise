package Thinking_in_java;

public class p84e5 {
public void bark (int i){
	System.out.println("barking");
}
public void bark (double k){
	System.out.println("howling");
}
public void bark (String f){
	System.out.println("eating");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		p84e5 dog = new p84e5();
		dog.bark("lala");
		dog.bark(1);
		dog.bark(1.1);
		
		
	}

}
/****************** Exercise 5 *****************
* Create a class called Dog with an overloaded
* bark() method. Your method should be
* overloaded based on various primitive data
* types, and should print different types of barking,
* howling, etc., depending on which overloaded
* version is called. Write a main() that calls
* * all the different versions.
***********************************************
*package initialization;
class Dog {
public void bark() {
System.out.println("Default bark!");
}
public void bark(int i) {
System.out.println("int bark = howl");
}
public void bark(double d) {
System.out.println("double bark = yip");
}
// Etc. ...
}
public class E05_OverloadedDog {
public static void main(String args[]) {
Dog dog = new Dog();
dog.bark();
dog.bark(1);
dog.bark(1.1);
}
} /* Output:
Default bark!
int bark = howl
double bark = yip
*///:~
