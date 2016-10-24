package Thinking_in_java;

public class p83e6 {
public void bark (int i,double k){
	System.out.println("barking");
}
public void bark (double k,int i){
	System.out.println("howling");
}
public void bark (String f,double k){
	System.out.println("eating");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p83e6 jiajia = new p83e6();
		jiajia.bark(1.0, 1);
		jiajia.bark(1, 1.0);
	
		
		
	}

}
