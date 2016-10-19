package Week3_study;;

public class Basic_exercise1withconstructors {

	static class Face{
		 public int id ;
		 public String eyecolor = "black";
		 public String nosesize = "normal";
		 private static int nextid = 001;
		//构造器部分开始,它需要使用与类名相同的名字
		 Face(String faceeyecolor,String facenosesize){
			 id = nextid++;
			 eyecolor = faceeyecolor;
			 nosesize = facenosesize;
		 }
		 public static void main(String args[]){
			 Face jim = new Face("blue","big");
			 Face hua = new Face("black","smill");
			 System.out.println("jim\n\tID\t\t:\t" + jim.id + "\n\tEyeColor\t:\t" + jim.eyecolor + "\n\tNoseSize\t:\t"
						+ jim.nosesize);
				System.out.println("hua\n\tID\t\t:\t" + hua.id + "\n\tEyeColor\t:\t" + hua.eyecolor + "\n\tNoseSize\t:\t"
						+ hua.nosesize);
		 }
	}
	

}
