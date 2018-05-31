package h.string.programs;

public class B_ReverseStringUsingRecursive {

	public static void main(String[] args) {
		B_ReverseStringUsingRecursive rsr = new B_ReverseStringUsingRecursive();
		String blogName = "java2blog";
		String reverse = rsr.recursiveReverse(blogName);
		System.out.println("Reverse of java2blog is:" + reverse);
	}

	public String recursiveReverse(String orig) {
		if (orig.length() == 1)
			return orig;
		else
			return orig.charAt(orig.length() - 1) + recursiveReverse(orig.substring(0, orig.length() - 1));

	}
}
