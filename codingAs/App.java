package codingAs;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger1 = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();

		logger1.error("Damage");
		logger1.log("Control");
		logger2.error("Damage");
		logger2.log("Control");

	}

}
