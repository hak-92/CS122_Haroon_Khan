import java.util.Random;


public class wk14_lab3_array {
	
	private final int[] array;
	private int index;
	private final static Random generator = new Random();
	
	public wk14_lab3_array (int size){
		
		array = new int[size];
	}
	
	public synchronized void add(int value){
		
		int position = index;
		
		try {
			Thread.sleep(generator.nextInt(500));
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		array[position] = value;
		
		System.out.println(Thread.currentThread().getName()+ "wrote " +  array[position] + " to element " + position);
		index++;
	}
	

}
