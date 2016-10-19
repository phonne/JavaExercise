package Week3_study;

public class Basic_exercise1 {

	static class Face {
		public int id;
		public String eyecolor = "black";
		public String nosesize = "normal";// 声明三个变量
		private static int nextid = 1;// 为ID的产生声明一个递增的变量

		public static void main(String args[]) {
			// 采用一般方法来实例化类(产生两个对象)

			Face jim = new Face();

			jim.id = nextid++;

			jim.eyecolor = "blue";

			jim.nosesize = "big";
			Face hua = new Face();

			hua.id = nextid++;

			hua.eyecolor = "black";

			hua.nosesize = "small";// 采用一般方法定义两个对象
			System.out.println("jim\n\tID\t\t:\t" + jim.id + "\n\tEyeColor\t:\t" + jim.eyecolor + "\n\tNoseSize\t:\t"
					+ jim.nosesize);
			System.out.println("hua\n\tID\t\t:\t" + hua.id + "\n\tEyeColor\t:\t" + hua.eyecolor + "\n\tNoseSize\t:\t"
					+ hua.nosesize);

			// 显示两个对象的值
		}
	}

}
