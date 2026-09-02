import java.util.Arrays;

public class ProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {51, 62, 93, 32, 72, 20};
		int [] pro = new int[arr.length];
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			int num = arr[i];
			while (num != 0) {
				int temp = num % 10;
				count *= temp;
				num = num/10;
			}
			pro[i] = count;
			
		}
		System.out.println(Arrays.toString(pro));
	}
	

}
