import java.util.Scanner;

public class Results {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Physics Mark: ");
	    int phys = input.nextInt();
	    
	    System.out.println("Enter Chemistry Mark: ");
	    int chem = input.nextInt();
	    
	    System.out.println("Enter Biology Mark: ");
	    int bio = input.nextInt();

		System.out.println("Physics Mark: " + phys);
		System.out.println("Chemistry Mark: " + chem);
		System.out.println("Biology Mark: " + bio);
		
		int total = ((phys+chem+bio)*100)/450;
		System.out.println("Total Percentage: " + total);
	}
}
