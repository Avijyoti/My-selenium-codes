package string;

import org.testng.annotations.Test;

public class LearnString {
	@Test
	public static void stringBasics(){
		/**
		 * String class to create and manipulate strings.
		 * 
		 * Methods
		 * 
		 * 0) toCharArray() //
		 * 1) length // find the number of characters		  
		 * 2) charAt(index) // The character at the index		  		  
		 * 3) indexOf(chr) , lastIndexOf(chr) // the index of the first or last match
		 * 4) concat //Concatenate two strings only  2+"Std"
		 * 5) toString() // Convert an existing data type to String
		 * 6) subString(beginIndex, endIndex) //Extracts a particular portion of String
		 * 7) trim // Removes the white space on begining and End
		 * 8) toLowerCase, toUpperCase // to convert case		  
		 * 9) split('char') -- split(regex, limit) //		 	  
		 * 10)startsWith(s), endsWith(s), contains(s) // match 
		 * 11)replace(oldChar, newChar), replaceAll(regex, replacement) // 
		 * 
		 * 12) String, StringBuffer(ThreadSafe), StringBuilder(Not ThreadSafe) 
		 */

		//String tryString = new Strin

		// Simplest way to create String
		String text = " testleaf "; //As literals
		System.out.println(text.length());

		char[] textOfChar = text.toCharArray();
		System.out.println(" using toCharArray : "+textOfChar.length);


		// Another way to create String
		char[] another = {'t','e','s','t','l','e','a','f'};
		String newText = new String(another);//Creating object

		// The String class has thirteen constructors that allow you to provide the 
		// initial value of the string using different sources

		// Length
		System.out.println("The length of the string is :"+text.length());

		// get the last character
		System.out.println("The last character is :"+text.charAt(text.length()-1));

		// concat
		System.out.println("The concatenation can be :"+text.concat("Chennai"));

		// Another way is using + to concatenate

		// convert to String -- applies to Integer, Double, Float, Boolean
		Integer value = 10;

		System.out.println(value.toString()); 
	
		System.out.println(Integer.toBinaryString(555));

		// SubString
		System.out.println("The first 4 character of Hexaware is : "+text.substring(0,4));

		// trim - removes white space
		System.out.println("Without white spaces on both end :"+text.trim());

		// to lowercase
		System.out.println("The text in lowercase is : "+text.toLowerCase());

		// split the string my delimiter
		String[] data = text.split("");
		System.out.println("The array size is : "+data.length);
		System.out.println("The second character is : "+data[1]);

		




		
		
		
		
		
		
		
	}	
}
