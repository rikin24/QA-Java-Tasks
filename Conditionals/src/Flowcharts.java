import java.util.Scanner;

public class Flowcharts {
	
	//Task 1:
	public static int Params (int num1, int num2, boolean bl) {
		int result;
		if (bl == true) {
			result = num1+num2;
		} else {
			result = num1*num2;
		}
		return result;
	}
	
	//Task 2:
	
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter another number: ");
		int num2 = input.nextInt();
		
		boolean bl = false;
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter 'true' or 'false': ");
		String choice = input2.nextLine();
		
		if ((choice.equals("true")) || (choice.equals("true"))) {
			bl = true;
		} else if ((choice.equals("false")) || (choice.equals("False"))) {
			bl = false;
		} else {
			System.out.println("Invalid input");
		}
		
		System.out.println(Params(num1, num2, bl));
	}

}
