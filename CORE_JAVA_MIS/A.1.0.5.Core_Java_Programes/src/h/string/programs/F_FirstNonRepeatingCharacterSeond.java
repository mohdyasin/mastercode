package h.string.programs;
/**

Algorithm:
Iterate through each character of string.
If lastIndexOf and indexOf return same value, then it is first non repeating character in the String.
 *
 */
public class F_FirstNonRepeatingCharacterSeond {

	public static void main(String[] args) {
		System.out
				.println("First non repeated character for String analogy is : " + getNonRepeatedCharacter("analogy"));
		System.out
				.println("First non repeated character for String easiest is : " + getNonRepeatedCharacter("easiest"));
	}

	public static Character getNonRepeatedCharacter(String str) {
		char charaaray[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (str.lastIndexOf(charaaray[i]) == str.indexOf(charaaray[i]))
				return charaaray[i];
		}
		return null;
	}
}
