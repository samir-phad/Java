//       *
//       * 
//       * 
// * * * * * * *
//       *
//       * 
//       * 


public class Star14 {
    public static void main(String[] args) {
        int n =4;
        for (int i = 1; i <n * 2; i++) {
            for (int j = 1; j < 2*n; j++) {
                
                if(i == n || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
