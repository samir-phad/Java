public class SwapTwo {
    public static void main(String[] args) {
        int a = 70;
        int b = 20;

        System.out.println("Before Swap a = "+a);
        System.out.println("Before Swap b = "+b);

        a = a - b;
		b = a + b;
		a = b - a;

        System.out.println("After swap a = " + a);
        System.out.println("After swap b = "+b);
    }
}
