
public class SimpleArray {

	//Task1:
	public static void Task1 (int[] numbers) {
		for (int i=0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	//Task2:
		public static void Task2 (int[] numbers) {
			for (int i=0; i < numbers.length; i++) {
				numbers[i] *= 10;
				System.out.println(numbers[i]);
			}
		}
	
	
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Task1(numbers);
		Task2(numbers);
	}

}
