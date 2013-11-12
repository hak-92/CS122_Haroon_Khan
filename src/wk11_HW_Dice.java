import javax.swing.JOptionPane;


public class wk11_HW_Dice {

	   
    int Dice_num;
    int num;
    int bounces;
    int Dice_amt;
    
   //Constructor
    //bounce_num is the number of bounces, this value comes from main
   public  wk11_HW_Dice (int dices)
   {
		
		// dices = Integer.parseInt(JOptionPane
			//	.showInputDialog("How many dice do you want to use?"));
		 
           Dice_amt = dices;
   }
   
   //Determines the value of the dice based on the number of bounces
   public int Throw()
   {
           JOptionPane.showMessageDialog(null,"The number of bounces are " + bounces);
                   
           //Min + (int)(Math.random() * ((Max - Min) + 1))
           int totalval =0;
           
           for (int i =0; i < Dice_amt; i++)
           {
                   
           
           if (bounces == 1 )
           {
                   totalval =  (int)( Math.random()*(6-1)) + 1;
           
                    
           }
           
           else 
           {
                   int num1 =0; 
                   for (int j=0; j <bounces; j++)
           {
                    num1 = num1 + (int)( Math.random()*(6-1)) + 1;
           }
                      totalval = (num1)/bounces;
           }         
           
           num = num +totalval;
                   
           }        
           
 return num;
   }

   public int Value()
   {
            Dice_num = num;
           return Dice_num;
           
   }

public void equals() {
	// TODO Auto-generated method stub
	
}
	
   

}
