
public class wk14_lab3_writer implements Runnable {

	private final wk14_lab3_array simple_array;
	private final int startValue;
	
	public wk14_lab3_writer(int value, wk14_lab3_array array){
		startValue = value;
		simple_array = array;
	}
	@Override
	public void run() {
		for (int i = startValue; i < startValue +3; i++){
			simple_array.add(i);
		}
		
	}

}
