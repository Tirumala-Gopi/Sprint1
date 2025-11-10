package collections;

	import java.util.HashMap;
	import java.util.Map;

public class three {

	    public static Map<Character, Integer> countLetters(String text) {
	        // Create an empty HashMap to store letter counts
	        Map<Character, Integer> letterCounts = new HashMap<>();

	        // Convert the string to uppercase so 'h' and 'H' are treated the same
	        text = text.toUpperCase();

	        // Loop through each character in the string
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);

	            // ✅ Ignore spaces (and you can expand this to ignore punctuation if needed)
	            if (ch == ' ') {
	                continue;
	            }

	            // Optionally ignore all non-letters:
	            // if (!Character.isLetter(ch)) continue;

	            // If the character already exists in the map, increment its count
	            if (letterCounts.containsKey(ch)) {
	                letterCounts.put(ch, letterCounts.get(ch) + 1);
	            } else {
	                // Otherwise, add it with a count of 1
	                letterCounts.put(ch, 1);
	            }
	        }

	        // Return the final map
	        return letterCounts;
	    }

	    // Main method to test the logic
	    public static void main(String[] args) {
	        String input = "Tirumala Gopi";
	        Map<Character, Integer> result = countLetters(input);

	        // Print results
	        System.out.println("Letter counts for: " + input);
	        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }
	    }
	}


	
	
	
	

