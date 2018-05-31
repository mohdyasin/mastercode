package i.number.system;

public class A_DecimalToBinaryConversion {
	/*
	 * 25(Decimal) -> 11001 (binary)
	*/
	 public void printBinaryFormat(int number){
	        int binary[] = new int[25];
	        int index = 0;
	        while(number > 0){
	            binary[index++] = number%2;
	            number = number/2;
	        }
	        for(int i = index-1;i >= 0;i--){
	            System.out.print(binary[i]);
	        }
	    }
	    public static void main(String a[]){
	    	A_DecimalToBinaryConversion dtb = new A_DecimalToBinaryConversion();
	        dtb.printBinaryFormat(25);
	    }
}
