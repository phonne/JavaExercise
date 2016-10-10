package package10_99;

public class Week1Exercise12 {
	public static void main(String[] args){
		System.out.println("Starting loop");
		for (int i = 0; i < 7;i++){
			System.out.println("in loop " + i);
			if (i == 2){
				continue;
				
			}
			System.out.println("survived first gurad");
			if (i == 4){
				break;
			}
			System.out.println("survived second gurad");
				
		}
			System.out.println("end loop or stop via break");
	}

}
