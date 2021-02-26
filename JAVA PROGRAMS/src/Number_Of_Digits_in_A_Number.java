import java.util.Scanner;

public class Number_Of_Digits_in_A_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		// Using for loop
		for(int i=0; i<=num; i++){
			num = num/10;
			count++;
		}
		System.out.println(count+1);
		
		//Using while loop
		while(num!=0){
			num = num/10;
			count++;
		}
		System.out.println(count);

	}

}
