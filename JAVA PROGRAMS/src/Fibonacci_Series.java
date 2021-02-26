import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		int fib = 0;
		System.out.print(" "+a+" "+" "+b);
		for(int i=2; i<=num; i++){
			fib = a+b;
			if(fib>num){
				break;
			}
			else{
			System.out.print(" "+fib);
			a=b;
			b=fib;
			}
		}

	}

}
