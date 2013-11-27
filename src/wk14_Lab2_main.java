import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class wk14_Lab2_main {
	
	public static void main(String[] args) {
		 
	//	wk14_lab2_Dice task = new wk14_lab2_Dice("task");
		 
		ExecutorService threadExecutor = Executors.newCachedThreadPool();
		
		System.out.println("Start");
		
		for (int i =0; i<=25; i++){
			wk14_lab2_Dice task = new wk14_lab2_Dice(i);
			threadExecutor.execute(task);	
			System.out.println("The thread is : " + task.counter(i));
		}
		threadExecutor.shutdown();
		
		System.out.println("Complete");
	}

}
