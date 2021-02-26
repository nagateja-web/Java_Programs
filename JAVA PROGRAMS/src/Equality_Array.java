import java.util.Arrays;

public class Equality_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,5};
		boolean status = Arrays.equals(a, b);
		
		if(status == true){
			System.out.println("The two arrays are equal.");
		}
		else
			System.out.println("The two arrays are different.");
	}

}
