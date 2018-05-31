package h.string.programs;

public class B_ReverseStringUsingForLoop {

	public static void main(String[] args) {
		String blogName = "java2blog";
		String reverse = "";
		for (int i = blogName.length() - 1; i >= 0; i--) {
			reverse = reverse + blogName.charAt(i);
		}
		System.out.println("Reverse of java2blog is:" + reverse);
	}
}
