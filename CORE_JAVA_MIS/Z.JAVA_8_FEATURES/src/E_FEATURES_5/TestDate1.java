package E_FEATURES_5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDate1 {
	public static void main(String[] args) {

		// Get current date time
		LocalDateTime now = LocalDateTime.now();

		System.out.println("Before : " + now);
		String date = "20181010101010";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(date);

		String formatDateTime = now.format(formatter);

		System.out.println("After : " + formatDateTime);

	}
}
