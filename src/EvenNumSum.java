//Exercise #2
import java.util.Scanner;
public class EvenNumSum 
{

	public static void main(String[] args) 
	{
		//Declare the input variable
		int inputNum = 0;
		int sumNum = 0;
		int evenNum = 0;
		Scanner scan = new Scanner(System.in);
		
		// User input
		while (inputNum < 2)
		{
			System.out.print("Please enter a number equal or greater than 2: ");
			inputNum = scan.nextInt();	
			if (inputNum < 2)
				System.out.println("Wrong Number!");
		}
		
		// Find the total number of even number between 2 and input Number
		evenNum = inputNum/2;

		// Calculate the sum
		for (int j = 0; j <= evenNum; j++)
		{
			sumNum += 2*j;
		}
		
		//Display the sum
		System.out.println("The sum of all even integers between 2 and " + inputNum
							+ " : " + sumNum);
	}

}


// enter the number
// find the even numbers between 2 and this number
// if number < 2 then flag "Wrong number, please enter another number: "