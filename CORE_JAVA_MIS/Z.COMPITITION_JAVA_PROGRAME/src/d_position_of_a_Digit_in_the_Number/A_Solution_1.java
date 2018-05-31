package d_position_of_a_Digit_in_the_Number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A_Solution_1 {
	public static void main(String[] args) {
		String str = "03248923789320";
		Pattern p = Pattern.compile("(0)");
		Matcher matcher = p.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.start(0));
		}
	}
}
