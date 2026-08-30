// 1 1 1 1 1 1 1
// 1 2 2 2 2 2 1
// 1 2 3 3 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 3 3 2 1 
// 1 2 2 2 2 2 1
// 1 1 1 1 1 1 1




class NumberStar{
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if(i == 1 || j == 7 || i == 7 || j == 1){
                    System.out.print("1");
                }else if(i == 2 || j == 6 || i == 6 || j ==2){
                    System.out.print("2");
                }else if(i == 3 || j == 5 || i == 5 || j ==3){
                    System.out.print("3");
                }else{
                    System.out.print("4");
                }
            }
            System.out.println();
        }
    }
}