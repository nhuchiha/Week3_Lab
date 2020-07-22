
public class Box 
{
	private static int size = 0;
	
	public static void main(String[] args) 
	{		
		// Create new Box object
		Box starBox = new Box();
		starBox.size = 5;
		
		// Invoke printBox method
		printBox();
		
	}
	// Create the printBox method
	public static void printBox()
	{
		for (int i = 0; i < size; i++)
		{
			for (int j = 1; j < size; j++)
			{
				System.out.print("*");
			}
			System.out.print("*");
			System.out.println();
		}
	}
}
