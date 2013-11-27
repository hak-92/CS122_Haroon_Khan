import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class wk14_Lab3_main {
	
	public static void main(String[] args) {
		 
		wk14_lab3_array simple_array = new wk14_lab3_array(9);
		
		ExecutorService threadExecutor = Executors.newCachedThreadPool();
		
		wk14_lab3_Dice task1 = new wk14_lab3_Dice();
		wk14_lab3_Dice task2 = new wk14_lab3_Dice();
		wk14_lab3_Dice task3 = new wk14_lab3_Dice();
		
		wk14_lab3_writer writer = new wk14_lab3_writer(3, simple_array);
		System.out.println("Start");
		
		for (int i =0; i<=3; i++){
			
			
			threadExecutor.execute(writer);	
			//threadExecutor.execute(task2);	
			//threadExecutor.execute(task3);	
			
		}
		threadExecutor.shutdown();
		
		System.out.println("Complete");
	}

}
