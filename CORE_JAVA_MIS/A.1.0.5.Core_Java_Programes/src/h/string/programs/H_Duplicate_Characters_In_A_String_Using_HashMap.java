package h.string.programs;

import java.util.HashMap;
import java.util.Map;

public class H_Duplicate_Characters_In_A_String_Using_HashMap {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String s = "Yasinn";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				int cnt = map.get(c);
				map.put(c, ++cnt);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
