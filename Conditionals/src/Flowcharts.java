import java.util.Scanner;

public class Flowcharts {
	
	//Task 1:
	public static int Task1 (int num1, int num2, boolean bl) {
		int result;
		if (bl == true) {
			result = num1+num2;
		} else {
			result = num1*num2;
		}
		return result;
	}
	
	//Task 2:
	public static String Task2 (int A) {
		String output;
		if (A > 2000) {
			output = "A";
			if (A > 6000) {
				output = "C";
			} else {
				output = "B";
				if (A > 4000) {
					output = "D";
				} else {
					output = "E";
				}
			}
		} else {
			output = "1";
			if (A > 100) {
				output = "3";
				if (A > 600) {
					output = "5";
				} else {
					output = "4";
					if (A > 500) {
						output = "6";
					} else {
						output = "7";
					}
				}
			} else {
				output = "2";
			}
		}
		return output;
	}
	
	
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
		
		System.out.println("Task1: ");
		System.out.println(Task1(num1, num2, bl));
		
		
		System.out.println("Task 2: ");
		System.out.println(Task2(2500));
		
	}

}
