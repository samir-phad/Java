// 1 1 1 1 1 1 1
// 1 2 2 2 2 2 1
// 1 2 3 3 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 3 3 2 1 
// 1 2 2 2 2 2 1
// 1 1 1 1 1 1 1

// Here we did not no n

import java.util.*;

public class NumberStar1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i <= j && i <= n - j + 1 && i <= n - i + 1) {
                    System.out.print(i + " ");
                }
                else if (j <= i && j <= n - i + 1 && j <= n - j + 1) {
                    System.out.print(j + " ");
                }
                else if (n - i + 1 <= j && n - i + 1 <= i && n - i + 1 <= n - j + 1) {
                    System.out.print(n - i + 1 + " ");
                }
                else {
                    System.out.print(n - j + 1 + " ");
                }
            }
            System.out.println();
        }
    }
}
