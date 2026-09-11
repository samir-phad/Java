import java.util.Scanner;

public class InRangeArm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number :- ");
		int num = sc.nextInt();
		System.out.println("Enter 2nd Number :- ");
		int num2 = sc.nextInt();

		for (int i = num; i <= num2; i++) {

			int org = i;
			int arm = 0;
			while (org != 0) {
				int target = org % 10;
				int temp = target * target * target;
				arm = arm + temp;
				org = org / 10;
			}
			if (arm == i) {
				System.out.println(i);
			}
		}

	}

}
