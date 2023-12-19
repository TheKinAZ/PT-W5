package codingAs;

public class AsteriskLogger implements Logger {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
        logger.log("");
        logger.error("");

	} // end of main

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		String message = "Hello";
		System.out.println("*** " + message + " ***");
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		String message = "Hello";
		System.out.println("********************");
		System.out.println("***" + " ERROR: " + message.toUpperCase() + (" ***"));
		System.out.println("********************");

	}
	
}  // end of class