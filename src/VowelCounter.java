//Exercise #3
import java.util.Scanner;
import java.util.ArrayList;

public class VowelCounter 
{

	public static void main(String[] args) 
	{
		String inputString;
		int aNum = 0, eNum = 0, iNum = 0, oNum = 0, uNum = 0;
		int nonVowelNum = 0;
		char aChar = 'a', eChar = 'e', iChar = 'i', oChar = 'o', uChar = 'u';
		//ArrayList<String> letters = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
	
		// Prompt the user to enter some inputs
		System.out.println("Greeting! What can I do for you today? ");
		inputString = scan.nextLine();
		
		// Determine the number of vowels and non vowels

		for (int i = 0; i < inputString.length(); i++)
		{
			//char letter = inputString.charAt(i); 
			if(inputString.charAt(i) == 'a')
				aNum++;
			else if(inputString.charAt(i) == 'e')
				eNum++;
			else if(inputString.charAt(i) == 'i')
				iNum++;
			else if(inputString.charAt(i) == 'o')
				oNum++;
			else if(inputString.charAt(i) == 'u')
				uNum++;
			else if(inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z')
				nonVowelNum++;
		}
		System.out.println("Total number of lower case \"a\" is : " + aNum);
		System.out.println("Total number of lower case \"e\" is : " + eNum);
		System.out.println("Total number of lower case \"i\" is : " + iNum);
		System.out.println("Total Number of lower case \"o\" is : " + oNum);
		System.out.println("Total Number of lower case \"u\" is : " + uNum);

		System.out.println("Total Number of non-vowel characters is : " + nonVowelNum);
	}

}
