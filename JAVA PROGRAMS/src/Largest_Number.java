import java.util.Scanner;

public class Largest_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter a Second Number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter a Third Number: ");
		int c = sc.nextInt();
		
		//Approach-1
		
		/*if(a>b && a>c){
			System.out.println(a+" is largest number");
		}
		else if(b>a && b>c){
			System.out.println(b+" is largest number");
		}

		else{
			System.out.println(c+" is largest number");
		}
		*/
		//Approach-2 terynary operator
		
		int largest = a>b?a:b;
		int largest1 = c>largest?c:largest;
		System.out.println(largest1);
		
	}

}
