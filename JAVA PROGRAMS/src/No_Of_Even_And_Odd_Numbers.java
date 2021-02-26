import java.util.Scanner;

public class No_Of_Even_And_Odd_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int even_count = 0;
		int odd_count = 0;
		
		while(a>0){
			//int rem = a%10;
			if(a%2 == 0){
				even_count++;
			}
			else if(a%2 == 1){
				odd_count++;
			}
			a= a/10;
			
		}
		System.out.println("Even Count: "+even_count++);
		System.out.println("Odd Count: "+odd_count++);

	}

}
