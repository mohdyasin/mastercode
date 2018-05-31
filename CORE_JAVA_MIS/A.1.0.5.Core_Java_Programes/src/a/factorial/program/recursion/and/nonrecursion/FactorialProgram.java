package a.factorial.program.recursion.and.nonrecursion;


public class FactorialProgram {
	public static int fact(int n) {
		System.out.println("Enter into method :: ");
		System.out.println("Value of n :: " + n);
		if(n == 1){
	        return 1;
	    }
		int factCall = fact(n-1);
		System.out.println("factCall :: " + factCall);
	    int results =  n * (factCall);
	    System.out.println("Results :: " +  results);
	    return results;
	}

	public static void main(String[] args) {
		System.out.println(fact(5));
		// prints "5 * 4 * 3 * 2 * 1"
	}
}
