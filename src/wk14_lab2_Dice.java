
public class wk14_lab2_Dice implements Runnable {
    int num;
    int m_counter;
    int Taskname;
    
    public  wk14_lab2_Dice(int name){
    	Taskname = name; 
    }
    
 public int counter(int counter){
	return m_counter = counter;
  }
  
  
@Override
public void run() {
	 num =  (int)( Math.random()*(6-1)) + 1;
     
	System.out.println("The dice number is " +num);
	System.out.println("The thread is " + Taskname);
}
		
}