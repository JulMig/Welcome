package ilu2;

public class Welcome {
	
	private static boolean inputEmpty(String input) {
		return input == null || input.isBlank();
		
	}
	
	private static boolean inputMaj(String input) {
		return input.equals(input.toUpperCase());
	}
	
	private static String getLowerOutput(String input) {
			return input.substring(0, 1).toUpperCase() + input.substring(1);
		}

	
	public static String welcome(String input) {
		if (inputEmpty(input))
			return "Hello, my friend";
		
		StringBuilder sb = new StringBuilder();
		
		String[] noms = input.split(" ");
		
		if (noms.length == 2)
			sb.append("Hello, " + getLowerOutput(noms[0]) + ", " + getLowerOutput(noms[1]));
		else if (inputMaj(input))
			sb.append("HELLO, " + input + " !");
		else
			sb.append("Hello, " + getLowerOutput(input));

		return sb.toString();		
	}
}
