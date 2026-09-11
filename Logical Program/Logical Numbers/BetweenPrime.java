import java.util.Scanner;

public class BetweenPrime {

	public static void main(String[] args) {
		
		System.out.print("Enter First number :- ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter Second number :- ");
		int num2 = sc.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			int count = 0;
			for (int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}

	}

}