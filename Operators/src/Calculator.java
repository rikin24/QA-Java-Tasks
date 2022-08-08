import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Enter a number: ");
	    int num1 = input.nextInt();
	    
	    System.out.println("Enter another number: ");
	    int num2 = input.nextInt();
	    
	    int sum = num1 + num2;
	    double division = num1/num2;
	    System.out.println("Sum: " + sum);
	    System.out.println("Multiplication: " + (num1*num2));
	    System.out.println("Subtration " + (num1-num2));
	    System.out.println("Division " + division);
	}
}
