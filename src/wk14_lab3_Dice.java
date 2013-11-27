
public class wk14_lab3_Dice implements Runnable {
	
    int num;
    int m_counter;
    int Taskname;
    int dice_num;
    
    wk14_lab3_array simple_array = new wk14_lab3_array(9);
   /* 
    public  wk14_lab3_Dice(int name){
    
    	Taskname=name;
    }
    */
 public int counter(int counter){
	return m_counter = counter;
  }
  
  
@Override
public  void run() {
	
	
	  num =  (int)( Math.random()*(6-1)) + 1;
     
	//  simple_array.add(num);
	//System.out.println(Taskname + " threw " + num);
	
	}


		
}
