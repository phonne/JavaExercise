package Week4;

public class Exercise3_test {
	public class Plane {
		public void maxSpeed() {
			System.out.println("Max speed is 570 mph");
		}
	}

	class SRBlackbird extends Plane {

		public void maxSpeed() {
			System.out.println("Max speed is 1000 mph");
		}
	}

	public class PlaneTester {
		public void main(String[] args) {
			SRBlackbird sr = new SRBlackbird();
			sr.maxSpeed();
		}
	}
}
