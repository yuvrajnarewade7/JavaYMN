package feb24Assigments;

public class removeSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "The Way To Get Started Is To Quit Talking And Begin Doing";
		//int sentenceLength = sentence.length(); 
		//int i = 0; 
		System.out.println("Original Sentence: "+ sentence);
		//String sentencenew = sentence.replaceAll("\\s","");// using regex  
		
	   //	System.out.println(sentencenew);
		
		char[] chars = sentence.toCharArray();//convert sentence into character array
		//System.out.println(chars);
		char[] result = new char[chars.length]; //create a new character array to store characters set with no space
		int index =0; 
		
		for (int i =0; i<chars.length; i++) {
			//If the current character is not a space, it is added to the 'result' array at the current 'index' position and 'index' is incremented 
			if (chars[i] != ' ') { 
				result[index] = chars[i];
				index++; 
			}
			
		}
		new String (result, 0, index); //converts the result array to a String, starting from index 0 up to index - 1
		System.out.print("Sentence withoout space: ");
		System.out.println(result);
		}

}
