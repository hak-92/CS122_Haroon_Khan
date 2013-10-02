import java.util.Scanner;

public class wk6_lab1 {

	private static Scanner input;

	public static void main ( String [] args)

	  {
	  
		input = new Scanner (System.in);
		int computerNum;	
		computerNum = 0 + (int)(Math.random()*10);		
		
		
		boolean result = true;
		
	
		
		
		while (result == true){
			
		System.out.println("Guess a number!");
	
		int num = input.nextInt();
			
		boolean larger = computerNum < num;
		boolean smaller = computerNum > num;
		boolean equal = computerNum == num;
		
		
	  
		if (larger)
		{	
			System.out.println("Your guess is too large! Try again!");
		}
	  
		if (smaller)
		{	
			System.out.println("Your guess is too small! Try again!");
		}
		
		if (equal)
		{	
			System.out.println("You got it! Good guess!");
			result =false;
		}
		}
	  }

}
