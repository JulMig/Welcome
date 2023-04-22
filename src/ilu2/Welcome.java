package ilu2;

public class Welcome {
	
	private static boolean inputEmpty(String input) {
		return input == null || input.isBlank();
		
	}
	
	private static boolean inputMaj(String input) {
		return input.equals(input.toUpperCase());
	}
	
	private static String getLowerOutput(String input) {
		if (inputEmpty(input))
			return "my friend";
		else
			return input.substring(0, 1).toUpperCase() + input.substring(1);
		}

	
	public static String welcome(String input) {
		StringBuilder sb = new StringBuilder();
		
		if (!inputEmpty(input) && inputMaj(input))
			sb.append("HELLO, " + input + " !");
		else
			sb.append("Hello, " + getLowerOutput(input));

		return sb.toString();		
	}
}
