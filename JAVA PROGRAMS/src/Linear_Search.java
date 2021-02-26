import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter search element: ");
		int search_element = sc.nextInt();
		boolean flag = false;
		for(int i=0; i<=a.length; i++){
			if(search_element == a[i]){
				System.out.println("Search element found at "+i);
				flag = true;
				break;
			}}
		if(flag == false){
			System.out.println("No element found");
		}

	}

}
