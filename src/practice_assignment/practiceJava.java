package practice_assignment;

public class practiceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome back");
		practiceJava o = new practiceJava();
		practiceJava.testing pr = o.new testing();
		pr.testingIt();
		System.out.println("Working with everything");
	}
	private class testing{
		void testingIt() {
			System.out.println("testing the inner classes");
		}
		
	}

}
