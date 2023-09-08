import java.util.Scanner;
import java.util.Stack;

public class WithoutInbuiltFunc {

	public static String decimalToBinary(String decimalStr) {
		
		try {
			int decimalNum = Integer.parseInt(decimalStr);
			
		    Stack<Integer> st = new Stack<>();
		    
		    while(decimalNum > 0) {
		    	
		    	int rem = decimalNum % 2;
		    	st.push(rem);
		    	decimalNum = decimalNum/2;
		    }
		    
		    StringBuilder binaryStr = new StringBuilder();
		    
		    
		    while(!(st.isEmpty())) {
		    	binaryStr.append(st.pop().toString());
		    }
		    return binaryStr.toString();
		}
		catch(NumberFormatException nfe) {
			return nfe.getMessage();
		}
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("Enter a decimal number string");
		
		Scanner sc = new Scanner(System.in);
		String decimalStr = sc.next();
		String binaryStr = decimalToBinary(decimalStr);
		System.out.println("Binary value of " + decimalStr + " is " + binaryStr);
	}

}
