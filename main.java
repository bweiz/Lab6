import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("inhash.txt"));
			String line;
			
			while ((line = br.readLine()) != null) {
				boolean un = isUnique(line);
				String unChars = getUnique(line);
				System.out.println(line + " " + un + " " + unChars);
			}
			
			br.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean isUnique(String word) {
		HashMap<Character, Boolean> wordMap = new HashMap<>();				
		
		for (char l : word.toCharArray()) {									
			if (wordMap.containsKey(l)) {									// Check for uniqueness
				return false;
			}
			wordMap.put(l, true);											// Input character to HashMap with true value
		}
		return true;														// All characters unique
	}
	
	private static String getUnique(String word) {							// Input String
		HashMap<Character, Boolean> wordMap = new HashMap<>();				// Hashmap with character as key, and boolean as value
		StringBuilder unChars = new StringBuilder();						
		
		for (char l : word.toCharArray()) {									// Put characters of given string into character array
			if (wordMap.containsKey(l)) {									
				wordMap.put(l, false);										// If repeat character, set value to false
			}
			else {wordMap.put(l, true);}
		}
		
		for (char l : wordMap.keySet()) {									// Iterate through array, find unique characters and add to string
			if (wordMap.get(l) == true) {
				unChars.append(l);
			}
		}
		
		return unChars.toString();
	}
	
	
}


