import java.util.Scanner;

public class ResultsV2 {
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
		
		double physTotal = (phys*100)/450;
		double chemTotal = (phys*100)/450;
		double bioTotal = (phys*100)/450;
		
		double total = physTotal + chemTotal + bioTotal;
		
		System.out.println("Physics Percentage: " + physTotal + "%");
		System.out.println("Chemistry Percentage: " + chemTotal + "%");
		System.out.println("Biology Percentage: " + bioTotal + "%");
		
		if (total < 60) {
			System.out.println("You have failed overall");
		} else if (physTotal < 60) {
			System.out.println("You have failed Physics");	
		} else if (chemTotal < 60) {
			System.out.println("You have failed Chemistry");	
		} else if (bioTotal < 60) {
			System.out.println("You have failed Biology");	
		} else {
			System.out.println("You have passed");
		}
	}
}
