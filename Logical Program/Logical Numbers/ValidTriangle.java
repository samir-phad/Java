public class ValidTriangle {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}