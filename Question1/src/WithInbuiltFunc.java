import java.util.Scanner;

public class WithInbuiltFunc {

	public static String decimalToBinary(String decimalStr) {
		
		try {
			
			int decimalNum = Integer.parseInt(decimalStr);
			
			return Integer.toBinaryString(decimalNum);
		}
		catch(NumberFormatException nfe) {
			return nfe.getMessage();
			
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a decimal number string");
		
		Scanner sc = new Scanner(System.in);
		String decimalStr = sc.next();
		String binaryStr = decimalToBinary(decimalStr);
		System.out.println("Binary value of " + decimalStr + " is " + binaryStr);
		
	}
}
