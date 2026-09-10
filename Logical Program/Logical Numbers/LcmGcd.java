public class LcmGcd {

	public static void main(String[] args) {
		
		int n1 = 12;
		int n2 = 18;
		int num = Math.min(n1, n2);
		
		int gcd = 0;
		
		
		for (int i = 1; i <= num; i++) {
			if(n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		
		int lcm = (n1 * n2 )/gcd;
		
		System.out.println("Gcd :- "+gcd);
		System.out.println("Lcm :- "+lcm);
		
	}

}
