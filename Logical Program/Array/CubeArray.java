import java.util.Arrays;

public class CubeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5, 6, 9, 3, 7, 2};
		int [] cube = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i] * arr[i] * arr[i];
			cube[i] = num ;
		}
		System.out.println(Arrays.toString(cube));
	}

}