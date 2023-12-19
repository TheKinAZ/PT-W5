package codingAs;

public class SpacedLogger  implements Logger {

	public static void main(String[] args) {
        Logger logger = new SpacedLogger();
        logger.log("");
        logger.error("");

	} // end of main

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		String message = "Hello";
		String spacedMessage = String.join(" ", message.split(""));
		System.out.println(spacedMessage);
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		String message = "Hello";
		String spacedMessage = String.join(" ", message.split(""));
		System.out.println("ERROR: " + spacedMessage);
	}

} // end of class
