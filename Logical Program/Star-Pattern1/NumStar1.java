    //       1
    //     1 2 1
    //   1 2 3 2 1
    // 1 2 3 4 3 2 1

public class NumStar1{
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n ; i++){
            int num = 1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2 * i-1; j++) {
                if(j<= (2*i-1)/2){
                    System.out.print(num);
                    num++;
                }else{
                    System.out.print(num);
                    num--;
                }
            }
            System.out.println();
        }
    }
}