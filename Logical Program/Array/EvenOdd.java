import java.util.Arrays;

public class EvenOdd {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 1, 2, 3, 4, 56, 895, 86, 26, 96, 45, 23 };
        int e = 0;
        int o = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                e++;
            } else {
                o++;
            }
        }
        int[] even = new int[e];
        int[] odd = new int[o];
        int ev = 0;
        int od = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[ev] = arr[i];
                ev++;
            } else {
                odd[od] = arr[i];
                od++;
            }

        }
        System.out.println("Even number is :- " + Arrays.toString(even));
        System.out.println("odd number is :- " + Arrays.toString(odd));
    }

}
