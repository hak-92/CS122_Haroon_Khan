import java.util.Scanner;

public class wk6_lab3 {

	private static Scanner input;

	public static void main ( String [] args)

	  {
	  
		input = new Scanner (System.in);
		int computerNum;	
		computerNum = 0 + (int)(Math.random()*10);		
		
	//	int runs = 0;
		boolean result = true;
			
		while (result){
			
		System.out.println("Guess a number!");
	
		int num = input.nextInt();
		
		
			
		boolean larger = computerNum < num;
		boolean smaller = computerNum > num;
		boolean equal = computerNum == num;
		
		
	  
		if (larger)
		{	
			System.out.println("Your guess is too large!");
			
		}
	  
		if (smaller)
		{	
			System.out.println("Your guess is too small!");
			
		}
		
		if (equal)
		{	
			System.out.println("You got it!");
			//result =false;
		
		}
		
		System.out.println("Do you want to try again? (Y/N)");
		
		String answer = input.next();
		result = answer.equals("Y");
		
		
		
		
		}
		
	  }

}
