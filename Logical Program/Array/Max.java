public class Max {
    public static void main(String[] args) {
        int [] arr = {7, 1, 5, 9, 3, 2};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
