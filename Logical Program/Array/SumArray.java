public class SumArray {

	public static void main(String[] args) {
		
		int [] arr = {1, 5, 6, 9, 85, 99, 1};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("Sum of array is:- " + sum);
	}

}