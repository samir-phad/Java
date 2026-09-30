public class ParameterMethod {

    static void add(int a, int b) {
        int result = a + b;
        System.out.println("Sum = " + result);
    }

    public static void main(String[] args) {
        add(10, 20);
        add(50, 30);
    }
}
