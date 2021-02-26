
public class Even_odd {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int even = 0;
		int odd = 0;
		for(int i=1; i<=a.length-1;i++){
			if(a[i]%i == 0){
				System.out.println(a[i]+"is even");
				even++;
			}
			else
				System.out.println(a[i]+"is odd");
			odd++;
		}
		System.out.println("Even numbers in an array is: "+even);
		System.out.println("Odd numbers in an array is: "+odd);
	}

}
