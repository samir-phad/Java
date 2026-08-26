import java.util.Scanner;
// check Given number is Prime or Not Prime

public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :- ");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 2; i < num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println(num + " is Prime Number.");
        }else{
            System.out.println(num + " is not Prime Number.");
        }
    }
}