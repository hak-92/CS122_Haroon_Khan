import javax.swing.JOptionPane;


public class wk14_lab1_Dice implements Runnable {

	   
    int Dice_num;
    int num;
    int counter;
    
  wk14_lab1_Dice(int counter){
	  this.counter = counter;
  }
@Override
public void run() {
	 num =  (int)( Math.random()*(6-1)) + 1;
     
	System.out.println("The dice number is " +num);
}
		
}