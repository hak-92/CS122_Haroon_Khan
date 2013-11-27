
public class wk14_Lab1_main {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		for (int i =0; i<=25; i++){
			Runnable T1 = new wk14_lab1_Dice(i); // i tells the class the thread #
			Thread worker = new Thread(T1);
			
			worker.setName("The thread number is " + i);
			System.out.println(worker.getName());
			worker.start();
			
			
		}
		System.out.println("Complete");
	}

}
