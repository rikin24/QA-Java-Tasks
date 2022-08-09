
public class Flowcharts {

	//Task1:
	public static void Task1 (int A) {
		for (A=100; A<=200; A++) {
			System.out.println(A);
		}
	}
	
	//Task2:
	public static void Task2 (int A) {
		for (A=100; A<=200; A++) {
			if (A%2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	
	//Task3:
	public static void Task3 (int B) {
		for (B=1; B <=10; B++) {
			for (int i=1; i<=10; i++) {
				System.out.println(B);
			}
		}
	}
	
	//Task 5:
	public static void Task5 (int B) {
		for (B=1; B <=10; B++) {
			for (int i=1; i<=B; i++) {
				System.out.println(B);
			}
		}
	}
	
	public static void main(String[] args) {
		int A = 100;
		int B = 1;
		Task1(A);
		Task2(A);
		Task3(B);
		Task5(B);
	}

}
