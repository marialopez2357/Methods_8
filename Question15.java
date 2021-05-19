package assignment8_methods;

public class Question15 {

	public static void main(String[] args) {
	
		validateTask(true, 3, 6);

	}
	public static void validateTask(boolean b1, int currentId, int nextTask ) {
		
		
		if( b1==true && nextTask== currentId+1 ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
