//       1
//     1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1 

public class NumStar{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {

            // 1. Spaces
            for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
            }

            // 2. Increasing numbers
            for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
            }

            // 3. Decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
            System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}