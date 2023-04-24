package ilu2;

public class Welcome {
	private static String [] minName;
	private static String [] majName;
	
	private static boolean inputEmpty(String input) {
		return input == null || input.isBlank();
		
	}
	
	private static boolean inputMaj(String input) {
		return input.equals(input.toUpperCase());
	}
	
	private static String getLowerOutput(String input) {
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}

	private static String makeOutput(String [] nameList, int maj) {
		StringBuilder sb = new StringBuilder("Hello");
		if (nameList.length == 1)
			sb.append(", " + getLowerOutput(nameList[0]));
		else {
			for (int i = 0; i < nameList.length - 1; i++) {
				sb.append(", " + getLowerOutput(nameList[i]));
			}
			sb.append(" and " + getLowerOutput(nameList[nameList.length-1]));
		}
		
		if (maj == 1) {
			sb.append(" !");
			return sb.toString().toUpperCase();
		}
		return sb.toString();
	}
	
	private static void initMinMaxName(String [] listName) {
		int countMaj = 0;
		for(String name : listName)
			if (inputMaj(name))
				countMaj ++;
		
		minName = new String[listName.length-countMaj];
		majName = new String[countMaj];
		
		int min = 0;
		int maj = 0;
		
		for(String name : listName) {
			if(inputMaj(name)) {
				majName[maj] = name;
				maj++;
			} else {
				minName[min] = name;
				min++;
			}
		}
	}
	
	public static String welcome(String input) {
		if (inputEmpty(input))
			return "Hello, my friend";
		
		StringBuilder sb = new StringBuilder();
		
		String[] noms = input.split(",");
		
		initMinMaxName(noms);
		
		if (minName.length != 0) {
			sb.append(makeOutput(minName, 0));
			if (majName.length != 0) 
				sb.append(". AND ");
			else
				return sb.toString();
		}
		
		sb.append(makeOutput(majName, 1));
		
		return sb.toString();		
	}
}
