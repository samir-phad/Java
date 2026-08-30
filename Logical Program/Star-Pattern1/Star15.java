// *     * * * * 
// *     *       
// *     *       
// * * * * * * * 
//       *     * 
//       *     * 
// * * * *     * 


public class Star15 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <n * 2; i++) {
            for (int j = 1; j < 2*n; j++) {
                
                if(i == n || j==n){
                    System.out.print("* ");
                }else if(i == 1 && j>= n){
                    System.out.print("* ");
                }else if(i == 7 && j<= n){
                    System.out.print("* ");
                }else if(j == 1 && i<= n){
                    System.out.print("* ");
                }else if(j == 7 && i>= n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
