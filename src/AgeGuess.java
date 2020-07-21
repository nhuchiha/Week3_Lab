// Exercise #1
import java.util.Scanner;
import java.util.Random;
public class AgeGuess {
	
	public static void main(String[] args) {
		//Declare and initialize variables
		int ageGuess = 0;
		int age;

		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		// Generate the random number from 0 to 100
		age = generator.nextInt(101);
		System.out.println("The correct age is " + age + ".");
		// User input
		while (ageGuess != age)
		{
			//Prompt the user to enter the age
			System.out.print("Please enter the right age: ");
			ageGuess = scan.nextInt();		
		}
		System.out.println("You got it.");
	}

}
