package assignment8_methods;

public class Question14 {

	public static void main(String[] args) {
		
threeLocks(true, false, true);
	}
	public static void threeLocks(boolean a, boolean b, boolean c) {
		
		if(a&&b==true || c==true) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
