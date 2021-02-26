import java.util.Scanner;

public class Sum_Of_Elements_In_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int[] a = new int[num];
		int sum = 0;
		int len = a.length;
		for(int i=0; i<=len-1;i++){
			System.out.println("Enter a " + i + " Index Value:");
			a[i] = sc.nextInt();
			sum = sum+a[i];
		}
		System.out.println("The sum of Elements in arrray is: "+sum);
	}

}
