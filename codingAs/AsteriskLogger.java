package codingAs;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		//String message = "Hello";
		System.out.println("*** " + log + " ***");
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		//String message = "Hello";
		System.out.println("*********************");
		System.out.println("***" + " ERROR: " + error.toUpperCase() + (" ***"));
		System.out.println("*********************");

	}
	
}  // end of class