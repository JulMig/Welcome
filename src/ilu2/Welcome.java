package ilu2;

public class Welcome {
	
	private static boolean inputEmpty(String input) {
		return input == null || input.isBlank();
		
	}
	
	public static String welcome(String input) {
		StringBuilder sb = new StringBuilder("Hello, ");
		if (inputEmpty(input))
			sb.append("my friend");
		else
			sb.append(input.substring(0, 1).toUpperCase() + input.substring(1));
		return sb.toString();		
	}
}
