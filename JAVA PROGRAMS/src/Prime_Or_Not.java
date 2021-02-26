import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime_Or_Not {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int num =Integer.parseInt(br.readLine());
		int count = 0;
		if(num>1){
			for(int i=1; i<=num; i++){
				if(num%i == 0){
					count++;
					//System.out.println(count);
				}}
				if(count == 2){
					System.out.println("It's a primt number");
				}
				else
					System.out.println("Not a prime number");
			}
		}

	}


