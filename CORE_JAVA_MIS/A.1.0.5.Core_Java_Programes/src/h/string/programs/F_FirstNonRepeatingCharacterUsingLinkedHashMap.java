package h.string.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * Find first non repeated character in a String
 * 
 * One of the interview question is “How will you find first non repeating
 * character in String.” For example: If input string is “analogy”, then program
 * should return ‘n’ If input string is “easiest”, then program should return
 * ‘a’ First approach: We will use LinkedHashMap to find first non repeating
 * character in String.
 * 
 * Algorithm:
 * 
 * Get character while looping over String Put this character in LinkedHashMap
 * with count. If character is already there, increase count by 1. Get count
 * from LinkedHashMap while iterating. If count is 1,return that character as
 * LinkedHashMap maintains insertion order.
 *
 */
public class F_FirstNonRepeatingCharacterUsingLinkedHashMap {

	public static void main(String[] args) {
		System.out
				.println("First non repeated character for String analogy is : " + getNonRepeatedCharacter("analogy"));
		System.out
				.println("First non repeated character for String easiest is : " + getNonRepeatedCharacter("easiest"));
	}

	public static Character getNonRepeatedCharacter(String str) {
		Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length() - 1; i++) {
			Character c = str.charAt(i);
			if (!countCharacters.containsKey(c)) {
				countCharacters.put(c, 1);
			} else {
				countCharacters.put(c, countCharacters.get(c) + 1);
			}
		}
		// As LinkedHashMap maintains insertion order, first character with
		// count 1 should return first non repeated character
		for (Entry<Character, Integer> e : countCharacters.entrySet()) {
			if (e.getValue() == 1)
				return e.getKey();

		}
		return null;

	}
}
