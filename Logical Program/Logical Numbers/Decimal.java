public class Decimal {

	public static void main(String[] args) {
		int n = 25;
		//int rev = 0;
		int binary = 0;
		String binary1=" ";
		System.out.println("Main Number :- "+n);
		while (n!=0) {
			int temp = n%2;
			binary1= temp+binary1;
			n = n/2;
		}
		System.out.println(binary1);
		
		/*
		 * while (rev !=0) { int tp = rev % 10; binary = binary * 10 + tp; rev = rev/10;
		 * }
		 * 
		 * System.out.println("Binary Number is :- "+binary);
		 */
	}

}
