package feb24Assigments;

public class palindromeString {
	
	public static void main(String[] args) {
		
		String inputString = "civic";
		int stringLength = inputString.length();  //get the number of characters in the string
		int matchcount=0; 
		for (int i=0; i<(stringLength/2); i++){
			if (inputString.charAt(i)!=inputString.charAt(stringLength-i-1))
					{
						System.out.println("Not palindrome");
						break;
					}
			matchcount++;   	
		}
		if (matchcount == (stringLength/2))
			System.out.println("Palindrome");
		//System.out.println(stringLength);
				
	}

}
