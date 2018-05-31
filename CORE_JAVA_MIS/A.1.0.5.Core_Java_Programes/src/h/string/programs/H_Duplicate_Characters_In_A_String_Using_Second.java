package h.string.programs;
public class H_Duplicate_Characters_In_A_String_Using_Second {
	public static void main(String[] args) {
		String input = "Yasinn";
		char process[] = input.toCharArray();
		boolean status = false;
		int index = 0;
		for (int i = 0; i < process.length; i++) {
			for (int j = 0; j < process.length; j++) {
				if (i == j) {
					continue;
				} else {
					if (process[i] == process[j]) {
						status = true;
						index = i;
						break;
					} else {
						status = false;

					}
				}
			}
			if (status) {
				System.out.print("" + process[index]);

			}
		}
	}
}
