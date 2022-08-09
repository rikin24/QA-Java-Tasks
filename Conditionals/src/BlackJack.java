
public class BlackJack {

	public static int Play (int num1, int num2) {
		int output = 0;
		if (num1 <= 21)	{
			if (num2 <= 21) {
				if (num1 > num2) {
					output = num1;
				} else if (num2 > num1) {
					output = num2;
				}
			} else {
				output = num1;
			}
		} else if (num2 <= 21) {
			output = num2;
		} else {
			output = 0;
		}
			
		return output;
	}
	
	public static void main(String[] args) {
		
		int num1 = 18;
	    int num2 = 24;
	    System.out.println(Play(num1, num2));
		
	}

}
