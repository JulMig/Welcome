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
		
		String[] noms = input.split(",");
		
		StringBuilder sbMin  = new StringBuilder();
		StringBuilder sbMax = new StringBuilder();
		
		for(String nom : noms) {
			if (inputMaj(nom))
				sbMax.append(", " + nom);
			else
				sbMin.append(", " + getLowerOutput(nom));
		}
		
		if (sbMin.length() != 0) {
			sb.append("Hello" + sbMin.toString());
			if (sbMax.length() != 0) 
				sb.append(". AND ");
			else
				return sb.toString();
		}
		
		sb.append("HELLO" + sbMax.toString() + " !");
		
		return sb.toString();		
	}
}
