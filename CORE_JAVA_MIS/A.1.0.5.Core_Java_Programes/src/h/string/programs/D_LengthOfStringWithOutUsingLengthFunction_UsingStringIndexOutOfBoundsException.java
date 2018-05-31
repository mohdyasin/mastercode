package h.string.programs;

public class D_LengthOfStringWithOutUsingLengthFunction_UsingStringIndexOutOfBoundsException {

	public static void main(String args[]) {

		String helloWorld = "This is hello world";
		System.out.println("length of helloWorld string :" + getLengthOfString(helloWorld));

	}

	public static int getLengthOfString(String str) {
		int i = 0;
		try {
			for (i = 0;; i++) {
				str.charAt(i);
			}

		} catch (Exception e) {

		}
		return i;
	}

}
