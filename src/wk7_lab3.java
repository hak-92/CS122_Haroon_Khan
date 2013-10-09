import javax.swing.JOptionPane;


public class wk7_lab3 {

	public static void main ( String [] args)

	  {
		int [] vals = new int [6];
		
		vals[0]=123;
		vals[1]=456;
		vals[2]=479;
		vals[3]=135;
		vals[4]=246;
		vals[5]=135;
		
		int sum =0;
		float avg = 0;
		
		JOptionPane.showMessageDialog(null, "The values in the array are:");
		for (int i =0; i <=5; i++)
		{
			
			JOptionPane.showMessageDialog(null, vals[i]);
			
			sum += vals[i];
			
		}
		
		
		avg = sum/6;
		
		JOptionPane.showMessageDialog(null, "The average of these values is: " + avg);
		
	  }
}
