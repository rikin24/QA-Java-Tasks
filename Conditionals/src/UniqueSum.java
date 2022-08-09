
public class UniqueSum {

	public static int Input (int num1, int num2, int num3) {
		int sum = 0;
		
		if (num1 == num2) {
			num1 = 0;
			num2 = 0;
		} else if (num1 == num3) {
			num1 = 0;
			num3 = 0;
		} else if (num2 == num3) {
			num2 = 0;
			num3 = 0;
		}
		
		sum = num1 + num2 + num3;
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(Input(2, 2, 5));
		
	}

}
