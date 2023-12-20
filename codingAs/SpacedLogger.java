package codingAs;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		// String message = "Hello";
		// String spacedMessage = String.join(" ", log.split(""));
		for (int x = 0; x < log.length(); x++) {
			System.out.print(log.charAt(x) + " ");
		} // end FOR
		System.out.println(); // added for carriage return after not using println
		} // end log


	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		// String message = "Hello";
		//String spacedMessage = String.join(" ", error.split(""));
		//System.out.println("ERROR: " + spacedMessage);
		System.out.print("ERROR: ");
		for (int x = 0; x < error.length(); x++) {
			System.out.print(error.charAt(x) + " ");
		} // end FOR
		System.out.println(); // added for carriage return after not using println
		} // end log

} // end of class
