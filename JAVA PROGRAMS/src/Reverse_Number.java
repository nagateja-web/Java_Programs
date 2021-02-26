import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		//1. using algorithm
		
		int rev = 0;
		while(num!=0){
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("Reversed number by using algorithm is: "+ rev);
		System.out.println("---------------------------------------------------------------");
		
		// Using string buffer class method
		System.out.println("Reverse a number by using Stringbuffer class");
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt();
		
		
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		StringBuffer reverse = sb.reverse();
		System.out.println("Reversed number is: "+reverse);
		
		System.out.println("----------------------------------------------------------------");
		
		
		//StringBulider class
		System.out.println("Resverse a number by using StringBuilder class");
		int number = sc.nextInt();
		StringBuilder sb1 = new StringBuilder();
		sb1.append(number);
		System.out.println(sb1.reverse());
		
		
	}

}
